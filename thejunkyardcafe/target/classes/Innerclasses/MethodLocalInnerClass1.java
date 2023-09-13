package innerclasses;
class OuterClass1
{
    void OuterClass1method1()
    {
        System.out.println("Outer class method");
        class inner1
        {
            void inner1method1()
            {
                System.out.println(" Method local inner class");
                System.out.println("inner1method1");
            }
        }
        inner1 obj1= new inner1();
        obj1.inner1method1();
        System.out.println("End of the Method");
    }
}
public class MethodLocalInnerClass1 {
    public static void main(String[] args)
    {
        OuterClass1 obj = new OuterClass1();
        obj.OuterClass1method1();
    }

}

