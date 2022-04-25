public class bitwise {
    public static void main(String args[])
    {
        int a=60;int b=13;int c=0;
        //a:0011 1100
        //b:0000 1101
        c=a&b;
        System.out.println("a&b: "+c);
        c=a|b;
        System.out.println("a|b: "+c);
        c=a^b;
        System.out.println("a^b: "+c);
        c=a>>2;
        System.out.println("a>>2: "+c);
        c=a<<2;
        System.out.println("a<<2: "+c);
    }
}
