package zadaci_23_08_2016;

public class Time {
	// data fields hour, minute, and second that represent a time
	long hour;
	long minute;
	long second;

	// default constructor that creates Time object with current time
	Time() {
		setTime(System.currentTimeMillis());
	}

	// constructor that allows user to set the elapsed time in milliseconds
	Time(long elapsedTime) {
		setTime(elapsedTime);
	}

	// constructor that allows user to set the values of hours, minutes and
	// seconds
	Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	// getter method for hour data field
	public long getHour() {
		return hour;
	}

	// getter method for minute data field
	public long getMinute() {
		return minute;
	}

	// getter method for second data field
	long getSecond() {
		return second;
	}

	// method that use elapsed time and converts from milliseconds to
	// hours,minutes and seconds

	void setTime(long elapseTime) {
		second = elapseTime / 1000;
		minute = second / 60;
		hour = minute / 60;
		this.hour = hour % 24;
		this.minute = minute % 60;
		this.second = second % 60;
		;
	}

}
