import java.util.*;
public class vow_conc {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int vow=0;
        int conc=0;
        String s;
        s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                continue;
            }
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                vow++;
            }
            else
            {
                conc++;
            }
        }
        System.out.println("Vowel: "+vow);
        System.out.println("Conc: "+conc);
    }
}
