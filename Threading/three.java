package Threading;
import static java.lang.Thread.currentThread;
class batch1b extends Thread{
    public void run(){
        for (int i=0;i<=100;i++)
            System.out.println(currentThread().getName());
    }
}
class batch13b extends Thread{
public void run()
{
    for(int i=0;i<=100;i++)
        System.out.println(currentThread().getName());


}
}
public class three {
    public static void main(String[] args){
        batch1b obj1=new batch1b();
         batch13b obj2=new batch13b();
        obj1.start();
        obj2.start();



    }
}
