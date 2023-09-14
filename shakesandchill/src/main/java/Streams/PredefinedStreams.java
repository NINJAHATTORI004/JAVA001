package Streams;
import java.io.IOException;

public class PredefinedStreams {
    public static void main(String[] args) throws IOException
    {
        int i = System.in.read();
        System.out.println(" i :"+i);
        System.out.println((char)i);
        System.out.println("Simple message");
        System.err.println("Error messge");
    }}

