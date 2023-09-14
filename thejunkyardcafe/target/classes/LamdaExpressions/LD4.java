package LamdaExpressions;
import java.util.Scanner;
@FunctionalInterface
interface i4{
    int displayi4();
}
public class LD4 {
    public static void main(String[] args) {
        i4 obj1;
        obj1 = ()->{
            Scanner sc = new Scanner(System.in);
            //int a=sc.nextInt();
            System.out.println("Enter the data :");
            return sc.nextInt();   //return a;
        };
        System.out.println("obj1 :"+obj1.displayi4());
        i4 obj2=()->10;
        System.out.println("obj2 :"+obj2.displayi4());

    }}
