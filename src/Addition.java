import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Addition extends JFrame implements ActionListener {
    JTextField t1, t2, t3;
    JLabel l1, l2, l3;
    JButton b1;

    public Addition() {
        setTitle("ADDITION");
        l1 = new JLabel("enter value");
        t1 = new JTextField(10);
        l2 = new JLabel("enter value");
        t2 = new JTextField(10);
        l3 = new JLabel("result");
        t3 = new JTextField(10);
        b1 = new JButton("ADD");
        b1.addActionListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        setVisible(true);
        setSize(300, 400);
        setLayout(new FlowLayout(FlowLayout.LEFT, 150, 10));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int number1 = Integer.parseInt(t1.getText());
        int number2 = Integer.parseInt(t2.getText());
        int sum = number1 + number2;
        t3.setText(String.valueOf(sum));
    }

    public static void main(String[] args) {
        new Addition();

    }
}

