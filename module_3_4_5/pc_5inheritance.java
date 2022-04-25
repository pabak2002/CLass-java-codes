
// This program demonstrate the concept of INHERITANCE AND METHOD OVERRIDING 

//// --------------------------------------------------------------------------
//
//	public class pc_5inheritance {
//		public static void main(String[] args) {
//			
//			Dog dg = new Dog();
//			Cat ct = new Cat();
//			dg.age = 10;
//			ct.age = 8;
//			
//			System.out.println("Age of dog: " + dg.age);
//			System.out.println("Age of cat: " + ct.age);
//			
//			dg.sit();
//			ct.sit();
//			dg.bark();
//			ct.meow();
//		}	
//	}
////
//class Dog {
//	String clr, breed;
//	int age;
//	public void sit() {
//		System.out.println("sitting"); }
//	public void bark() {
//		System.out.println("barking"); }
//}
////
//class Cat {
//	String clr;
//	int age;
//	public void sit() {
//		System.out.println("sitting"); }
//	public void meow() {
//		System.out.println("meowing"); }
//}
	


// ---------------------------------------------------------------

//	public class pc_5inheritance {
//		public static void main(String[] args) {
//			
//			Dog dg = new Dog();
//			Cat ct = new Cat();
//			Animal an = new Animal();
//			dg.age = 10;
//			ct.age = 8;
//			
//			System.out.println("Age of dog: " + dg.age);
//			System.out.println("Age of cat: " + ct.age);
//			
//			an.sit();
//			dg.sit();
//			ct.sit();
//			dg.bark();
//			ct.meow();
//		}	
//	}
//
//	class Animal {
//		String clr;
//		int age;
//		public void sit() { System.out.println("Animal sitting"); 	} 	}
//	
//	class Dog extends Animal {
//		String breed;
//		public void bark() { System.out.println("barking"); }
//		public void sit() {
//			super.sit(); // keyword
//			System.out.println("dog sitting"); 	} 	}
//	
//	class Cat extends Animal{
//		public void meow() { System.out.println("meowing"); } 
//		public void sit() { System.out.println("cat sitting");
//			super.sit(); 	} 	}

	
	
// ---------------------------------------------------------------

	public class pc_5inheritance {
		public static void main(String[] args) {
			
			Dog dg = new Dog();
			Cat ct = new Cat();
			Animal an = new Animal();
			
//			an.sit();
			dg.sit();
			ct.sit();
		}	
	}

	class Animal {
		String clr;
		int age;
		//public void sit() { System.out.println("Animal sitting"); 	} 	
		}
	
	class Dog extends Animal {
		String breed;
		public void bark() { System.out.println("barking"); }
		public void sit() {
			//super.sit(); // keyword
			System.out.println("dog sitting"); 	} 	}
	
	class Cat extends Animal{
		public void meow() { System.out.println("meowing"); } 
		public void sit() { System.out.println("cat sitting");
			//super.sit(); 	
		} 	
		}

	