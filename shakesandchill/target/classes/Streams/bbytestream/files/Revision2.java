package Streams.bbytestream.files;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Revision2 {
    public static void main(String[] args) throws FileNotFoundException ,IOException{
        FileInputStream obj = new FileInputStream(""
                + "D:\\Batch 1\\First.txt");
        System.out.println("avaiable byte streams in file :"+obj.available());

        System.out.println(" "+obj.read());
        System.out.println(" "+obj.read());

        int i;
        while((i=obj.read())!=-1)
            System.out.print(i+" ");
    }
}

