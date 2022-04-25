
import java.util.Scanner;


//public class pe_1exception {
//	public static void main(String[] args) {
////		int c = 's';
////		System.out.print(c);
//		int i,j,k;
//		i = 3; j = 0;
//		k = i/j;
//		System.out.println(k);
//		System.out.println("Program ends");
//	}	}


//public class pe_1exception {
//	public static void main(String[] args) {
//		int i,j,k=0;
//		i = 3; j = 0;
//		try { 
//			k = i/j; }
//		catch(Exception e) {
//			System.out.println("Invalid operation: divide by zero: __ " + e);}
//		System.out.println(k);
//		System.out.println("Program ends");
//	}	}


//public class pe_1exception {
//	public static void main(String[] args) {
//		int i,j,k=0;
//		i = 3; j = 0;
//		try { k = i/j; }
//		catch(ArithmeticException e) {
//			System.out.println("Invalid operation: divide by zero: __ " + e);}
//		System.out.println(k);
//		System.out.println("Program ends");
//	}	}


//public class pe_1exception {
//	public static void main(String[] args) {
//		int i,j,k=0;
//		int arr[] = new int[4];
//		i = 3; j = 0;
//		try { k = i/j;	}
//		catch(ArithmeticException x1) {System.out.println("Invalid operation: divide by zero: __ " + x1);}
//		System.out.println("Program ends");
//		try {for(int ii = 0;ii<=4;ii++) {arr[ii] = ii; }		}
//		catch(ArrayIndexOutOfBoundsException e) 
//		{System.out.println("Accessing the undefined location: __ " + e);}
//		System.out.println("Program ends");
//	}	}


//public class pe_1exception {
//	public static void main(String[] args) {
//		int i,j,k=0;
//		int arr[] = new int[4];
//		i = 3; j = 0;
//		
//		try { k = i/j; 
//			for(int ii = 0;ii<=4;ii++) {arr[ii] = ii; }		}
//		
////		catch(Exception e) {System.out.println("Unknown exception: __ " + e);}
////		catch(ArithmeticException e) {System.out.println("Invalid operation: divide by zero: __ " + e);}
////		catch(ArrayIndexOutOfBoundsException e) 
////		{System.out.println("Accessing the undefined location: __ " + e);}
//		catch(Exception e) {System.out.println("Unknown exception: __ " + e);}
//		
//		System.out.println("Program ends");
//	}	}




//public class pe_1exception {
//	public static void main(String[] args) {
//		int i,j,k=0;
//		int arr[] = new int[4];
//		i = 3; j = 0;
//		
//		try {for(int ii = 0;ii<=4;ii++) {arr[ii] = ii; }}
//		
////		catch(Exception e) {System.out.println("Unknown exception: __ " + e);}
//		catch(ArithmeticException e) {System.out.println("Invalid operation: divide by zero: __ " + e);}
//		catch(ArrayIndexOutOfBoundsException e) 
//		{System.out.println("Accessing the undefined location: __ " + e);}
//		catch(Exception e) {System.out.println("Unknown exception: __ " + e);}
//		
//		try { k = i/j; 	}
//	
//	//	catch(Exception e) {System.out.println("Unknown exception: __ " + e);}
//		catch(ArithmeticException e) {System.out.println("Invalid operation: divide by zero: __ " + e);}
//		catch(ArrayIndexOutOfBoundsException e) 
//		{System.out.println("Accessing the undefined location: __ " + e);}
//		catch(Exception e) {System.out.println("Unknown exception: __ " + e);}
//		
//		System.out.println("Program ends");
//	}	}




//public class pe_1exception {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int i = 25, k = 0;
//		System.out.print("Enter number: ");
//		try { 
//			int j = Integer.parseInt(sc.next());
//			k = i/j; 			}
//		catch(NumberFormatException e) { System.out.println("Entered value is not a number: __ " + e); }
//		System.out.print(k); 	} }



public class pe_1exception {
	public static void main(String[] args) {
		String str = "c";
		int num;
		try {
			num = Integer.parseInt(str);
		}
		catch(Exception e) { System.out.println("---------------------------------");
		System.out.println(e);
		System.out.println("---------------------------------");
			num = 5;}
		int arr[] = new int[num];
		try {
		for(int i=0;i<=num;i++) {
			arr[i] = i;
		}}
		catch(Exception e) {System.out.println("---------------------------------");
		System.out.println(e);
		System.out.println("---------------------------------");}
		
		int ans;
		
		try {ans = arr[num-1]/arr[0];}
		catch(Exception e) { System.out.println("---------------------------------");
			System.out.println(e);
			System.out.println("---------------------------------");	}
	}	}
