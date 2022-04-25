

public class pc_7wrapperclasses {
	public static void main(String[] args) {
		
		int i = 5;
		Integer ii = 5; // auto-boxing
		Integer iii = i; // wrapping
		
		int k = ii.intValue(); // unwrapping
		
		System.out.println(i + " .. " + ii + " .. " + iii + " .. " + k);

	}
}
