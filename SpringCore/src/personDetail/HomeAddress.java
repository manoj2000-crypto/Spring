package personDetail;

public class HomeAddress implements Address {
	private String flatNumber;
	private String Housename;

	public String getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	public String getHousename() {
		return Housename;
	}

	public void setHousename(String housename) {
		Housename = housename;
	}

	@Override
	public void displayAddress() {
		System.out.println("Flat no : " + getFlatNumber() + " House Name : " + getHousename());
	}
}
