	
	//Pass by value and pass by reference
	
	public class pc_1method_argument_pass {
		public static void main(String[] args) {
			Vrclass vr1 = new Vrclass();
			Vrclass vr2 = new Vrclass();
			System.out.println("Initial Value: " + vr2.prnt());
			int aa = 10;
			vr1.setval(aa); // pass by value 
			vr2.setvalo(vr1); // pass by reference
			System.out.println("Value vr1 (pass by value): " + vr1.prnt());
			System.out.println("Value vr2 (pass by reference): " + vr2.prnt());
			vr2.setval(20);
			vr1.setvalo(vr1);
			System.out.println("Value vr1: " + vr1.prnt());
			System.out.println("Value vr2: " + vr2.prnt());
		}
	}
	class Vrclass {
		int a;
		void setval(int a) { // int a = 30;
			this.a = a;	}
		void setvalo(Vrclass var1) { // Vrclass var1 = vr1
			this.a = var1.a;	}
		 int prnt() { 
			return this.a;
		}
	}