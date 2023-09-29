package collectionsssssssssss;
import java.util.*;

public class map1 {
    public static void main(String[] args) {
        Map<String,Integer> m1=new HashMap();
        HashMap<String,Integer> m2=new HashMap();
        m2.put("MANGO0",40);
        m2.put("mANGO",40);
        m2.put("MANgo",50);
        m2.put("grapes",45);
        System.out.println("m2:"+m2);
        m2.put("leechi",43);

        System.out.println("m2:"+m2);
        System.out.println(m2.entrySet());
        System.out.println(m2.keySet());
        System.out.println(m2.values());



        LinkedHashMap<String,Integer> lm2=new LinkedHashMap();
        Map<String,Integer> Tm1=new TreeMap();


        Set<Integer> s1;



    }
}
