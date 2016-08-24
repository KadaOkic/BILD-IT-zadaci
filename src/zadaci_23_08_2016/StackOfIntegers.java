package zadaci_23_08_2016;

public class StackOfIntegers {

	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;

	// default constructor
	public StackOfIntegers() {
		this(DEFAULT_CAPACITY);
	}

	// constructor that creates object with integer array where user sets
	// capacity
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}

	// method that checks if the "stack" is empty return true if it's empty and
	// false if it's not
	public boolean empty() {
		if (size == 0)
			return true;
		else
			return false;

	}

	// method that displays last element of the "stack" returns last element of
	// the stack
	public int peek() {
		return elements[size - 1];

	}

	// method that adds integer we passed to the stack value integer we pass to
	// the method
	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}

		elements[size++] = value;
	}

	// method that returns size of the stack
	public int getSize() {
		return size;
	}

	// method that returns the last element from the stack, and removes the
	// element
	public int pop() {
		return elements[--size];

	}
	
}