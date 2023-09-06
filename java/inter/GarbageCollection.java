package inter;
import java.util.*;
public class GarbageCollection {public static void main(String[] args)
{
    Runtime rc = Runtime.getRuntime();
    System.out.println(rc.freeMemory());
    rc.gc();
    System.out.println(rc.freeMemory());
    System.out.println("abd");
}

}
