
//public class pc_6abstract1 {
//	public static void main(String[] args) {
//		iph iph1 = new iph();
//		op op1 = new op();
//		show(iph1);
//		show(op1);
//	}
//	public static void show(iph obj) { 			obj.showconfig(); 		}
//	public static void show(op obj) { 		obj.showconfig(); 	}
//}
//
//class iph {
//	void showconfig() { System.out.println("iphone config ... "); 	} }
//
//class op {
//	void showconfig() { System.out.println("oneplus config ... "); 	} }



public class pc_6abstract1 {
	public static void main(String[] args) {
		iph iph1 = new iph();
		op op1 = new op();
		show(iph1);
		show(op1);
	}
	public static void show(phonex var) { 			var.showconfig(); 		}
}

abstract class phonex {
	abstract void showconfig(); }

class iph extends phonex {
	void showconfig() { 		System.out.println("iphone config ... "); 	} }

class op extends phonex {
	void showconfig() { 		System.out.println("oneplus config ... "); 	} }




