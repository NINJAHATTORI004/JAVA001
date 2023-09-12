
package Innerclasses;
class Outer1{
    final static int a=10;
    class Inner1
    {

        static int b=20;
        static void innerMethod1()
        {
            //  a=23;
            System.out.println("inner static b :"+b);
            System.out.println("outer static a :"+a);
        }
    }
    void OuterMethod1()
    {
        System.out.println("outer static a :"+a);
    }
}
public class NormalInnerClass3 {
    public static void main(String[] args)
    {
        Outer1.Inner1.innerMethod1();
    }
}


