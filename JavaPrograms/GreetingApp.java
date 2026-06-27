import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GreetingApp extends JFrame implements ActionListener{
JLabel label;
JTextField t1;
JButton b;

GreetingApp(){
setTitle("Event handling demo");
setLayout(new FlowLayout());
}

label = new JLabel("enter name:");
t1 = new JTextField(15);
b = new JButton("Greet");
add(label);
add(t1);
add(b);

b.addActionListener(this);
setSize(599,289);

setDefaultcloseOperationJFrame.EXIT_ON_CLOSE);
setVisible(true);
}

public void actionPerformed(ActionEvent e){
String name = t1.getText();
label.setText("Hello" + name + "!");
}

public static void main(String[] args){
new GreetingApp();
}
}





















