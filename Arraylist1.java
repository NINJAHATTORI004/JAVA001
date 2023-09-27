package ccollectionms;
import java.util.ArrayList;


public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<String> l1=new ArrayList<>();
        l1.add("one");
        l1.add("two");
        l1.add("three");
        l1.add("four");
        l1.add("five");

        ArrayList<String> l2=new ArrayList<>();
        l2.add("one");
        l2.add("eight");
        System.out.println(l1.containsAll(l2));



        System.out.println("l1"+l1);
        l1.remove(2);
        System.out.println("l2:"+l1);
        l1.clear();
        System.out.println(l1);






    }
}
