package niet;

public class Check11 {
    public static void main(String[] args)
    {
        try{
            System.out.println("Try :"+(6/0));
        }

        finally{
            System.out.println("Finally");
        }
        System.out.println("Rest of the code");
    }
}


