#import "BoxTableViewController.h"
#import "ContentProvider.h"

@interface InventionDetailViewController : BoxTableViewController {
	ContentProvider *fInventor;
	ContentProvider *fInvention;
}

- (id) initWithInventor:(ContentProvider *)inventor invention:(ContentProvider *)invention;

@end
