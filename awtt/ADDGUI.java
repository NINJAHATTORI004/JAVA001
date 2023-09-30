package awtt;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;
import javax.swing.*;



public class ADDGUI {
    public static void main(String[] args) {
        Addition obj=new Addition();

    }
}
class Addition extends JFrame implements ActionListener{
    JTextField t1,t2;
    JButton b;
    JLabel l;
    public Addition(){
        t1=new JTextField(20);
        t2=new JTextField(20);
        b=new JButton("ok");

    }


}
public void actionPerformed(ActionEvent ae){
    int num1=Integer.parseInt(t1.getText());
    int num2=Integer.parseInt(t2.getText());
    
}
