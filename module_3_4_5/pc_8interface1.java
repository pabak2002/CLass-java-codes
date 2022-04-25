//
//interface vehcl {
//	void eng();
//	void whl();
//	void ac(); }
//
//interface nvehcl extends vehcl { 	void roof(); }
//
//class comp1 implements vehcl, nvehcl {
//	public void eng() { 		System.out.println("comp1 engine"); 	}
//	public void whl() { 		System.out.println("comp1 wheel");	}
//	public void ac() {		System.out.println("comp1 ac");	}
//	public void roof() { 		System.out.println("comp1 roof");	} }
//
//class comp2 implements nvehcl {
//	public void eng() { 		System.out.println("comp2 engine"); 	}
//	public void whl() { 		System.out.println("comp2 wheel"); 	}
//	public void ac() {		System.out.println("comp2 ac"); 	}
//	public void roof() {		System.out.println("comp2 roof"); 	} }
//
//public class pc_8interface1 {
//	public static void main(String[] args) {
//		vehcl v1 = new comp1();
//		nvehcl v2 = new comp2();
////		v1.roof(); 
//		v2.roof();
//		new comp1().roof();
//		comp1 c1 = new comp1();
//		c1.roof(); 	} }
