package thereadpractice;
class Parent{
    void thisIsParentsClassMethod(){
        System.out.println("parent");

    }
}
public class Annotations extends Parent {
    @Override
    void thisIsParentsClassMethod()
    {
        System.out.println("child");

    }
    public static void main(String [] args){
        Annotations obj=new Annotations();
        obj.thisIsParentsClassMethod();
    }
}
