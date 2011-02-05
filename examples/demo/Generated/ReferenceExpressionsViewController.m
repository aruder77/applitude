#import "ReferenceExpressionsViewController.h"
#import "BoxCell.h"
#import "DemoProviders.h"

@implementation ReferenceExpressionsViewController

- (id) init {
	self = [super initWithStyle:UITableViewStyleGrouped];
	if (self != nil) {
		fInventors = [[[DemoProviders sharedProviders] providerForAllInventorsJSON] retain];
	}
	return self;
}

- (void) update {
	[fInventors request];
	self.title = @"Expressions";

	[self sectionWithTitle:[NSString stringWithFormat:@"%@", @"String concat"]];
	{
		[self cells:@selector(inventorCell:) forContentProvider:fInventors];
	}
}

- (UITableViewCell *) inventorCell:(id)inventor {
	BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
	cell.textLabel.text = [NSString stringWithFormat:@"%@%@%@%@", [inventor valueForKey:@"name"], @" (", [inventor valueForKey:@"name"], @")"];
	cell.data = inventor;
	return cell;
}

- (void) dealloc {
	[fInventors release];
	[super dealloc];
}

@end
