#import "BoxTableViewController.h"
#import "ContentProvider.h"

@interface TextViewViewController : BoxTableViewController {
	ContentProvider *fTxt;
}

- (id) initWithTxt:(ContentProvider *)txt;

@end
