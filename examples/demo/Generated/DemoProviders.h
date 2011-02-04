#import "ContentProvider.h"

@interface DemoProviders : NSObject {
	ContentProvider *fAllInventorsJSON;
	ContentProvider *fAllInventorsXML;
	ContentProvider *fStoredDate;
}

+ (DemoProviders *) sharedProviders;

- (ContentProvider *) providerForAllInventorsJSON;
- (ContentProvider *) providerForAllInventorsXML;
- (ContentProvider *) providerForError;
- (ContentProvider *) providerForDate;
- (ContentProvider *) providerForStoredDate;
- (ContentProvider *) providerForMyLogin;

@end
