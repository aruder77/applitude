#import "BindingContext.h"
#import "BoxTableViewController.h"
#import "ContentProvider.h"

@interface ReferenceCustomCodeViewController : BoxTableViewController {
	BindingContext *fBindings;
	ContentProvider *fDate;
	ContentProvider *fStoredDate;
}

- (id) init;

@end
