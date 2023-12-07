package personDetail;

//abstract interface A
//{
//	default static void something();
//	
//	default void dis() 
//	{
//		System.out.println("In default method");
//	}
//	
//	static void show() 
//	{
//		System.out.println("In static method");
//	}
//}

public class OfficeAddress implements Address {
	private String officeNumner;
	private String officeName;

	public String getOfficeNumner() {
		return officeNumner;
	}

	public void setOfficeNumner(String officeNumner) {
		this.officeNumner = officeNumner;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	@Override
	public void displayAddress() {
		System.out.println("Office number : " + getOfficeNumner() + ", Office Name : " + getOfficeName() + " .");
	}
}
