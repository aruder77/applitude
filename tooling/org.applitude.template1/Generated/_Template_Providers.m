#import "_Template_Providers.h"

@implementation _Template_Providers

static _Template_Providers *sharedProviders = nil;

+ (_Template_Providers *) sharedProviders {
	@synchronized(self) {
		if (sharedProviders == nil)
			sharedProviders = [[self alloc] init];
	}
	return sharedProviders;
}

@end
