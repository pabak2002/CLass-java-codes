
import java.io.*;

//public class pe_3exception_throws {
//	public static void main(String[] args) {
//		
//	try {
//		FileInputStream in = new FileInputStream("D:\\files\\out.txt");		} 
//	catch (FileNotFoundException e) {
//		System.out.println(e);
//		e.printStackTrace();		}	
//	System.out.println("hi");
//	} }


public class pe_3exception_throws {
	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		FileOutputStream out = new FileOutputStream("D:\\files\\out.txt");
		FileInputStream in = new FileInputStream("D:\\files\\out.txt");
		int k = 34/0;
		System.out.println("hi");
	} }
