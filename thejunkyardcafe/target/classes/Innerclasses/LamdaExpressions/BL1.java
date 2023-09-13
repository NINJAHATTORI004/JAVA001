package LamdaExpressions;
@FunctionalInterface
interface i1{
    void m1();//instance abstract
}
public class BL1  {
    public static void main(String[] args)
    {
        i1 obj = new i1()
        {// Anonymous class
            public void m1()
            {
                System.out.println("abstract method in "
                        + "interface defined through "
                        + "Anonymous class");
            }

        };
        obj.m1();

    }
}
