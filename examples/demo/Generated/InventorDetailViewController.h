#import "BoxTableViewController.h"
#import "ContentProvider.h"

@interface InventorDetailViewController : BoxTableViewController {
	ContentProvider *fInventor;
}

- (id) initWithInventor:(ContentProvider *)inventor;

@end
