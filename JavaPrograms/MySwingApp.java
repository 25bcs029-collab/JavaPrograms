import javax.swing.*;
import java.awt.*;

class MySwingApp{
public static void main(String [] args){
JFrame frame = new JFrame("My Swing App");

frame.setLayout(new FlowLayout());

JButton button = new JButton("Click me");
JLabel label = new JLabel("swing twing");//zahid uzain

frame.add(button);
frame.add(label);

frame.setSize(10000, 10000);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
}
