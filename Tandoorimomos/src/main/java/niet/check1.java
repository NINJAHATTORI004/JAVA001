package niet;

import java.util.Scanner;
public class check1 {
    public static void main(String[] args)
    {
        System.out.println("Before - try catch");

        try{
            System.out.println("First LINE IN TRY");
            Scanner sc= new Scanner(System.in);
            int a= sc.nextInt();
            System.out.println("THIRD LINE IN TRY ");
        }
        catch(Exception e)
        {
            System.out.println(" Error message :"+e);
            System.out.println("Error message :"+e.getMessage());
        }
        System.out.println("Rest of the code");
    }
}


