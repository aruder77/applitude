#import "ReferenceSectionCellForeachViewController.h"
#import "BoxCell.h"
#import "DemoProviders.h"
#import "Section.h"

@implementation ReferenceSectionCellForeachViewController

- (id) init {
	self = [super initWithStyle:UITableViewStylePlain];
	if (self != nil) {
		fInventors = [[[DemoProviders sharedProviders] providerForAllInventorsJSON] retain];
	}
	return self;
}

- (void) update {
	[fInventors request];
	self.title = @"section/cell foreach";

	[self sections:@selector(invSection:) forContentProvider:fInventors];
}

- (Section *) invSection:(id)inv {
	Section *section = [self sectionWithTitle:[inv valueForKey:@"name"]];
	{
		[self cells:@selector(inventionCell:) forList:[inv valueForKey:@"inventions"]];
	}
	return section;
}

- (UITableViewCell *) inventionCell:(id)invention {
	BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
	cell.textLabel.text = [invention valueForKey:@"name"];
	cell.data = invention;
	return cell;
}

- (void) dealloc {
	[fInventors release];
	[super dealloc];
}

@end
