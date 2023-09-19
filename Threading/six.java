package Threading;




        import static java.lang.Thread.currentThread;

class Batch1D extends Thread{
    public void run()
    {
        currentThread().setName("Batch1");
        for(int i=0;i<=100;i++){
            System.out.println(currentThread().getName());
        }

    }

}
class Batch13D extends Thread{
    public void run()
    {
        currentThread().setName("Batch13");
        for(int i=0;i<=100;i++)
            System.out.println(currentThread().getName());

    }
}
public class six {
    public static void main(String[] args) {
        Batch1D obj1 = new Batch1D();
        Batch13D obj2= new Batch13D();
        System.out.println(" :"+obj1.getPriority());
        System.out.println(" :"+obj2.getPriority());
        obj1.setPriority(9);
        obj2.setPriority(10);
        System.out.println(" :"+obj1.getPriority());
        System.out.println(" :"+obj2.getPriority());
        obj1.start();
        obj2.start();



    }
}


