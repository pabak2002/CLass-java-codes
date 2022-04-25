

	public class pc_2method_nonaccess {
		public static void main(String[] args) {
			
//			Stat nw = new Stat();
//			int addd = Stat.add(2, 3);
//			int addd1 = nw.add(2, 3);
			System.out.println("sum: " + Stat.add(2, 3));
		} 	}

	
	class Stat {
		int num;
		public static int add(int a, int b) {
//			num = a+b; // error .. we can not use non-static variables inside the static method/block.
			return (a+b); }
	}