import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 

public class SimpleTrafficLightSimulator extends JFrame { 
private JLabel messageLabel; 

public SimpleTrafficLightSimulator() { 
setTitle("Traffic Light Simulator"); 
setSize(700,400);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
setLayout(new FlowLayout()); 

messageLabel = new JLabel(""); 
messageLabel.setFont(new Font("Arial", Font.BOLD,24));
add(messageLabel);

JRadioButton redButton = new JRadioButton("Red"); 
JRadioButton blueButton = new JRadioButton("megenta"); 
JRadioButton greenButton = new JRadioButton("green"); 
ButtonGroup group = new ButtonGroup(); 

group.add(redButton);
group.add(blueButton);
group.add(greenButton);
add(redButton);
add(blueButton);
add(greenButton);

redButton.addActionListener(e -> updateMessage("Stop", Color.RED)); 
blueButton.addActionListener(e -> updateMessage("Ready", Color.BLUE)); 
greenButton.addActionListener(e -> updateMessage("Go", Color.GREEN));
setVisible(true);
}

private void updateMessage(String message, Color color){
messageLabel.setText(message); 
messageLabel.setForeground(color); 
} 
public static void main(String[] args) { 
new SimpleTrafficLightSimulator(); 
} 
} 












 
