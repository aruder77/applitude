// © 2011 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <GHUnit/GHUnit.h>

#import "JSONFilter.h"
#import "XMLFilter.h"
#import "ContentProvider.h"
#import "SimpleContentProvider.h"
#import "ContentProviderProtected.h"
#import "TouchXML.h"
#import "CommonFilters.h"

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

- (void) testXMLFilter {
	ContentProvider *provider = [SimpleContentProvider providerWithContent:nil name:@"content"];
	[provider addFilter:[XMLFilter filter]];
	provider.content = [@"<numbers><number value='1'/><number value='2'/><number value='3'/></numbers>" dataUsingEncoding:NSUTF8StringEncoding];
	GHAssertTrue([provider.content isKindOfClass:[CXMLDocument class]], nil);
	CXMLDocument *doc = provider.content;
	GHAssertEqualStrings(@"numbers", [[doc rootElement] name], nil);

	SimpleContentProvider *nested = [SimpleContentProvider providerWithContent:nil name:@"dep"];
	[nested addDependency:provider];
	[nested addFilter:[CommonFilters filterForKeyPath:@"numbers.number"]];
	[nested request];

	GHAssertEquals(3, (int)[nested.content count], nil);
}

@end
