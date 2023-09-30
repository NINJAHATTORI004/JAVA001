package awtt;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class myframe extends Frame{
    Frame f1;
    Label l1,l2;
    FlowLayout f;
    Button b;


    myframe(){
     f1=new Frame("ansh ");
     l1=new Label("label one");
     l2=new Label("label 2");
     f=new FlowLayout();
     b=new Button("click here");

        f1.setVisible(true);
        f1.setSize(500,500);
        f1.add(l1);
        f1.add(l2);
        f1.add(b);

        f1.addWindowFocusListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent w ){
                System.exit(0);
            }

        });
        f1.setLayout(f);

    }

}
public class MyGui1 {
    public static void main(String[] args) {
        myframe frame1=new myframe();


    }

}
