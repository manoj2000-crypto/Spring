package bags;

public class ShoppingBag implements Bag {

	@Override
	public void storage() {
		System.out.println("ShoppingBag : Vegitables and grocery items.");
	}

	@Override
	public void display() {
		storage();
	}

}
