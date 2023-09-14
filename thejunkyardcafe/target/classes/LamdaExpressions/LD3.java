package LamdaExpressions;
@FunctionalInterface
interface i3{
    void displayI3(int a,String b);
}
public class LD3 {
    public static void main(String[] args)
    {
        i3 obj1 = (int c,String b)->{
            System.out.println("a: "+c);
            System.out.println("b: "+b);
        };

        obj1.displayI3(34, "hello world");

        i3 obj2 =(c,b)->{
            System.out.println("c :"+c);
            System.out.println("b :"+b);
        };
        obj2.displayI3(1234, "second way");
    }
}
