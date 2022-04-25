

interface vehcl {
	static void led() {
		System.out.println("led lights"); 	}
	void eng();
	void whl();
	void ac();
	void roof(); }

abstract class comp1 implements vehcl {
	public void eng() { System.out.println("comp1 engine"); 	} }

class comp2 extends comp1 {
	public void whl() {  		System.out.println("comp2 wheel"); 	}
	public void ac() { 		System.out.println("comp2 ac"); 	}
	public void roof() { 		System.out.println("comp2 roof"); 	} }


public class pc_8interface2 {
	public static void main(String[] args) {
		vehcl v1 = new comp2();
		new comp2().eng();
		v1.roof();
	}
}
