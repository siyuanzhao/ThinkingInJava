package example;

class Meal{
	Meal(){System.out.println("Meal()");}
}

class Bread{
	Bread(){System.out.println("Bread()");}
}

class Cheese{
	Cheese(){ System.out.println("Cheese()"); }
}

class Lettuce{
	public Lettuce() {
		// TODO Auto-generated constructor stub
		System.out.println("Lettuce()");
	}
}

class Lunch extends Meal {
	Lunch(){System.out.println("Lunch()");}
}

class PortableLunch extends Lunch{
	PortableLunch(){System.out.println("PortableLunch()");}
}

public class Sandwich extends PortableLunch{

	/**
	 * @param args
	 */
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	public Sandwich(){System.out.println("Sandwich()");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sandwich();
	}

}
