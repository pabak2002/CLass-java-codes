
// binding data with methods is called encapsulation.

	public class pc_2setter_getter {
		public static void main(String[] args) {
			
			StGt st = new StGt();
			st.a = 1; st.b = 2;
//			st.pri = 10;
			st.setpr(10);
			System.out.println("Values of a, b, pri are " 
			+ st.a + ", " + st.b + ", " + st.getpr());
		} 	}
	
	class StGt {
		int a,b;
		private int pri;
		
		public void setpr(int pri) {
			this.pri = pri;
		}
		public int getpr() {
			return this.pri;
		} 	}
