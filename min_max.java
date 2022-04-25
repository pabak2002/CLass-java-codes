import java.util.*;
public class min_max {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of numbers to be entered: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter number: ");
            a[i]=sc.nextInt();
        }
        int max=a[0];
        int min=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];
            if(a[i]<min)
                min=a[i];
        }
        System.out.println("Maximum element : "+max);
        System.out.println("Minimum element : "+min);
        int j=n;
        for(int i=0;i<n;i++)
        {
            b[j-1]=a[i];
            j-=1;
        }
        System.out.println("Reverse array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.println();
    }
}
