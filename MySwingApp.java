import javax.swing.*;

class MySwingApp{
public static void main(String [] args){
JFrame frame = new JFrame("My Swing App");
frame.setLayout(new FlowLayout());
JButton button = new JButton("Click me");
JLabel label = new JLabel("swing twing");
frame.add(button);
frame.add(label);
frame.setSize(500,200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
}
