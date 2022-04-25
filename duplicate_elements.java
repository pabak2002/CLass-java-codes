import java.util.*;
public class duplicate_elements {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of array elements: ");
        int n=sc.nextInt();
        int j=0;
        int c=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter number: ");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            c=0;
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c+=1;
                }
            }
            System.out.println(a[j]);//+"is present"+(c)+"times");
        }
    }
}
