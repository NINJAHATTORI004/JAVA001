package intt;
import java.util.*;

public class Check {

        public static int count=0;
        public Check()
        {
            count++;
        }
    public static void main(String [] args){
        System.out.println("check");
        Check c1=new Check();
        Check c2=new Check();
        Check c3=new Check();
        System.out.println(Check.count);
        Runtime rs=Runtime.getRuntime();

        c1=null;
        c2=null;
        c3=null;
        rs.gc();





    }
    protected void finalize()
}
