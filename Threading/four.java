package Threading;


import static java.lang.Thread.currentThread;

class Batch1C extends Thread{
    public void run()
    {
        currentThread().setName("Batch1");
        for(int i=0;i<=5;i++){
            System.out.println(currentThread().getName());
        }

    }

}
class Batch13C extends Thread{
    public void run()
    {
        currentThread().setName("Batch13");
        for(int i=0;i<=5;i++)
            System.out.println(currentThread().getName());

    }
}
public class four {

    public static void main(String[] args) {
        Batch1C obj1 = new Batch1C();
        Batch13C obj2 = new Batch13C();
        obj1.start();
        try{
            Batch1C.sleep(1000);
        }catch(InterruptedException e)
        {
            System.out.println("e :"+e);
        }
        obj2.start();

    }
}


