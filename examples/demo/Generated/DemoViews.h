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
#import "TextViewViewController.h"

@interface DemoViews : NSObject {
}

+ (UITabBarController *) createTabs;
+ (InventorsViewController *) createInventorsWithInventors:(ContentProvider *)inventors;
+ (InventorDetailViewController *) createInventorDetailWithInventor:(ContentProvider *)inventor;
+ (InventionDetailViewController *) createInventionDetailWithInventor:(ContentProvider *)inventor invention:(ContentProvider *)invention;
+ (ReferenceViewController *) createReference;
+ (ReferenceCellStylesViewController *) createReferenceCellStyles;
+ (ReferenceSectionCellForeachViewController *) createReferenceSectionCellForeach;
+ (ReferenceErrorHandlingViewController *) createReferenceErrorHandling;
+ (CustomViewController *) createCustomView;
+ (ReferenceCustomCodeViewController *) createReferenceCustomCode;
+ (ReferenceEntityModelsViewController *) createReferenceEntityModels;
+ (TextViewViewController *) createTextViewWithTxt:(ContentProvider *)txt;
+ (ReferenceExpressionsViewController *) createReferenceExpressions;

@end
