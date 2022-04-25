// import java.util.*;
public class prime20 {
    boolean isPrime(int n) {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        prime20 p=new prime20();
        int n=0,c=0,c1=0;
        while(5>3)
        {
            n++;
            if(p.isPrime(n)==true){
                c++;
                System.out.println(n);
            }
            if(c==20)
            break;
        }
    }
        
}
