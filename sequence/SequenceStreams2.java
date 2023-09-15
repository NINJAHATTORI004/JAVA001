package Streams.bbytestream.sequence;
import java.io.*;

public class SequenceStreams2 {
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileInputStream obj1= new FileInputStream("D:\\Batch 1\\First.txt");
        FileInputStream obj2= new FileInputStream("D:\\Batch 1\\First.txt");
        SequenceInputStream obj;
        obj = new SequenceInputStream(obj1,obj2);
        int j;

        FileOutputStream newfile = new FileOutputStream(""
                + "D:\\Batch 1\\First.txt");

        while((j=obj.read())!=-1)
            newfile.write(j);

        FileInputStream rr= new FileInputStream("D:\\Batch 1\\First.txt");

        int i;
        while((i=rr.read())!=-1)
            System.out.print((char)i);

    }

}
