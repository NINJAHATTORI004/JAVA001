package ccollectionms;
import java.util.Iterator;

import java.util.ArrayList;

public class Generics2 {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(40);
        l1.add(32);
        System.out.println(l1);
        for (int i:l1)
            System.out.println(i);
        Iterator itr=l1.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());



    }
}
