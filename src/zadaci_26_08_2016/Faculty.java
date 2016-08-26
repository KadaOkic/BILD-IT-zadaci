package zadaci_26_08_2016;

public class Faculty extends Employee {

	int officeHours;
	String rank;

	Faculty() {

	}

	// constructor that allows user to input data fields info
	public Faculty(String name, String address, String phoneNumber,
			String emailAddress, String office, int salary, int officeHours,
			String rank) {
		super(name, address, phoneNumber, emailAddress, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	// get method for officeHours data field
	public int getOfficeHours() {
		return officeHours;
	}

	// set method for officeHours data field
	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}

	// get method for rank data field
	public String getRank() {
		return rank;
	}

	// set method for rank data field
	public void setRank(String rank) {
		this.rank = rank;
	}

	// method that allow us to print object as class name and object name
	@Override
	public String toString() {
		return "Faculty " + getName();
	}

}
