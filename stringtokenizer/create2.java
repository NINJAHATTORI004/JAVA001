package stringtokenizer;
import java.util.StringTokenizer;

public class create2 {
    public static void main(String []args){
        String s="bdscvebifaoincbiueavbfioawnd";
        StringTokenizer obj =new StringTokenizer(s,"a");
        while (obj.hasMoreElements())
            System.out.print(obj.nextToken()+" ");



    }
}
