package ccollectionms;
import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;

public class Queue1 {
    public static void main(String[] args) {
        Queue<Integer> q1=new LinkedList();
        q1.add(10);
        q1.offer(20);
        q1.offer(30);
        q1.offer(40);
        System.out.println(q1);
        System.out.println("enqueue:");
        q1.offer(50);




    }
}
