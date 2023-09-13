package Innerclasses;
class Outer6{
    static void method6(){
        final class Inner{
            void method(){
                System.out.println("final class method");

            }

        }
        Inner obj=new Inner();
        obj.method();

    }
}

public class MethodLocalInnerClass4 {
    public static void main(String[] args){
        Outer6.method6();
    }
}
