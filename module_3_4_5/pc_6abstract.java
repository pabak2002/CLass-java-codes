
public class pc_6abstract {
	public static void main(String[] args) {
		phone p1 = new phone2(); // upcasting
		// phone2 p1 = new phone2();
		p1.text();
		p1.video();
		p1.call();
		p1.volte();
		new phone2().newM();	} }

abstract class phone {
	void call() {System.out.println("calling ... "); }
	abstract void text();
	abstract void video();
	abstract void volte(); 
	}

abstract class phone1 extends phone {
	void text() {System.out.println("texting ... ");} 
	abstract void newM();
	}

class phone2 extends phone1 {
	void call() {System.out.println("new calling ... ");}
	void video(){System.out.println("video calling ... "); }
	void volte(){ System.out.println("voice over LTE... ");}
	void newM() { System.out.println("new method in phone2 ");} }

