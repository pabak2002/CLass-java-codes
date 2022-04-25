
	public class pc_3constructor {
		public static void main(String[] args) {
			Cons con = new Cons();
			con.prnt();
			con.a = 10;
			con.prnt();
			Cons con1 = new Cons(20);
			con1.prnt();
			Cons con2 = new Cons(con1);
			con2.prnt();
		}
	}
	
	class Cons {
		int a;
		public Cons() {
			this.a = -1;
			System.out.println("Constructor called: non-parameter");}
		public Cons(int a) {
			this.a = a;
			System.out.println("Constructor called: parameter"); }
		public Cons(Cons a) {
			this.a = a.a;
			System.out.println("Constructor called: copy"); }
		public void prnt() {
			System.out.println("value: " + a); }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	