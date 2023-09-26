package ccollectionms;
import java.util.ArrayList;
import java.util.List;


class User{
    int age;
    int RollNo;
    String name;
    User(int a,int r,String n){
        this.name=n;
        this.RollNo=r;
        this.age=a;


    }
}
public class Object2 {
    public static void main(String[] args) {
        User obj1=new User(12,1344241,"abc");
        User obj2=new User(13,132534541,"chesere");
        User obj3=new User(14,1324145,"lucrezia");
        User obj4=new User(15,132431,"hanah");

        List l1=new ArrayList();
        l1.add(obj1);
        l1.add(obj2);
        l1.add(obj3);
        l1.add(obj4);
        for (Object b: l1)

        {
            System.out.println(l1);
        }


    }
}
