package ccollectionms;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class dequeue1 {
    public static void main(String[] args) {
        Deque<Integer> d1=new LinkedList();
        Deque<Integer> dd=new LinkedList();
        d1.add(10);
        dd.add(1);
        dd.add(2);
        dd.add(3);
        d1.addAll(dd);
        System.out.println("d1:"+d1);
        Deque<Integer> d2=new ArrayDeque();//downcASTING
        d2.add(100);
        System.out.println("d2:"+d2);



    }
}
