	
//	public class pc_7final {
//		public static void main(String[] args) {
//			finl f1 = new finl();
//			f1.show(); 	} }
//	
//	class finl {
//		int a = 10;
//		finl() { 	a = 20; 	}
//		void show() { System.out.println("a: " + a); 	} 	}
	
	// ------------------- final var -----------------------------
	
//	public class pc_7final {
//		public static void main(String[] args) {
//			finl f1 = new finl();
////			f1.A = 10;
//			f1.show();
//			finl f2 = new finl(100);
//			f2.show();
//		}	}
//	
//	class finl {
//		final int A;
////		void setF(int a) {this.A = a;}
//		finl() {A = 10;}
//		finl(int a) { 	A = a; }
//		void show() { System.out.println("A: " + A); 	} 	}
	
	//------------------- final method -----------------------------
	
//	public class pc_7final {
//		public static void main(String[] args) {
//			finl f1 = new finl1();
//			f1.show(); 	
//			f1.show(1);} 	}
//	
//	class finl {
//		final int A;
//		finl() { A = 20; 	}
//		final void show() { System.out.println("A: " + A); 	}
//		final void show(int aa) { System.out.println("method overloading: parent class"); }
////		final void show(float aa) { System.out.println("method overloading: parent class, float"); }
//		}
//	
//	class finl1 extends finl {
////		void show() { System.out.println("method overriding: child class"); }
////		void show(float a) { System.out.println("method overloading: child class"); }
//	}
	
//	class finl1 {
//		int A;
//		void show() { System.out.println("method overriding: child class"); }
//		void show(float a) { System.out.println("method overloading: child class"); }
//	}
	
	//------------------- final class -----------------------------
	
//	public class pc_7final {
//		public static void main(String[] args) {
//			finl f1 = new finl();
//			f1.show(); 	} }
//	
//	final class finl {
//		final int A;
//		finl() { A = 20; }
//		void show() { System.out.println("A: " + A); }
//	}
//	
//	class finl1 extends finl {
//		void show() { System.out.println("A: " + A); 		}
//	}
	


	