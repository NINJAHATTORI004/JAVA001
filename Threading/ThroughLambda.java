package Threading;

public class ThroughLambda {
    public static void main(String[] args) {
        Runnable obj1=()->{
            for (int i=0;i<=50;i++)
                System.out.println(Thread.currentThread().getName());

        };
        Thread t1=new Thread (obj1);
        t1.start();

    }
}
