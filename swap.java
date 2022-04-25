public class swap {
    public static void main(String args[])
    {
        int a=30;
        int b=70;
        a+=b;
        b=a-b;
        a-=b;
        System.out.println("a: "+a+"_b: "+b);
    }
}
