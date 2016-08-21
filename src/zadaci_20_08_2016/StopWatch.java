package zadaci_20_08_2016;

public class StopWatch {
	// Private data fields startTime and endTime
	private long startTime = 0;
	private long endTime = 0;

	public void Stopwatch() {

	}

	// get current time in milliseconds (used to start stopwatch
	long start() {
		return this.startTime = System.currentTimeMillis();
	}

	//  current time in milliseconds (used to stop stopwatch)
	long stop() {
		return this.endTime = System.currentTimeMillis();
	}

	// elapsed from the moment stopwatch started until it stoped
	public long elapsedTime() {
		return this.endTime - this.startTime;
	}
}
