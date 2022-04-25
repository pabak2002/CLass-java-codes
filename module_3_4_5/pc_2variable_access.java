

	public class pc_2variable_access {
		public static void main(String[] args) {
			
			Spe spe = new Spe();
			Spe1 spe1 = new Spe1();
			
//			spe.msg();
//			System.out.println(" -------------------- ");
//			System.out.println(spe.pub);
//			System.out.println(spe.pro);
//			System.out.println(spe.def); // error if this class is in different package
//			System.out.println(spe.pri);
//			System.out.println(" -------------------- ");
			System.out.println(spe1.pub);
			System.out.println(spe1.pro);
			System.out.println(spe1.def);// error if this subclass is in different package
//			System.out.println(spe1.pri);	
			//System.out.print("within main class: " + spe.prnt());
		}
	}
	
	class Spe {
		public String pub = "pub";
		String def = "def";
		protected String pro = "pro";
		private String pri = "pri";
		
		public void msg() {
			System.out.println(pub);
			System.out.println(pro);
			System.out.println(def);
			System.out.println(pri);
//			System.out.print("within class: " + prnt());
		}
		
//		private String prnt() {
//			return "this is private method";
//		}
	}
	
	class Spe1 extends Spe {
	}
	
	
	
	
	