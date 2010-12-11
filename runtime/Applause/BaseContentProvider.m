// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "BaseContentProvider.h"

#import "ContentProviderProtected.h"

@implementation BaseContentProvider

@synthesize content = fContent;

- (id) content {
	return ([fContent isKindOfClass:[NSError class]]) ? nil : fContent;
}

- (void) setContent:(id)content {
	if (content != fContent) {
		[fContent release];
		fContent = [[self processContent:content] retain];
	}
}

- (NSError *) error {
	return ([fContent isKindOfClass:[NSError class]]) ? fContent : nil;
}

- (void) setError:(NSError *)error {
	if (error != fContent) {
		[self willChangeValueForKey:@"content"];
		[fContent release];
		fContent = [error retain];
		[self didChangeValueForKey:@"content"];
	}
}

- (void) clear {
	self.content = nil;
}

- (void) dealloc {
	[fContent release];
	[super dealloc];
}

@end