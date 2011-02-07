#import "ReferenceCustomCodeViewController.h"
#import "BoxCell.h"
#import "DemoProviders.h"
#import "DemoViews.h"
#import "SelectorAction.h"

@implementation ReferenceCustomCodeViewController

- (id) init {
	self = [super initWithStyle:UITableViewStylePlain];
	if (self != nil) {
		fDate = [[[DemoProviders sharedProviders] providerForDate] retain];
		fStoredDate = [[[DemoProviders sharedProviders] providerForStoredDate] retain];
	}
	return self;
}

- (void) update {
	[fDate request];
	[fStoredDate request];
	self.title = @"Custom code hooks";

	[self sectionWithTitle:@"ContentProvider"];
	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = fDate.content;
		[self cell:cell];
	}

	[self sectionWithTitle:@"ContentProvider (stored)"];
	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = fStoredDate.content;
		[self cell:cell];
	}

	[self sectionWithTitle:@"Custom ViewControllers"];
	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Open CustomView";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(openCustomViewCellSelected:)];
		[self cell:cell];
	}

	[self sectionWithTitle:@"Custom Actions"];
	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Open alert";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(openAlertWithCell:)];
		[self cell:cell];
	}
}

- (void) openCustomViewCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createCustomView];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) dealloc {
	[fDate release];
	[fStoredDate release];
	[super dealloc];
}

@end
