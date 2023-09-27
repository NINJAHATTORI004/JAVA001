package ccollectionms;
import java.util.LinkedList;
import java.util.List;

import java.util.Stack;
import java.util.Vector;
import java.util.ArrayList;

public class STACKK {
    public static void main(String[] args) {
        List<Integer> l1=new Stack();
        l1.add(10);

        Vector <Integer> v1=new Stack();
        v1.addElement(10);
        System.out.println("v1"+v1);




        Stack<Integer> s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);

        System.out.println("s1"+s1);

        System.out.println(s1.pop()+"s1:"+s1);
        s1.search(10);
        System.out.println(s1.search(10));




    }
}
