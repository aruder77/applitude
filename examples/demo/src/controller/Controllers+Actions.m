// © 2011 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "Controllers+Actions.h"

@implementation ReferenceCustomCodeViewController (Actions)

- (void) openAlertWithCell:(UITableViewCell *)cell {
	UIAlertView *alert = [[UIAlertView alloc] initWithTitle:nil message:@"Alert!" delegate:nil cancelButtonTitle:@"Cancel" otherButtonTitles:@"Ok", nil];
	[alert show];
	[alert release];
}

@end
