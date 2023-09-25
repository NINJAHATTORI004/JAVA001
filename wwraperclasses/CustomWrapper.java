package wwraperclasses;
class User{
    private int i;
    public User(int i)
    {
        this.i=i;

    }
    @Override
    public  String toString(){
        return Integer.toString(i);

    }
}
public class CustomWrapper {
    public static void main(String[] args) {
        User obj=new User(10);
        System.out.println("obj:"+obj);
    }
}
