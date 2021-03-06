//
// Copyright 2009-2010 Facebook, 2010 Ralf Ebert
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

#import "UIView+Coordinates.h"

@implementation UIView (Coordinates)

- (CGFloat) left {
	return self.frame.origin.x;
}

- (void) setLeft:(CGFloat)x {
	CGRect frame = self.frame;
	frame.origin.x = x;
	self.frame = frame;
}

- (CGFloat) top {
	return self.frame.origin.y;
}

- (void) setTop:(CGFloat)y {
	CGRect frame = self.frame;
	frame.origin.y = y;
	self.frame = frame;
}

- (CGFloat) right {
	return self.frame.origin.x + self.frame.size.width;
}

- (void) setRight:(CGFloat)right {
	CGRect frame = self.frame;
	frame.origin.x = right - frame.size.width;
	self.frame = frame;
}

- (CGFloat) bottom {
	return self.frame.origin.y + self.frame.size.height;
}

- (void) setBottom:(CGFloat)bottom {
	CGRect frame = self.frame;
	frame.origin.y = bottom - frame.size.height;
	self.frame = frame;
}

- (CGFloat) width {
	return self.frame.size.width;
}

- (void) setWidth:(CGFloat)width {
	CGRect frame = self.frame;
	frame.size.width = width;
	self.frame = frame;
}

- (CGFloat) height {
	return self.frame.size.height;
}

- (void) setHeight:(CGFloat)height {
	CGRect frame = self.frame;
	frame.size.height = height;
	self.frame = frame;
}

- (void) centerTo:(CGRect)frame size:(CGSize)size {
	self.frame = CGRectMake(floor((frame.size.width - size.width) / 2),
							floor((frame.size.height - size.height) / 2),
							size.width,
							size.height);
}

- (CGFloat) ttScreenX {
	CGFloat x = 0;
	for (UIView* view = self; view; view = view.superview) {
		x += view.frame.origin.x;
	}
	return x;
}

- (CGFloat) ttScreenY {
	CGFloat y = 0;
	for (UIView* view = self; view; view = view.superview) {
		y += view.frame.origin.y;
	}
	return y;
}

@end
