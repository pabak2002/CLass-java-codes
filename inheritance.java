import java.util.*;
class shape2d
{
    private float l, w;
    public shape2d(float l, float w)
    {
        this.l = l;
        this.w = w;
    }
    public float getlen()
    {
        return(l);
    }
    public float getwid()
    {
        return(w);
    }
}
class circle extends shape2d
{
    float area,perm;
    circle(float l, float w)
    {
        super(l,w);
    }
    public float area()
    {
        return (float) (3.14 * this.getlen() * this.getlen());
    }
    public float perm()
    {
        return (float) (2 * 3.14 * this.getlen());
        
    }
    
}
class rectangle extends shape2d
{
    float area,perm;
    rectangle(float l, float w)
    {
        super(l,w);
    }
    public float area()
    {
        return this.getlen() * this.getwid();
    }
    
    public float perm()
    {
        return 2 * (this.getlen() + this.getwid());
        
    }
    
}
class square extends shape2d
{
    float area,perm;
    square(float l, float w)
    {
        super(l,w);
    }
    public float area()
    {
        return this.getlen() * this.getlen();
    }
    public float perm()
    {
        return 4 * this.getlen();
        
    }
    
}
public class inheritance {
        public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        circle c=new circle(a,b);
        square s=new square(a,b);
        rectangle r=new rectangle(a,b);
        System.out.println("Perimeter and area of circle with radius " + r.getlen() + " is " + c.perm() + " and " + c.area());
        System.out.println("Perimeter and area of rectangle with length " + r.getlen() + " and width " + r.getwid() + " is " + r.perm() + " and " + r.area());
        System.out.println("Perimeter and area of square with length " + r.getlen() + " is " + s.perm() + " and " + s.area());
        
        
    }
}
