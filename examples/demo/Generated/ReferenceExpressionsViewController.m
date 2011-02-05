#import "ReferenceExpressionsViewController.h"
#import "BoxCell.h"
#import "DemoProviders.h"

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
}

- (UITableViewCell *) inventorCell:(id)inventor {
	BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleSubtitle reuseIdentifier:nil] autorelease];
	cell.textLabel.text = [inventor valueForKey:@"name"];
	cell.detailTextLabel.text = [NSString stringWithFormat:@"%@%@%@", [[inventor valueForKey:@"name"] stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding], @", ", [[inventor valueForKey:@"name"] stringByReplacingOccurrencesOfString:@" " withString:@"_"]];
	cell.data = inventor;
	return cell;
}

- (void) dealloc {
	[fInventors release];
	[super dealloc];
}

@end
