package JAva;
class P1{
    final static void method()
    {
        System.out.println("Static-final");
    }
    final  void method2()
    {
        System.out.println("instance -final");
    }
}

public class A1 extends P1
{/* final static void method()
    {
      System.out.println("Static-final");
    }*/ // Errror
    final  void method2(int a)
    {
        System.out.println("Over loading is possible");
    }
    public static void main(String[] args)
    {

        A1 obj = new A1();
        System.out.println();
        obj.method2(12);
        A1.method();
    }

}
