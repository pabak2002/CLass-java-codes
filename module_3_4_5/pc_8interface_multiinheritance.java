	

//	public class pc_8interface_multiinheritance {
//		public static void main(String[] args) { 
//			MIdemo mi = new MIdemo();
//			mi.disp1();
//		}  }
//	
//	class MIdemo1 {
//		void disp() {System.out.println("MIdemo1: disp");} }
//	
//	class MIdemo2 {
//		void disp() {System.out.println("MIdemo2: disp");} }
//	
//	class MIdemo extends MIdemo1,MIdemo2 {
//		void disp1() { disp();} }
		
	public class pc_8interface_multiinheritance {
		public static void main(String[] args) { 
			MIdemo mi = new MIdemo();
			mi.disp();
		}  }
	
	interface MIdemo1 {	void disp(); }
	interface MIdemo2 {	void disp(); }
	
	class MIdemo implements MIdemo1, MIdemo2 {
		public void disp() {System.out.println("MIdemo: disp");} }

	

//	public class pc_8interface_multiinheritance {
//		public static void main(String[] args) { 
//			MIdemo mi = new MIdemo();
//			mi.disp();
//		}  }
//	
//	abstract class MIdemo1 { abstract void disp(); }
//	
//	abstract class MIdemo2 { abstract void disp(); }
//	
//	class MIdemo extends MIdemo1, MIdemo2 {
//		public void disp() {System.out.println("MIdemo: disp");} }
	
	