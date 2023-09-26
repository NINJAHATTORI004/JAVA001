package ccollectionms;
import java.util.ArrayList;

import java.util.Collection;
import java.util.List;
import java.util.Iterator;


public class object {
    public static void main(String[] args) {
        ArrayList l1=new ArrayList();
        List l2=new ArrayList();
        Collection c1=new ArrayList();
        Iterable It=new ArrayList();

        l1.add(10);
        l1.add("orsini");
        l1.add(12.34f);
        l1.add(12.453);
        System.out.println(l1);



        l2.add(4343);
        l2.add("borgia");
        System.out.println(l2);



        c1.add("c1");
        c1.add(23);
        c1.add(1234);
        c1.add(4234234234324.4323423423423f);
        System.out.println(c1);
        for (Object b :c1)
            System.out.println(b+ " =>"+b.getClass());

    }
}
