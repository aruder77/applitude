// © 2011 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "XMLFilter.h"

@implementation XMLFilter

- (id) filter:(id)content {
	[fDocument release];
	NSError *error = nil;
	// the document is retained by the filter because somebody has to retain the full document
	// the content provider itself might apply a filter, keeping only a sub-tree of the document
	fDocument = [[CXMLDocument alloc] initWithData:content options:0 error:&error];
	if (error == nil)
		return fDocument;
	else
		return error;
}

+ (id) filter {
	return [[[XMLFilter alloc] init] autorelease];
}

- (void) dealloc {
	[fDocument release];
	[super dealloc];
}


@end
