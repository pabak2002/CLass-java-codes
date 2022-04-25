import java.util.*;
public class asc_desc {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1 for ascending and 2 for descending: ");
        int n=sc.nextInt();
            System.out.print("Enter number of array elements to be entered: ");
            int n1=sc.nextInt();
            int a[]=new int[n1];
            for(int i=0;i<n1;i++)
            {
                System.out.print("Enter number: ");
                a[i]=sc.nextInt();
            }
        switch(n)
        {
            case 1:
            int x=0;
            for(int i=0;i<n1-1;i++)
            {
                for(int j=0;j<n1-i-1;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        x=a[j];
                        a[j]=a[j+1];
                        a[j+1]=x;
                    }
                }
            }
            System.out.println("Sorted array: ");
            for(int i=0;i<n1;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();
            break;

            case 2:
            // for (int i = 0; i < n1; i++) {     
            //     for (int j = i+1; j <n1 ; j++) {     
            //        if(a[i] < a[j]) {    
            //            x = a[i];    
            //            a[i] = a[j];    
            //            a[j] = x;    
            //        }     
            //     }     
            // }    
            for(int i=0;i<n1-1;i++)//Alternate method of sorting in descending order
            {
                for(int j=0;j<n1-i-1;j++)
                {
                    if(a[j]<a[j+1])
                    {
                        x=a[j];
                        a[j]=a[j+1];
                        a[j+1]=x;
                    }
                }
            }
            System.out.println("Sorted array: ");
            // for(int i=0;i<n1;i++)
            // {
            //     System.out.print(a[i]+" ");
            // }
            // System.out.println();
            System.out.println("Sorted array: "+ Arrays.toString(a));//prints the array in string format(tbh in list format).
            break;
        }
        
    }
}
