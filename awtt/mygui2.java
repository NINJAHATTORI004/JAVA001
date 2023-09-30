package awtt;

import javax.swing.*;
import java.awt.*;

class myframe2 extends JFrame{
    JFrame f1;
    JLabel l1,l2;
    GridLayout g1;
    JButton b;
    JTextField t;




    myframe2(){
        f1=new JFrame();
        l1=new JLabel("one");
        l2=new JLabel("two");
        g1=new GridLayout(2,1);
        b=new JButton("click here");
        t=new JTextField("first");





        f1.setVisible(true);
        f1.setSize(500,500);
        f1.add(l1);
        f1.add(l2);
        f1.add(b);
        f1.add(t);

Component add=f1.add(t);

        f1.setLayout(new FlowLayout());



    }
}
public class mygui2 {
    public static void main(String[] args) {
             myframe2 frame1=new myframe2();


    }
}
