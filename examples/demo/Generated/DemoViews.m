#import "DemoViews.h"
#import "BrandedUIFactory.h"
#import "DemoProviders.h"

@implementation DemoViews

+ (UITabBarController *) createTabs {
	UITabBarController *tabController = [[[UITabBarController alloc] init] autorelease];

	UINavigationController *tab1 = [BrandedUIFactory createUINavigationControllerWithRootViewController:[DemoViews createInventorsWithInventors:[[DemoProviders sharedProviders] providerForAllInventorsJSON]]];
	tab1.tabBarItem.title = @"Inventors";
	tab1.tabBarItem.image = [UIImage imageNamed:@"lightbulb.png"];

	UINavigationController *tab2 = [BrandedUIFactory createUINavigationControllerWithRootViewController:[DemoViews createReference]];
	tab2.tabBarItem.title = @"Reference";
	tab2.tabBarItem.image = [UIImage imageNamed:@"book.png"];

	tabController.viewControllers = [NSArray arrayWithObjects:tab1, tab2, nil];

	return tabController;
}

+ (InventorsViewController *) createInventorsWithInventors:(ContentProvider *)inventors {
	return [[[InventorsViewController alloc] initWithInventors:inventors] autorelease];
}

+ (InventorDetailViewController *) createInventorDetailWithInventor:(ContentProvider *)inventor {
	return [[[InventorDetailViewController alloc] initWithInventor:inventor] autorelease];
}

+ (InventionDetailViewController *) createInventionDetailWithInvention:(ContentProvider *)invention {
	return [[[InventionDetailViewController alloc] initWithInvention:invention] autorelease];
}

+ (ReferenceViewController *) createReference {
	return [[[ReferenceViewController alloc] init] autorelease];
}

+ (ReferenceCellStylesViewController *) createReferenceCellStyles {
	return [[[ReferenceCellStylesViewController alloc] init] autorelease];
}

+ (ReferenceCellForeachViewController *) createReferenceCellForeach {
	return [[[ReferenceCellForeachViewController alloc] init] autorelease];
}

+ (ReferenceSectionCellForeachViewController *) createReferenceSectionCellForeach {
	return [[[ReferenceSectionCellForeachViewController alloc] init] autorelease];
}

+ (ReferenceErrorHandlingViewController *) createReferenceErrorHandling {
	return [[[ReferenceErrorHandlingViewController alloc] init] autorelease];
}

+ (CustomViewController *) createCustomView {
	return [[[CustomViewController alloc] init] autorelease];
}

+ (ReferenceCustomCodeViewController *) createReferenceCustomCode {
	return [[[ReferenceCustomCodeViewController alloc] init] autorelease];
}

+ (ReferenceEntityModelsViewController *) createReferenceEntityModels {
	return [[[ReferenceEntityModelsViewController alloc] init] autorelease];
}

@end
