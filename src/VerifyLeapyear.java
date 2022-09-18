import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class VerifyLeapyear extends JFrame implements ActionListener{
    JLabel l1,l2;
    JTextField t1;
    JButton b1;
    public VerifyLeapyear(){
        setTitle("CHECK WHETHER GIVEN YEAR IS LEAP YEAR OR NOT");
        l1=new JLabel("enter the year");
        t1=new JTextField(10);
        b1=new JButton("submit");
        l2=new JLabel();
        b1.addActionListener(this);
        add(l1);
        add(t1);
        add(b1);
        add(l2);
        setLayout(new FlowLayout(FlowLayout.CENTER,150,10));
        setVisible(true);
        setSize(300,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        int year=Integer.parseInt(t1.getText());
        if(((year%4==0)&&(year%100!=0))||(year%400==0))
        {
            l2.setText("leap year");
            System.out.println("leap year");
        }
        else{
            l2.setText("not leap year");
            System.out.println("Not a leap year");
        }
    }
    public static void main(String args[]){
        new VerifyLeapyear();
    }
}
