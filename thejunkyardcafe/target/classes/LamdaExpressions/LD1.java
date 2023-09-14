package LamdaExpressions;
interface i1{
    void show();
}
public class LD1 {
    public static void main(String[] args){
        System.out.println("main class");
        i1 obj=new i1(){
            public void show(){
                    System.out.println("interface method"+"defination in anomynous class");

            }
        };
        obj.show();
    }

}
