package pizza900wala;

public class ThrowsClass {
    void method() throws ArithmeticException,NullPointerException,ArrayIndexOutOfBoundsException,NumberFormatException{
        throw new NullPointerException();


    }
    public static void main(String[] args) {
        System.out.println("before method call");
        ThrowsClass obj=new ThrowsClass();
        try{
            obj.method();
        }
        catch(RuntimeException e)
        {
            System.out.println("e:"+e);

        }
        System.out.println("after method caLL");


    }}