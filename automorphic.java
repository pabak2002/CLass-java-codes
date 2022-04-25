import java.util.*;
public class automorphic {
    boolean Automorphic(int n)
    {
        int sq=0;
        sq=n*n;
        String str=Integer.toString(n);
        int l=str.length();
        if(sq%((int)Math.pow(10,l))==n)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=10000;i++)
        {
            automorphic a=new automorphic();
            if(a.Automorphic(i)==true)
            System.out.println(i);
        }
    }
}
