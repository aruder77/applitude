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
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(jsonCellSelected:)];
		[self cell:cell];
	}

	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"XML";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(xmlCellSelected:)];
		[self cell:cell];
	}

	[self sectionWithTitle:@"Tables"];
	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Cell styles";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(cellstylesCellSelected:)];
		[self cell:cell];
	}

	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"cell foreach";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(cellforeachCellSelected:)];
		[self cell:cell];
	}

	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"section + cell foreach";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(sectioncellforeachCellSelected:)];
		[self cell:cell];
	}

	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Error handling";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(errorhandlingCellSelected:)];
		[self cell:cell];
	}

	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Custom code hooks";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(customcodehooksCellSelected:)];
		[self cell:cell];
	}

	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Entity models";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(entitymodelsCellSelected:)];
		[self cell:cell];
	}

	[self sectionWithTitle:@"Tests"];
	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Expressions";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(expressionsCellSelected:)];
		[self cell:cell];
	}
}

- (void) jsonCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createInventorsWithInventors:[[DemoProviders sharedProviders] providerForAllInventorsJSON]];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) xmlCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createInventorsWithInventors:[[DemoProviders sharedProviders] providerForAllInventorsXML]];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) cellstylesCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createReferenceCellStyles];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) cellforeachCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createInventorsWithInventors:[[DemoProviders sharedProviders] providerForAllInventorsJSON]];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) sectioncellforeachCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createReferenceSectionCellForeach];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) errorhandlingCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createReferenceErrorHandling];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) customcodehooksCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createReferenceCustomCode];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) entitymodelsCellSelected:(BoxCell *)cell {
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
