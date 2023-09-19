package Streams.bbytestream.files;
import javax.imageio.IIOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;


public class folder { public static void main(String [] args)  {
    Path dir=Paths.get("D:\\Batch 1\\New Folder");

    Path create=Files.createDirectory(dir);
    FileInputStream Reading=new FileInputStream("Desktop\\abcd.jpg");
    BufferedInputStream bR=new BufferedInputStream(Reading);
    FileOutputStream obj=new FileOutputStream(dir+"\\abcd.jpg");
    BufferedOutputStream bw=new BufferedOutputStream(obj);

    int i;
    while((i=bR.read())!=-1)
        bw.write(i);
    bw.flush();
    bw.close();



}
}
