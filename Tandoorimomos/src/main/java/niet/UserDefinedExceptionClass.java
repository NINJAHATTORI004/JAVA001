package niet;

class UserDefinedExceptionClass  extends Exception
{UserDefinedExceptionClass(String s)
{
    System.out.println("No break Exception :"+s);
}
    public String toString()
    {
        return "Userdefined error message";
    }
}
public class check {
    public static void main(String[] args)
    {
        System.out.println("Check");
        try{
            throw new UserDefinedExceptionClass(" ");
        }
        catch(UserDefinedExceptionClass e)
        {

            System.out.println(e.getMessage());
            System.out.println(" e :"+e);
            e.printStackTrace();

        }
    }
}


