import javax.swing.*; 
import java.awt.*; 
import java.awt.event.MouseAdapter; 
import java.awt.event.MouseEvent; 

public class SimpleMouseEventDemo exteds JFrame{ 
private JLabel label; 

public SimpleMouseEventDemo(){ 
setTitle("Mouse Event Demo"); 
setSize(400, 300); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
setLayout(new BorderLayout());
label = new JLabel("", SwingConstants.CENTER); 
label.setFont(new Font("Arial", Font.PLAIN, 24)); 
add(label, BorderLayout.CENTER); 

addMouseListener(new MouseAdapter(){ 
public void mouseClicked(MouseEvent e){ 
label.setText("Mouse Clicked");
}
public void mousedEntered(MouseEvent e){
label.setText("mouse entered");
}
public void mouseExited(MouseEvent e){
label.setText("mouse exited");
}
});
setVisible(true);
} 
public static void main(String[] args) { 
new SimpleMouseEventDemo(); 
} 
}