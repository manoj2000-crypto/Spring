package personDetail;

public class Person {

	private String personName;
	private Address address;

	Person()
	{
		System.out.println("Person Constructor invoked.");
	}
	
	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	private HomeAddress homeAddress;
	private OfficeAddress officeAddress;

	public HomeAddress getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(HomeAddress homeAddress) {
		this.homeAddress = homeAddress;
	}

	public OfficeAddress getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(OfficeAddress officeAddress) {
		this.officeAddress = officeAddress;
	}

}