
public class pc_1variables {
	public static void main(String[] args) {
		Var v1 = new Var();
		v1.add(2,3); 
		System.out.println("var1 of var1: " + v1.var1); 
		Var v2 = new Var();
		v2.comp = "VITnew";
		System.out.println("var1 of var2: " + v2.var1); //
		System.out.println("company of var1: " + v1.comp); // 
		System.out.println("company of var2: " + v2.comp); // 
		Var.comp = "VIT";
		System.out.println("company of var1: " + v1.comp); // 
		System.out.println("company of var2: " + v2.comp); // 
//		v1.addmore(); 
//		System.out.println("obj1: " + v1.var1);
	} 	}

class Var {
	int var1; // instance
	static String comp = "VIT"; // static
	public void add(int a, int c) {
		this.var1  = a + c;
		int var1 = a + c + 10; // local
		System.out.println("Sum of local: " + var1);
		System.out.println("Sum of instance: " + this.var1); }
	public void addmore() {
		this.var1 = this.var1+100;
		System.out.println("Sum of instance: " + this.var1); }
}


