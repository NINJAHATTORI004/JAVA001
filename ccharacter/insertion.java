package Streams.ccharacter;
import java.io.FileWriter;
import java.io.IOException;

public class insertion {
    public static void main(String[] args) throws IOException{
        FileWriter f1= new FileWriter("D:\\Batch 1\\char.txt");
        f1.write("this is char writer file"
                );
        f1.write(23);
        f1.write("12,3,4,,,3,3,",3,7);
        f1.flush();
        f1.close();
        System.out.println("created successfully");

    }
}
