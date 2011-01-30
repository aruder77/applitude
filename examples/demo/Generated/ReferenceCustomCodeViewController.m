#import "ReferenceCustomCodeViewController.h"
#import "BoxCell.h"
#import "DemoProviders.h"
#import "DemoViews.h"
#import "SelectorAction.h"

@implementation ReferenceCustomCodeViewController

- (id) init {
	self = [super initWithStyle:UITableViewStylePlain];
	if (self != nil) {
		fBindings = [[BindingContext alloc] init];

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
		[fBindings bind:fDate property:@"content" to:cell.textLabel property:@"text"];
		[self cell:cell];
	}

	[self sectionWithTitle:@"ContentProvider (stored)"];
	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		[fBindings bind:fStoredDate property:@"content" to:cell.textLabel property:@"text"];
		[self cell:cell];
	}

	[self sectionWithTitle:@"Custom ViewControllers"];
	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Open CustomView";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(opencustomviewCellSelected:)];
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

- (void) opencustomviewCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createCustomView];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) dealloc {
	[fBindings release];
	[fDate release];
	[fStoredDate release];
	[super dealloc];
}

@end
