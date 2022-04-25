

public class pe_1exception_user {
	public static void main(String[] args) {
		
		int i=5,j=10;
		int k = i+j;
		
		try {
			if (k<50) { throw new myexc("USER DEFINED"); } 	}
		
		catch (Exception e) { System.out.println(e); 	}
		
		finally {	System.out.println("Inside finally");	}
		System.out.println("end");
	}	}


class myexc extends Exception {
	String str;
	public myexc(String str) { 
//		super(str);
		this.str = str;}
	public String toString() { return this.str;}
	}