package Threading;
class User implements Runnable{
    public void run(){
        System.out.println("run method");

    }
}
public interface ThroughInterface {
    public static void main(String [] args){
        User obj1=new User();
        Thread th1=new Thread(obj1);
        th1.start();
    }
}
