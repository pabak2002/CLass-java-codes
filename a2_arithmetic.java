public class a2_arithmetic {
    public static void main(String args[])
    {
        int a=10;
        int aa=0;
        int b=20;
        int c=25;
        int d=25;
        System.out.println("a: "+a+"_b: "+b+"_c: "+c+"_d: "+d);
        System.out.println("a+b: "+(a+b));
        System.out.println("a-b: "+(a-b));  
        System.out.println("a*b: "+(a*b));
        System.out.println("a/b: "+(a/b));
        System.out.println("b/a: "+(b/a));
        System.out.println("a%b: "+(a%b));
        System.out.println("a%c: "+(a%c));
        System.out.println("b%a: "+(b%a));
        System.out.println("c%a: "+(c%a));
        aa=a++;
        System.out.println("a: "+a+"_aa: "+aa);
        aa=++a;
        System.out.println("a: "+a+"_aa: "+aa);
    }
}
