package Innerclasses;



class OuterL{
    static void methodA()
    {
        abstract class Z{
            abstract void m1();
            static void m2(){
                System.out.println("non abstract in z");

            }
        }
        class InnerA extends Z{
            void m1()
            {
                System.out.println("abstract m2() -z in A");


            }
            void InnerA(){
                System.out.println("inner A");

            }

        }
        InnerA obj =new InnerA();
        obj.InnerA();
        obj.m1();
        Z.m2();


    }
}
public class MethodLocalInnerClass {
public static void main(String [] args){
    OuterL.methodA();

}
}

