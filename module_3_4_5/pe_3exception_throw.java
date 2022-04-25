

import java.util.Scanner;
public class pe_3exception_throw {
	public static void main(String[] args)  	{
		Scanner sc = new Scanner(System.in);
		int i = 25, k = 0;
		System.out.print("Enter number: ");
		int j;
		try { 
//			j = sc.next().charAt(0);
			j = Integer.parseInt(sc.next());
//			throw new ArithmeticException("USER DEFINED EXCEPTION");
			k = i+j; 
			if (j <100) {
				throw new Exception("USER DEFINED EXCEPTION");}
			}
		catch(Exception e) { System.out.println("General exception: __ " + e); }
//		catch(NumberFormatException e) { System.out.println("Entered value is not a number: __ " + e);}
//		catch(ArithmeticException e) { System.out.println("k should be more than 100: __ " + e); }
//		catch(Exception e) { System.out.println("General exception: __ " + e); }
		
		finally { System.out.println(k); 
			System.out.println("! END finally"); }
		System.out.println("! END out"); 	
		} }