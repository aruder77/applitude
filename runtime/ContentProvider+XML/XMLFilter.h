// © 2011 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "ContentFilter.h"
#import "TouchXML.h"

@interface XMLFilter : NSObject<ContentFilter> {
	CXMLDocument *fDocument;
	NSString *fXpathQuery;
}

+ (id) filter;

@property (nonatomic, copy) NSString *xpathQuery;

@end
