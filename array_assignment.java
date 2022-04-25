import java.util.*;

public class array_assignment {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of numbers to be entered: ");
        int n;
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
