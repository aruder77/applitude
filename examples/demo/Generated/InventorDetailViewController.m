#import "InventorDetailViewController.h"
#import "BoxCell.h"
#import "ContentProvider+Nested.h"
#import "DemoViews.h"
#import "SelectorAction.h"
#import "SimpleContentProvider.h"

@implementation InventorDetailViewController

- (id) initWithInventor:(ContentProvider *)inventor {
	self = [super initWithStyle:UITableViewStyleGrouped];
	if (self != nil) {
		fInventor = [inventor retain];
	}
	return self;
}

- (void) update {
	[fInventor request];
	self.title = [fInventor.content valueForKey:@"name"];

	[self section];
	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleValue2 reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Name";
		cell.detailTextLabel.text = [NSString stringWithFormat:@"%@%@%@%@", [fInventor.content valueForKey:@"name"], @" (", [fInventor.content valueForKey:@"name"], @")"];
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(nameCellSelected:)];
		[self cell:cell];
	}

	[self sectionWithTitle:@"Inventions"];
	{
		[self cells:@selector(inventionCell:) forContentProvider:[ContentProvider nestedContentProviderWithContentProvider:fInventor keyPath:@"inventions"]];
	}
}

- (UITableViewCell *) inventionCell:(id)invention {
	BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
	cell.textLabel.text = [invention valueForKey:@"name"];
	cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
	cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(inventionCellSelected:)];
	cell.data = invention;
	return cell;
}

- (void) nameCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createInventorDetailWithInventor:fInventor];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) inventionCellSelected:(BoxCell *)cell {
	id invention = cell.data;
	UIViewController *controller = [DemoViews createInventionDetailWithInvention:[SimpleContentProvider providerWithContent:invention name:@"invention"]];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) dealloc {
	[fInventor release];
	[super dealloc];
}

@end
