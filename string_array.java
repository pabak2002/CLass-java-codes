import java.util.*;
public class string_array {
    public static void main(String args[])
    {
        String s="";
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==','||s1.charAt(i)=='?'||s1.charAt(i)=='.'||s1.charAt(i)=='!')
            continue;
            s=s+s1.charAt(i);
        }
        System.out.print("Initial array: ");
        String a[]=s.split(" ");
        System.out.print(Arrays.toString(a));
        System.out.println();
        s+=" ";
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i].compareTo(a[j])>0)
                {
                    String temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("Sorted array: ");
        System.out.print(Arrays.toString(a));
    }
}
