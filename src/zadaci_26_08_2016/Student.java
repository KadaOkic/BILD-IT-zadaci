package zadaci_26_08_2016;

public class Student extends Person {
	private final static String[] STATUS = { "freshman", "sophomore",
			"junior", "senior" };
	private String status = STATUS[0];

	// defaul constructor
	Student() {

	}

	// constructor that allows user to enter values for data fields
	public Student(String name, String address, String phoneNumber,
			String emailAddress, int status) {
		super(name, address, phoneNumber, emailAddress);
		this.status = STATUS[status];
	}

	// get method for status data field
	public String getStatus() {
		return status;
	}

	// set method for status data field
	public void setStatus(String status) {
		this.status = status;
	}

	// method that allows us to print object as class name and object name
	public String toString() {
		return "Student " + getName();
	}

}
