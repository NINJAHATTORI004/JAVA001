package wwraperclasses;
class User{
    private  int i;
    public User (int i){
        this.i=i;

    }
}
public class CustomWrapper2 {
    public static void main(String[] args) {
        User obj=new User(13);
        System.out.println("obj:"+obj);
    }
}
