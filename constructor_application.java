public class constructor_application
{
    public static void main(String args[])
    {
        //rect r=new rect();
        int l=5;
        int b=10;
        // r.l=5;
        // r.b=10;
        rect r1=new rect();
        System.out.println("Area: "+(r1.area));
        System.out.println("Perimeter: "+(r1.perm));

        rect r2=new rect(l,b);
        System.out.println("Area: "+(r2.area));
        System.out.println("Perimeter: "+(r2.perm));

        rect r3=new rect(r2);
        System.out.println("Area: "+(r3.area));
        System.out.println("Perimeter: "+(r3.perm));
    }
}

class rect
{
    int l,b;
    int perm;
    int area;
    public rect()
    {
        System.out.println("Non_parameterized constructor");
        this.l=0;
        this.b=0;
        this.perm=0;
        this.area=0;
        // this.perm=2*(l+b);
        // this.area=l*b;
    }
    public rect(int l,int b)
    {
        System.out.println("Parameterized constructor");
        this.l=l;
        this.b=b;
        this.perm=2*(l+b);
        this.area=l*b;
    }
    public rect(rect r2)
    {
        System.out.println("Copy constructor");
        this.l=r2.l+2;
        this.b=r2.b+2;
        this.perm=2*(l+b);
        this.area=l*b;
    }
}