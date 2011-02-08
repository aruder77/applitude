#import "InventionDetailViewController.h"
#import "BoxCell.h"

@implementation InventionDetailViewController

- (id) initWithInventor:(ContentProvider *)inventor invention:(ContentProvider *)invention {
	self = [super initWithStyle:UITableViewStyleGrouped];
	if (self != nil) {
		fInventor = [inventor retain];
		fInvention = [invention retain];
	}
	return self;
}

- (void) update {
	[fInventor request];
	[fInvention request];
	self.title = [fInvention.content valueForKey:@"name"];

	[self section];
	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleValue2 reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Inventor";
		cell.detailTextLabel.text = [fInventor.content valueForKey:@"name"];
		[self cell:cell];
	}

	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleValue2 reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Invention";
		cell.detailTextLabel.text = [fInvention.content valueForKey:@"name"];
		[self cell:cell];
	}
}

- (void) dealloc {
	[fInventor release];
	[fInvention release];
	[super dealloc];
}

@end
