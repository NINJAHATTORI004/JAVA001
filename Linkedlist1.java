package ccollectionms;
import java.util.Iterator;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist1 {
    public static void main(String[] args) {
        List<Integer> l1=new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);

        System.out.println("l1:"+l1);
        for (int i:l1)
            System.out.println(i);
        Iterator<Integer> it=l1.iterator();
        while(it.hasNext())
            System.out.println(it.next());






    }
}
