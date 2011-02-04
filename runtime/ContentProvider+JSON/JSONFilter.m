// © 2011 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "JSONFilter.h"

#import "CJSONDeserializer.h"

@implementation JSONFilter

- (id) filter:(id)content {
	NSError *error = nil;
	id object = [[CJSONDeserializer deserializer] deserialize:content error:&error];
	return (error == nil) ? object : error;
}

+ (id) filter {
	return [[[JSONFilter alloc] init] autorelease];
}

@end
