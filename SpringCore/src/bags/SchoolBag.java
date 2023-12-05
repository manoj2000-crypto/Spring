package bags;

public class SchoolBag implements Bag {

	@Override
	public void storage() {
		System.out.println("SchoolBag : Books and pens");
	}

	@Override
	public void display() {
		storage();
	}
	
}
