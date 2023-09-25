package Threading;




public class ThroughAnonymous {
    public static void main(String[] args) {
        Runnable obj1=new Runnable(){
            public void run(){
                for(int i=0;i<=50;i++)
                    System.out.println( Thread.currentThread().getName());

            }
        };
        Runnable obj2=new Runnable()
        {
            public void run(){
                for(int i=0;i<=50;i++)
                    System.out.println(Thread.currentThread());

            }
        };


      Thread t1=new Thread(obj1);
      Thread t2=new Thread(obj2);



    }

}
