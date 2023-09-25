package Threading;

public class aa extends Thread{
    public void run(){
        System.out.println("hi");

    }public static void main(String args[]){
        one obj=new one();
        obj.start();
    }
}

