package Threading;
import static java.lang.Thread.currentThread;

public class ThroughAnomynous2 {
    public static void main(String[] args) {
        Thread t1=new Thread()
        {
            public void run(){
                for (int i=1;i<=100;i++)
            System.out.println(currentThread().getName());
            }
        };
        Thread t2=new Thread()
        {
        public void run(){
            for  (int i=1;i<=100;i++)
                System.out.println(currentThread());
        }
        };
        t1.start();
        t2.start();

    }
}
