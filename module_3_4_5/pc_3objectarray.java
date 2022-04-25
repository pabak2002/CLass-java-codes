
class Objarr {
	int var1, var2;
	void objnum(int i) {
		System.out.println("This is object array: " + i);}
	void setdt(int a, int b) {
		var1 = a; var2 = b; }
	void getdt() {
		System.out.println("value: " + var1 + ", " + var2);
		}
}


public class pc_3objectarray {
	public static void main(String[] args) {
		
		Objarr o = new Objarr(); // single object creation
		
		int len = 4;
		Objarr o1[] = new Objarr[len];
		Objarr o2[] = {new Objarr(), new Objarr(), new Objarr()};
		
		System.out.println(o1.length);
		System.out.println(o2.length);
		
		for(int i = 0; i<len; i++)
			o1[i] = new Objarr();
	
		for(int i = 0; i<len; i++) {
			o1[i].objnum(i);
			o1[i].setdt(i,i*10);}
		
		for(int i = 0; i<o2.length; i++)
			o2[i].setdt(i,i+10);
		
		for(int i = 0; i<len; i++)
			o1[i].getdt();
		
		for(int i = 0; i<o2.length; i++)
			o2[i].getdt();

	}
}



