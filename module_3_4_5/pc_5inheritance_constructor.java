
//public class pc_5inheritance_constructor {
//	public static void main(String[] args) {
//		AA aa = new AA();
//		BB bb = new BB();
//		CC cc = new CC();
//	}	}
//
//class AA {
//	AA() {
//		System.out.println("in a .. "); }	}
//
//class BB {
//	BB() {
//		System.out.println("in b .. "); }	}
//
//class CC {
//	CC() {
//		System.out.println("in c .. "); }	}



//// -----------------------------------------------------------------
//
//public class pc_5inheritance_constructor {
//	public static void main(String[] args) {
//		AA aa = new AA();
//		BB bb = new BB();
//		CC cc = new CC();
//	}	}
//
//class AA {
//	AA() {
//		System.out.println("in a .. ");
//	}	}
//
//class BB extends AA {
//	BB() {
//		super();
//		System.out.println("in b .. ");
//	}	}
//
//class CC extends AA {
//	CC() {
//		super();
//		System.out.println("in c .. ");
//	}	}


//// -----------------------------------------------------------------
//
public class pc_5inheritance_constructor {
	public static void main(String[] args) {
		AA aa = new AA(10,20);	BB bb = new BB(10);	CC cc = new CC(10);	
		//bb.AA(10);
	}	}

class AA {
	AA() { 	System.out.println("in a .. "); }
	AA(int a) { System.out.println("in a int .. ");}
	AA(int a, int b) { System.out.println("in a int, int .. ");}}

class BB extends AA {
	BB() { 	System.out.println("in b .. "); }
	BB(int b) {
		super(b);
		System.out.println("in b int .. "); }
	public void AA(int a) { System.out.println("in B method .. "); 	}}

class CC extends AA {
	CC() { 	System.out.println("in c .. "); }
	CC(int c) {
//		super();
		System.out.println("in c int .. "); }
	CC(int c,int xx) {
		super(c);
		System.out.println("in c int,int .. "); }}





