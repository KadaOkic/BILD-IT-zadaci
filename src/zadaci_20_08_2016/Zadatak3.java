/**
 * (Stopwatch) Design a class named StopWatch. The class contains:
 *  Private data fields startTime and endTime with getter methods.
 *  Private data fields startTime and endTime with getter methods.
 *  A method named start() that resets the startTime to the current time.
 *  A method named stop() that sets the endTime to the current time.
 *  A method named getElapsedTime() that returns the elapsed time for the
 *  stopwatch in milliseconds.
 *  Draw the UML diagram for the class and then implement the class.
 *   Write a test program that measures the execution time 
 *   of sorting 100,000 numbers using selection sort.
 */
package zadaci_20_08_2016;

public class Zadatak3 {

	public static void main(String[] args) {

		int[] randomArray = new int[100000];
		// Creating an unsorted array of 100,000 random numbers
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int) (Math.random() * 100000);
		}
		// create stopwatch
		StopWatch stopWatch = new StopWatch();
		// sort numbers begin with start and at the end stop stopwatch
		stopWatch.start();
		selectionSort(randomArray);
		stopWatch.stop();
		// time elapsed from the start until the end sorting
		System.out.println("Time elapsed: " + stopWatch.elapsedTime()
				+ " milliseconds.");

	}

	// // Method that sorts numbers in the array and returns sorted array
	public static int[] selectionSort(int[] m) {
		// go through loop until the last one
		for (int i = 0; i < m.length - 1; i++) {

			int currentMin = m[i];
			int currentIndex = i;

			for (int j = i + 1; j < m.length; j++)
				// switch values if greater
				if (m[j] < m[currentIndex])

					currentIndex = j;

			currentMin = i;
			m[currentIndex] = m[i];
			m[i] = currentMin;
		}

		return m;

	}

}
