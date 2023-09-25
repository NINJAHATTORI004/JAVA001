package TThreading;

import java.sql.SQLOutput;

class Counter{
    public static int i;
    public  synchronized static void count(){
        //System.out.println("i :"+(i++));
        i++;


    }
}
public class Syn1 {
    public static void main(String[] args) throws InterruptedException{

        Runnable r1=new Runnable(){
            @Override
            public void run(){
                for(int i=1;i<=100;i++)
                    Counter.count();


            }

        };
        Runnable r2=new Runnable(){
            @Override
            public void run(){
                for(int i=1;i<=1000;i++)
                    Counter.count();


            }

        };
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("main :"+Counter.i)
        ;




    }
}
