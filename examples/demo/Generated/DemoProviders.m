#import "DemoProviders.h"
#import "DateContentProvider.h"
#import "JSONFilter.h"
#import "Login.h"
#import "SimpleContentProvider.h"
#import "UrlContentProvider.h"

@implementation DemoProviders

static DemoProviders *sharedProviders = nil;

+ (DemoProviders *) sharedProviders {
	@synchronized(self) {
		if (sharedProviders == nil)
			sharedProviders = [[self alloc] init];
	}
	return sharedProviders;
}

- (ContentProvider *) providerForAllInventors {
	if (!fAllInventors) {
		UrlContentProvider *provider = [[UrlContentProvider alloc] initWithURL:[NSURL URLWithString:@"http://applitude.org/demo/inventors.json"]];
		[provider addFilter:[JSONFilter filter]];
		fAllInventors = provider;
	}
	return fAllInventors;
}

- (ContentProvider *) providerForError {
	UrlContentProvider *provider = [[UrlContentProvider alloc] initWithURL:[NSURL URLWithString:@"http://localhost/none.json"]];
	[provider addFilter:[JSONFilter filter]];
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
