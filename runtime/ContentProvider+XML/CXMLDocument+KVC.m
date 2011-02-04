// © 2010 Heiko Behrens, itemis AG
// © 2011 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "TouchXML.h"

@implementation CXMLElement (KVC)

- (NSArray*) childElements {
	NSMutableArray *result = [NSMutableArray arrayWithArray: 0];
	for(CXMLNode *node in self.children)
		if(node.kind == XML_ELEMENT_NODE)
			[result addObject:node];
	return result;
}

- (id) valueForKey:(NSString *)key {
	CXMLNode *attribute = [self attributeForName:key];
	if (attribute) {
		return [attribute stringValue];
	}
	NSArray *elements = [self elementsForName:key];
	switch (elements.count) {
		case 0:
			return [super valueForKey:key];
		case 1: {
			CXMLElement *onlyElement = [elements objectAtIndex:0];
			if([onlyElement childElements].count == 0)
				return [onlyElement.stringValue stringByTrimmingCharactersInSet:
						[NSCharacterSet whitespaceAndNewlineCharacterSet]];
			else
				return onlyElement;
		}
		default:
			return elements;
	}
}

@end

@implementation CXMLDocument (KVC)

- (id) valueForKey:(NSString *)key {
	if ([self.rootElement.name isEqual:key])
		return self.rootElement;
	else
		return [super valueForKey:key];
}

@end
