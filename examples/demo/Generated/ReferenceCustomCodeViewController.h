#import "BoxTableViewController.h"
#import "ContentProvider.h"

@interface ReferenceCustomCodeViewController : BoxTableViewController {
	ContentProvider *fDate;
	ContentProvider *fStoredDate;
}

- (id) init;

@end
