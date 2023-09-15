package Streams.bbytestream.sequence;
import java.io.*;


public class SequenceStreams {
    public static void main(String [] args) throws FileNotFoundException,IOException{
        FileInputStream obj1=new FileInputStream("D:\\Batch 1\\First.txt");
        FileInputStream obj2=new FileInputStream("D:\\Batch 1\\First.txt");
        SequenceInputStream obj;
        obj=new SequenceInputStream(obj1,obj2);
        int j;
        System.out.println("=="+obj.available());
        while((j=obj.read())!=-1)
            System.out.print((char)j);

        System.out.println(" == "+obj.available());
        obj.close();
        obj1.close();
        obj2.close();





    }

}
