#import "ContentProvider.h"
#import "CustomViewController.h"
#import "InventionDetailViewController.h"
#import "InventorDetailViewController.h"
#import "InventorsViewController.h"
#import "ReferenceCellStylesViewController.h"
#import "ReferenceCustomCodeViewController.h"
#import "ReferenceEntityModelsViewController.h"
#import "ReferenceErrorHandlingViewController.h"
#import "ReferenceExpressionsViewController.h"
#import "ReferenceSectionCellForeachViewController.h"
#import "ReferenceViewController.h"

@interface DemoViews : NSObject {
}

+ (UITabBarController *) createTabs;
+ (InventorsViewController *) createInventorsWithInventors:(ContentProvider *)inventors;
+ (InventorDetailViewController *) createInventorDetailWithInventor:(ContentProvider *)inventor;
+ (InventionDetailViewController *) createInventionDetailWithInvention:(ContentProvider *)invention;
+ (ReferenceViewController *) createReference;
+ (ReferenceCellStylesViewController *) createReferenceCellStyles;
+ (ReferenceSectionCellForeachViewController *) createReferenceSectionCellForeach;
+ (ReferenceErrorHandlingViewController *) createReferenceErrorHandling;
+ (CustomViewController *) createCustomView;
+ (ReferenceCustomCodeViewController *) createReferenceCustomCode;
+ (ReferenceEntityModelsViewController *) createReferenceEntityModels;
+ (ReferenceExpressionsViewController *) createReferenceExpressions;


@end
