#import "ReferenceExpressionsViewController.h"
#import "BoxCell.h"
#import "ContentProvider+Nested.h"
#import "DemoProviders.h"
#import "DemoViews.h"
#import "Section.h"
#import "SelectorAction.h"
#import "SimpleContentProvider.h"

@implementation ReferenceExpressionsViewController

- (id) init {
	self = [super initWithStyle:UITableViewStyleGrouped];
	if (self != nil) {
		fInventors = [[[DemoProviders sharedProviders] providerForAllInventorsJSON] retain];
	}
	return self;
}

- (void) update {
	[fInventors request];
	self.title = @"Expressions";

	[self sectionWithTitle:[NSString stringWithFormat:@"%@", @"String manipulation"]];
	{
		[self cells:@selector(inventorCell:) forContentProvider:fInventors];
	}

	[self sectionWithTitle:@"Collection literals"];
	{
		[self cells:@selector(textCell:) forContentProvider:[SimpleContentProvider providerWithContent:[NSArray arrayWithObjects:@"1", [NSString stringWithFormat:@"%@%@%@", @"2", @"2", @"2"], @"3", nil] name:@""]];
	}

	[self sectionWithTitle:@"String split"];
	{
		[self cells:@selector(numberCell:) forContentProvider:[SimpleContentProvider providerWithContent:[@"1,2,3" componentsSeparatedByString:@","] name:@""]];
	}

	[self sections:@selector(invSection:) forContentProvider:fInventors];
}

- (Section *) invSection:(id)inv {
	Section *section = [self section];
	{
		[self cells:@selector(nameCell:) forList:[[inv valueForKey:@"name"] componentsSeparatedByString:@" "]];
	}
	return section;
}

- (UITableViewCell *) inventorCell:(id)inventor {
	BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleSubtitle reuseIdentifier:nil] autorelease];
	cell.textLabel.text = [inventor valueForKey:@"name"];
	cell.detailTextLabel.text = [NSString stringWithFormat:@"%@%@%@", [[inventor valueForKey:@"name"] stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding], @", ", [[inventor valueForKey:@"name"] stringByReplacingOccurrencesOfString:@" " withString:@"_"]];
	cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
	cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(inventorCellSelected:)];
	cell.data = inventor;
	return cell;
}

- (UITableViewCell *) textCell:(id)text {
	BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
	cell.textLabel.text = [NSString stringWithFormat:@"%@%@%@", text, @"/", text];
	cell.data = text;
	return cell;
}

- (UITableViewCell *) numberCell:(id)number {
	BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
	cell.textLabel.text = number;
	cell.data = number;
	return cell;
}

- (UITableViewCell *) nameCell:(id)name {
	BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
	cell.textLabel.text = name;
	cell.data = name;
	return cell;
}

- (void) inventorCellSelected:(BoxCell *)cell {
	id inventor = cell.data;
	UIViewController *controller = [DemoViews createTextViewWithTxt:[ContentProvider nestedContentProviderWithContentProvider:[SimpleContentProvider providerWithContent:inventor name:@"inventor"] keyPath:@"name"]];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) dealloc {
	[fInventors release];
	[super dealloc];
}

@end
