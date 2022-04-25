import java.util.*;
public class factorial {
    public static void main(String args[])
    {
        int a;
       Scanner sc=new Scanner(System.in);
       a=sc.nextInt();
       int s=1;
       for(int i=1;i<=a;i++)
        {
            s*=i;
        }   
    System.out.println(s);
    }
}
