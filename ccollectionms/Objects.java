package ccollectionms;
class Parent{
    void m1(){
        System.out.println("parent");

    }
}
public class Objects extends Parent {
    void m1(){
        System.out.println("child");

    }
    void m2(){
        System.out.println("child");

    }

    public static void main(String[] args) {
        Parent obj=new Objects();
        obj.m1();






    }
}
