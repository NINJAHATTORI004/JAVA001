package Innerclasses;
class check1{
    void checkM1(){
        System.out.println("checkm1 in checkclass method");

    }
}

public class AnonymousClass2 {
    public static void main(String[] args ){
        check1 obj=new check1(){
            void checkM1(){
                System.out.println("check m1 class in main");

            }
            void checkM2(){
                System.out.println("check m1 class in main");

            }
        };
        obj.checkM1();

    }

}
