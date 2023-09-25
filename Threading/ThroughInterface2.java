package Threading;

import static java.lang.Thread.currentThread;
class B1 extends Thread{
    public void run(){
        System.out.println("run b1");
        System.out.println("inside run b1:"+currentThread());

    }
}
class B2 implements Runnable{
    public void run()
    {
        System.out.println("run b2");
        System.out.println("inside run b2:"+Thread.currentThread());
    }
}


public interface ThroughInterface2 {
    public static void main(String[] args) {
        B1 obj1=new B1();
        obj1.start();
        System.out.println(B1.currentThread()+"");
        B2 obj2=new B2();
        Thread t2=new Thread(obj2);
        t2.start();
        System.out.println(""+t2.currentThread());


    }
}
