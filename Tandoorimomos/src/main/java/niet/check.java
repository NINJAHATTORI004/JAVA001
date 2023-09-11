package niet;
public class check {
    public static void main(String[] args)
    {
        System.out.println("before try catch");
        try{
            System.out.println("first line in try");


            System.out.println(5/0);


        }
        catch(ArithmeticException e)
        {
            System.out.println("error message"+e);

        }
        System.out.println("rest of the code");

    }
}
