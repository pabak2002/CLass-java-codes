
public class pc_5inheritance1 {

	public static void main(String[] args) {
		
		Animal an = new Animal();
		Dog dg = new Dog();
		Cat ct = new Cat();
		Animal andg = new Dog(); // upcasting
		
		//an.sit();
		ct.sit();
		dg.sit();
		//andg.sit();
//		andg.bark();
		andg = new Cat();
		//andg.sit(); // dynamic dispatch
//		andg.meow();

	}
}