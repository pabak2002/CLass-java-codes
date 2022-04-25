	

//	class methdover {
//		public int ad() {
//			return 2+3; 	}
//		
//		public static int ad(int a) {
//			return a+3; 	}
//		
//		public static float ad(float a) {
//			return a+3; 	}
//		
//		public static int ad(int a, int b) {
//			return a+b; 	}
//		
//		public static int ad(float a, int b) {
//			return (int) a+b; 	}
//		
//		public static float ad(float a, float b) {
//			return a+b; 	}
//		
//		public static int ad(int a, float b) {
//			return a+ (int) b; 	}
//	}

	public class pc_4method_overloading {
		public static void main(String[] args) {
			
			misc aa = new misc();
			aa.a = 10;
			aa.show();
			
			new misc().show(); // 
			new misc().a = 10;
			new misc().show(); // 
			new misc(10).show(); // 
			
//			methdover mt = new methdover();
//			System.out.println(mt.ad());
//			System.out.println(methdover.ad(2.0f));
//			System.out.println(methdover.ad(2.0f,3));
//			System.out.println(methdover.ad(2.0f,3.0f)); 	
			}	}
	
	class misc {
		int a;
		misc(){this.a = -1;}
		misc(int a){ this.a = a;}
		public void show() {
			System.out.println("a: " + a); }
	}
