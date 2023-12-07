package personDetail;

public class Person {

	//Attribute
	private String personName;

	// Person class constructor
	Person() {
		System.out.println("Person Constructor invoked.");
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	// Creating object reference for Address Interface.
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// Creating object reference for HomeAddress class.
	private HomeAddress homeAddressObj;

	public HomeAddress getHomeAddress() {
		return homeAddressObj;
	}

	public void setHomeAddress(HomeAddress homeAddressObj) {
		this.homeAddressObj = homeAddressObj;
	}

	// Creating object reference for OfficeAddress class.
	private OfficeAddress officeAddress;

	public OfficeAddress getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(OfficeAddress officeAddress) {
		this.officeAddress = officeAddress;
	}

}