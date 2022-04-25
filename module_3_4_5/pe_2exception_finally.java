
// finally will execute whether the exception is handled or not.
import java.util.Scanner;

public class pe_2exception_finally {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 25, k = 0;
		System.out.print("Enter number: ");
		
		try { 
			int j = Integer.parseInt(sc.next());
			k = i/j; }
		
//		catch(Exception e) { System.out.println("Some other exception: __ " + e); }
		catch(NumberFormatException e) { System.out.println("Entered value is not a number: __ " + e); }
//		catch(Exception e) { System.out.println("Some other exception: __ " + e); }
		
		finally { 
			System.out.println(k); 
			System.out.println("! END finally"); }
		
		System.out.println("! END out"); 

		} }
