#import "ReferenceErrorHandlingViewController.h"
#import "BoxCell.h"
#import "DemoProviders.h"
#import "Section.h"

@implementation ReferenceErrorHandlingViewController

- (id) init {
	self = [super initWithStyle:UITableViewStyleGrouped];
	if (self != nil) {
		fInventors = [[[DemoProviders sharedProviders] providerForError] retain];
	}
	return self;
}

- (void) update {
	[fInventors request];
	self.title = @"Error handling";

	[self section];
	{
		[self cells:@selector(inventor2Cell:) forContentProvider:fInventors];
	}

	[self sections:@selector(inventorSection:) forContentProvider:fInventors];
}

- (Section *) inventorSection:(id)inventor {
	Section *section = [self sectionWithTitle:[inventor valueForKey:@"name"]];
	{
		[self cells:@selector(inventionCell:) forList:[inventor valueForKey:@"inventions"]];
	}
	return section;
}

- (UITableViewCell *) inventor2Cell:(id)inventor2 {
	BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
	cell.textLabel.text = [inventor2 valueForKey:@"name"];
	cell.data = inventor2;
	return cell;
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
