#import "DemoProviders.h"
#import "DateContentProvider.h"
#import "JSONFilter.h"
#import "Login.h"
#import "SimpleContentProvider.h"
#import "UrlContentProvider.h"
#import "XMLFilter.h"

@implementation DemoProviders

static DemoProviders *sharedProviders = nil;

+ (DemoProviders *) sharedProviders {
	@synchronized(self) {
		if (sharedProviders == nil)
			sharedProviders = [[self alloc] init];
	}
	return sharedProviders;
}

- (ContentProvider *) providerForAllInventorsJSON {
	if (!fAllInventorsJSON) {
		UrlContentProvider *provider = [[UrlContentProvider alloc] initWithURL:[NSURL URLWithString:@"http://applitude.org/demo/inventors.json"]];
		JSONFilter *filter = [JSONFilter filter];
		[provider addFilter:filter];
		fAllInventorsJSON = provider;
	}
	return fAllInventorsJSON;
}

- (ContentProvider *) providerForAllInventorsXML {
	if (!fAllInventorsXML) {
		UrlContentProvider *provider = [[UrlContentProvider alloc] initWithURL:[NSURL URLWithString:@"http://applitude.org/demo/inventors.xml"]];
		XMLFilter *filter = [XMLFilter filter];
		filter.xpathQuery = @"/inventors/inventor";
		[provider addFilter:filter];
		fAllInventorsXML = provider;
	}
	return fAllInventorsXML;
}

- (ContentProvider *) providerForError {
	UrlContentProvider *provider = [[UrlContentProvider alloc] initWithURL:[NSURL URLWithString:@"http://localhost/none.json"]];
	JSONFilter *filter = [JSONFilter filter];
	[provider addFilter:filter];
	return [provider autorelease];
}

- (ContentProvider *) providerForDate {
	DateContentProvider *provider = [[DateContentProvider alloc] init];
	return [provider autorelease];
}

- (ContentProvider *) providerForStoredDate {
	if (!fStoredDate) {
		DateContentProvider *provider = [[DateContentProvider alloc] init];
		fStoredDate = provider;
	}
	return fStoredDate;
}

- (ContentProvider *) providerForMyLogin {
	SimpleContentProvider *provider = [[SimpleContentProvider alloc] initWithContent:[[[Login alloc] init] autorelease] name:@"MyLogin"];
	return [provider autorelease];
}

@end
