//To create a simple Java calculator using a GUI that performs basic arithmetic operations and handles exceptions like division by zero.

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
public class SimpleCalculator extends JFrame implements ActionListener { 
// Components 
JTextField display; 
double num1 = 0, num2 = 0, result = 0; 
char operator; 
// Constructor 
public SimpleCalculator() { 
// Frame settings 
setTitle("Simple Calculator"); 
setSize(300, 400); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
setLayout(new BorderLayout()); 
// Create display field 
display = new JTextField(); 
display.setEditable(false); 
add(display, BorderLayout.NORTH); 
// Create panel for buttons 
JPanel panel = new JPanel(); 
panel.setLayout(new GridLayout(4, 4)); 
// Button labels 
String[] buttons = { 
"7", "8", "9", "+", 
"4", "5", "6", "-", 
"1", "2", "3", "*", 
"C", "0", "=", "/" 
}; 
// Add buttons to panel 
for (String text : buttons) { 
JButton button = new JButton(text); 
button.addActionListener(this); 
panel.add(button); 
} 
add(panel); 
// Set frame visibility  
setVisible(true); 
} 
// Action handling 
@Override 
public void actionPerformed(ActionEvent e) { 
String command = e.getActionCommand(); 
if (command.charAt(0) >= '0' && command.charAt(0) <= '9') { 
// If a number is pressed, append to display 
display.setText(display.getText() + command); 
} else if (command.equals("C")) { 
// Clear the display 
display.setText(""); 
num1 = num2 = result = 0; 
} else if (command.equals("=")) { 
// Perform calculation 
num2 = Double.parseDouble(display.getText()); 
switch (operator) { 
case '+': result = num1 + num2; break; 
case '-': result = num1 - num2; break; 
case '*': result = num1 * num2; break; 
case '/':  
if (num2 != 0) { 
result = num1 / num2; 
} else { 
display.setText("Error"); 
return; 
} 
break; 
} 
display.setText(String.valueOf(result)); 
} else { 
// Store the first number and the operator 
num1 = Double.parseDouble(display.getText()); 
operator = command.charAt(0); 
display.setText(""); 
} 
} 
// Main method to run the calculator 
public static void main(String[] args) { 
new SimpleCalculator(); 
} 
}