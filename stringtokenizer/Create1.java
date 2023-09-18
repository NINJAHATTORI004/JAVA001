package stringtokenizer;
import java.util.StringTokenizer;

public class Create1 {
    public static void main(String[] args){
        String s=("one two three four five six seven ");
        StringTokenizer obj =new StringTokenizer(s);
        System.out.println("l:"+obj.nextToken());
        System.out.println("l:"+obj.nextToken());
        System.out.println("l:"+obj.nextToken());
        System.out.println("l:"+obj.nextToken());


    }
}
