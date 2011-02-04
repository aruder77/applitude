#import "_Template_ViewController.h"
#import "BoxCell.h"

@implementation _Template_ViewController

- (id) init {
	self = [super initWithStyle:UITableViewStylePlain];
	if (self != nil) {
	}
	return self;
}

- (void) update {
	self.title = @"_Template_";

	[self section];
	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Cell";
		[self cell:cell];
	}
}

- (void) dealloc {
	[super dealloc];
}

@end
