// © 2011 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <GHUnit/GHUnit.h>

#import "SimpleContentProvider.h"
#import "ContentProviderProtected.h"
#import "CommonFilters.h"

@interface CommonFiltersTest : GHTestCase {

}

@end

@implementation CommonFiltersTest

- (void) testFilterForKeyPath {
	NSArray *numbers = [NSArray arrayWithObjects:@"1", @"2", @"3", nil];
	NSMutableDictionary *dict1 = [NSMutableDictionary dictionary];
	[dict1 setValue:numbers forKey:@"numbers"];
	NSMutableDictionary *dict2 = [NSMutableDictionary dictionary];
	[dict2 setValue:dict1 forKey:@"hello"];

	ContentProvider *provider = [SimpleContentProvider providerWithContent:nil name:@"content"];
	[provider addFilter:[CommonFilters filterForKeyPath:@"hello.numbers" makeMutable:NO]];
	provider.content = dict2;

	GHAssertEquals(3, (int) [provider.content count], nil);
}

@end
