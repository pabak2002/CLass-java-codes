import java.util.*;
public class palindromje {
    public static void main(String args[])
    {
        int n,r=0,rev=0,x=0;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       x=n;
       while(n>0)
       {
           r=n%10;
           rev=rev*10+r;
           n/=10;
       }
       if(x==rev)
       System.out.println("palindrome");
       else
         System.out.println("not palindrome");
    }
}
