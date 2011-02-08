// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "NSDate+Utils.h"

@implementation NSDate (Utils)

- (NSDate *) roundMinutes:(int)minutes {
	int comp = NSYearCalendarUnit | NSMonthCalendarUnit | NSDayCalendarUnit | NSHourCalendarUnit | NSMinuteCalendarUnit;
	NSCalendar *calendar = [NSCalendar currentCalendar];
	NSDateComponents *dateComponents = [calendar components:comp fromDate:self];
	int diff = ([dateComponents minute] % minutes);
	if (diff > 0) {
		diff = minutes - diff;
	}
	NSDate *roundedDate = [[calendar dateFromComponents:dateComponents] addTimeInterval:60*diff];
	return roundedDate;
}

- (BOOL) isSameDate:(NSDate *)date {
	NSCalendar *cal = [NSCalendar currentCalendar];
	NSDateComponents *comp1 = [cal components:NSYearCalendarUnit|NSMonthCalendarUnit|NSDayCalendarUnit fromDate:self];
	NSDateComponents *comp2 = [cal components:NSYearCalendarUnit|NSMonthCalendarUnit|NSDayCalendarUnit fromDate:date];
	return ([comp1 year] == [comp2 year] && [comp1 month] == [comp2 month] && [comp1 day] == [comp2 day]);
}

- (BOOL) isToday {
	return [self isSameDate:[NSDate date]];
}

+ (NSDate *) dateForYear:(int)year month:(int)month day:(int)day hour:(int)hour minute:(int)minute {
	NSDateComponents *comps = [[NSDateComponents alloc] init];
	[comps setYear:year];
	[comps setMonth:month];
	[comps setDay:day];
	[comps setHour:hour];
	[comps setMinute:minute];
	[comps setSecond:0];
	NSDate *date = [[NSCalendar currentCalendar] dateFromComponents:comps];
	[comps release];
	return date;
}

- (NSString *) iso8601String {
	NSTimeZone *timezone = [NSTimeZone localTimeZone];

	NSDateFormatter* formatter = [[NSDateFormatter alloc] init];
	formatter.locale = [[[NSLocale alloc] initWithLocaleIdentifier:@"en_US"] autorelease];
	[formatter setTimeZone:timezone];
	[formatter setDateFormat:@"yyyy-MM-dd'T'HH:mm:ss"];

	int minutesFromUTC = [timezone secondsFromGMT] / 60;

	NSMutableString *result = [NSMutableString stringWithString:[formatter stringFromDate:self]];
	if (minutesFromUTC == 0)
		[result appendString:@"Z"];
	else
		[result appendFormat:@"%@%02d:%02d", (minutesFromUTC < 0 ? @"-" : @"+"), abs(minutesFromUTC) / 60, abs(minutesFromUTC) % 60];

	[formatter release];
	return [NSString stringWithString:result];
}

@end
