package Innerclasses;
class OuterA
{
    class InnerA{
        void InnerMethodA()
        { System.out.println();

        }
    }
}
public class NormalInnerClass2 {
    public static void main(String [] args)
    {
        OuterA.InnerA obj=new OuterA().new InnerA();
        obj.InnerMethodA();

    }
}
