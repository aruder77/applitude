#import "InventorsViewController.h"
#import "DemoViews.h"
#import "ImageCell.h"
#import "SelectorAction.h"
#import "SimpleContentProvider.h"

@implementation InventorsViewController

- (id) initWithInventors:(ContentProvider *)inventors {
	self = [super initWithStyle:UITableViewStylePlain];
	if (self != nil) {
		fInventors = [inventors retain];
	}
	return self;
}

- (void) update {
	[fInventors request];
	self.title = @"Inventors";

	[self section];
	{
		[self cells:@selector(inventorCell:) forContentProvider:fInventors];
	}
}

- (UITableViewCell *) inventorCell:(id)inventor {
	ImageCell *cell = [[[ImageCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
	cell.textLabel.text = [inventor valueForKey:@"name"];
	cell.imageUrl = [inventor valueForKey:@"imageUrl"];
	cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
	cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(inventorCellSelected:)];
	cell.data = inventor;
	return cell;
}

- (void) inventorCellSelected:(BoxCell *)cell {
	id inventor = cell.data;
	UIViewController *controller = [DemoViews createInventorDetailWithInventor:[SimpleContentProvider providerWithContent:inventor name:@"inventor"]];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) dealloc {
	[fInventors release];
	[super dealloc];
}

@end
