package niet;

public class Cholekulche {
    public static void main(String[] args){
    try{
        int a[]={1,2,3};
        System.out.println("first line in try");
        System.out.println(a[3]);
        System.out.println("third line of try");

    }
    catch(ArrayIndexOutOfBoundsException e)
    { System.out.println("error message:"+e);
System.out.println("error message "+e.getMessage());

    }
    catch(ArithmeticException e){
        System.out.println("error message:"+e);
        System.out.println("error message:"+e.getMessage());





























































    }
    System.out.println("rest of program");

}}
