// © 2011 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "CustomViewController.h"

@implementation CustomViewController

- (void) loadView {
	UIButton *button =  [UIButton buttonWithType:UIButtonTypeRoundedRect];
	[button setTitle:@"Button in custom view" forState:UIControlStateNormal];
	self.view = button;
}

@end
