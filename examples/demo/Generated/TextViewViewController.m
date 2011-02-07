#import "TextViewViewController.h"
#import "BoxCell.h"

@implementation TextViewViewController

- (id) initWithTxt:(ContentProvider *)txt {
	self = [super initWithStyle:UITableViewStylePlain];
	if (self != nil) {
		fTxt = [txt retain];
	}
	return self;
}

- (void) update {
	[fTxt request];
	self.title = fTxt.content;

	[self section];
	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = fTxt.content;
		[self cell:cell];
	}
}

- (void) dealloc {
	[fTxt release];
	[super dealloc];
}

@end
