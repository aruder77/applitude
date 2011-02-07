#import "ReferenceViewController.h"
#import "BoxCell.h"
#import "DemoProviders.h"
#import "DemoViews.h"
#import "SelectorAction.h"

@implementation ReferenceViewController

- (id) init {
	self = [super initWithStyle:UITableViewStylePlain];
	if (self != nil) {
	}
	return self;
}

- (void) update {
	self.title = @"Reference";
	self.navigationItem.titleView = [[[UIImageView alloc] initWithImage:[UIImage imageNamed:@"applitude.png"]] autorelease];

	[self sectionWithTitle:@"Content Providers"];
	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"JSON";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(jSONCellSelected:)];
		[self cell:cell];
	}

	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"XML";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(xMLCellSelected:)];
		[self cell:cell];
	}

	[self sectionWithTitle:@"Tables"];
	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Cell styles";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(cellStylesCellSelected:)];
		[self cell:cell];
	}

	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"cell foreach";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(cellForeachCellSelected:)];
		[self cell:cell];
	}

	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"section + cell foreach";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(sectionCellForeachCellSelected:)];
		[self cell:cell];
	}

	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Error handling";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(errorHandlingCellSelected:)];
		[self cell:cell];
	}

	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Custom code hooks";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(customCodeHooksCellSelected:)];
		[self cell:cell];
	}

	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Entity models and bindings";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(entityModelsAndBindingsCellSelected:)];
		[self cell:cell];
	}

	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Expressions";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(expressionsCellSelected:)];
		[self cell:cell];
	}
}

- (void) jSONCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createInventorsWithInventors:[[DemoProviders sharedProviders] providerForAllInventorsJSON]];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) xMLCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createInventorsWithInventors:[[DemoProviders sharedProviders] providerForAllInventorsXML]];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) cellStylesCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createReferenceCellStyles];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) cellForeachCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createInventorsWithInventors:[[DemoProviders sharedProviders] providerForAllInventorsJSON]];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) sectionCellForeachCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createReferenceSectionCellForeach];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) errorHandlingCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createReferenceErrorHandling];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) customCodeHooksCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createReferenceCustomCode];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) entityModelsAndBindingsCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createReferenceEntityModels];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) expressionsCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createReferenceExpressions];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) dealloc {
	[super dealloc];
}

@end
