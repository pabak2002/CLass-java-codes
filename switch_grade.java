import java.util.*;
public class switch_grade {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char a;
        a=sc.next().charAt(0);
        switch(a)
        {
            case 'A':
                System.out.println("Very good, Keep it up");
                break;
            case 'B':
                System.out.println("Good, need to work hard");
                break;
            case 'C':
                System.out.println("Fine, Work hard");
                break;
            case 'D':
                System.out.println("Average, need to repeat the course");
                break;
            default:
                System.out.println("Grade not founhd");
                break;
        }
    }
}
