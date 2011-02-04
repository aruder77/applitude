// © 2011 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <GHUnit/GHUnit.h>

#import "JSONFilter.h"
#import "ContentProvider.h"
#import "SimpleContentProvider.h"
#import "ContentProviderProtected.h"

@interface SerializationFilterTest : GHTestCase {

}

@end

@implementation SerializationFilterTest

- (void) testJSONFilter {
	ContentProvider *provider = [SimpleContentProvider providerWithContent:nil name:@"content"];
	[provider addFilter:[JSONFilter filter]];
	provider.content = [@"[1,2,3]" dataUsingEncoding:NSUTF8StringEncoding];
	GHAssertTrue([provider.content isKindOfClass:[NSArray class]], nil);
	GHAssertEquals(3, (int) [provider.content count], nil);
}

@end
