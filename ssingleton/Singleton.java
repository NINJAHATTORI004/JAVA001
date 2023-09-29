package ssingleton;
class tajmahal{
     static tajmahal obj=new tajmahal();

    private tajmahal()
    {

    }
    public static tajmahal getInstance(){
        return obj;

    }
}
public class Singleton {
    public static void main(String[] args) {
        tajmahal t1=tajmahal.getInstance();



    }

}
