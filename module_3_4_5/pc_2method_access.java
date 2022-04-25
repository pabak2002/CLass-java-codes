
	
	public class pc_2method_access {
		public static void main(String[] args) {			
			Ops op1 = new Ops();
			System.out.println("sum: " + op1.asum);
			System.out.println("dif: " + op1.bdif);
			op1.opss(2,3);
			System.out.println("sum: " + op1.asum); // 5
			System.out.println("dif: " + op1.bdif); // -1
			
//			System.out.println("sum: " + op1.ad(2,3));
//			int xx = op1.sub(10,3);
			System.out.println("sum: " + op1.sub(10,3));
			System.out.println("sum: " + op1.asum);
			System.out.println("dif: " + op1.bdif);
		}
	}
	
	class Ops {
		int asum,bdif; // class/instance/field
		private int ad(int a, int b) {
			return a+b;	}
		protected int sub(int a, int b) {
			return a-b; }
		public void opss(int a, int b) {
			asum = ad(a,b);
			bdif = sub(a,b); }
	}
	
