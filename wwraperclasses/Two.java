package wwraperclasses;

public class Two {
    public static void main(String[] args) {
        Byte b=Byte.valueOf((byte)10);
        Integer i=Integer.valueOf(34);
        Double d=Double.valueOf(23.45);
        byte b1=b;
        int i1=i;
        double d1=d;
        System.out.println("b1:"+b1+"i1"+i1+"d1:"+d1);
    }
}
