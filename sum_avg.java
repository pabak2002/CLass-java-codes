import java.util.*;
public class sum_avg {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        int sum = 0;
        float avg = 0;
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            sum += a[i];
        }
        avg = sum / n;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}
