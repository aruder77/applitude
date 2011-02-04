#import "BoxTableViewController.h"
#import "ContentProvider.h"

@interface InventorsViewController : BoxTableViewController {
	ContentProvider *fInventors;
}

- (id) initWithInventors:(ContentProvider *)inventors;

@end
