import java.util.*;
public class left_right {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1 for left shift and 2 for right shift: ");
        int n=sc.nextInt();
        System.out.println("Enter no of places to be shifted: ");
            int m=sc.nextInt();
            System.out.print("Enter number of array elements to be entered: ");
            int n1=sc.nextInt();
            int a[]=new int[n1];
            for(int i=0;i<n1;i++)
            {
                System.out.print("Enter number: ");
                a[i]=sc.nextInt();
            }
            String s="";
        switch(n)
        {
            case 1:
            for(int i=m;i<n1;i++)
            {
                s+=a[i]+",";
            }
            for(int i=0;i<m;i++)
            {
                s+=a[i]+",";
            }
            System.out.println("Rotated array: "+s);
            break;

            case 2:
            for(int i=n1-m;i<n1;i++)
            {
                s+=a[i]+",";
            }
            for(int i=0;i<n1-m;i++)
            {
                s+=a[i]+",";
            }
            System.out.println("Rotated array: "+s);
            break;
        }
        
    }
}
