
public class pc_1intro_classmethod {
	public static void main(String[] args) {
		Mathh mt = new Mathh();
		mt.num1 = 10;
		mt.num2 = 20;
		Mathh mt1;
		mt.add();
		mt1 = new Mathh();
		mt1.num1 = 100;
		mt1.num2 = 200;
		mt1.add();
	}
}

class Mathh {
	int num1, num2; // instance
	public void add() {
		int num = num1+num2; // num is local
		System.out.println("Sum: " + (num));	}
}

