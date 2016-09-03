package zadaci_02_09_2016;

import java.util.ArrayList;

public class ReviseMyStack {

	public static void main(String[] args) {
		
		// creating MyStack object
				MyStack stack1 = new MyStack();
				// adding objects into stack
				stack1.push(new Integer(5));
				stack1.push(new Integer(3));
				stack1.push(new Double(1));
				// creating second MyStack object
				MyStack stack2 = new MyStack();
				// cloning first stack into second
				stack2 = stack1.clone();
				// printing out second stack object
				System.out.println(stack2);

			}

		}

		/*
		 * MyStack class that implements Cloneable interface and have array list data
		 * field
		 */
		class MyStack implements Cloneable {
			public ArrayList<Object> list = new ArrayList<>();
			
			//method that checks if list is empty
			public boolean isEmpty() {
				return list.isEmpty();
			}
			//method that returns size of the list
			public int getSize() {
				return list.size();
			}
			//method that shows last element of the list
			public Object peek() {
				return list.get(getSize() - 1);
			}
			//method that shows and removes last element of the list
			public Object pop() {
				Object o = list.get(getSize() - 1);
				list.remove(getSize() - 1);
				return o;
			}
			//method that adds new element to the list
			public void push(Object o) {
				list.add(o);
			}
			//method that finds index of objects last occurence
			public int search(Object o) {
				return list.lastIndexOf(o);
			}

			/** Override the toString in the Object class */
			public String toString() {
				return "stack: " + list.toString();
			}
			//method that clones one MyStack object into other
			public MyStack clone() {
				//new MyStack object 
				MyStack clone = new MyStack();
				//adding elements from old stack to new one
				for (int i = 0; i < this.getSize(); i++) {
					clone.push(this.list.get(i));
				}
				//returning new object
				return clone;

	}

}
