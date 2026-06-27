//To create a simple Java GUI application that simulates a traffic light using radio buttons to display  corresponding messages and colors for "Stop," "Ready," and "Go."

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLight extends JFrame implements ActionListener {

    private JRadioButton stopButton, readyButton, goButton;
    private JLabel messageLabel;
    private JPanel mainPanel;

    public TrafficLight() {

        // Frame settings
        setTitle("Traffic Light Simulator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create main panel
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Create label
        messageLabel = new JLabel("Select a Signal", JLabel.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 22));
        mainPanel.add(messageLabel, BorderLayout.CENTER);

        // Create radio buttons
        stopButton = new JRadioButton("Stop");
        readyButton = new JRadioButton("Ready");
        goButton = new JRadioButton("Go");

        // Group radio buttons (only one selected at a time)
        ButtonGroup group = new ButtonGroup();
        group.add(stopButton);
        group.add(readyButton);
        group.add(goButton);

        // Add action listener
        stopButton.addActionListener(this);
        readyButton.addActionListener(this);
        goButton.addActionListener(this);

        // Add buttons to panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(stopButton);
        buttonPanel.add(readyButton);
        buttonPanel.add(goButton);

        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (stopButton.isSelected()) {
            mainPanel.setBackground(Color.RED);
            messageLabel.setText("STOP");
        } 
        else if (readyButton.isSelected()) {
            mainPanel.setBackground(Color.YELLOW);
            messageLabel.setText("READY");
        } 
        else if (goButton.isSelected()) {
            mainPanel.setBackground(Color.GREEN);
            messageLabel.setText("GO");
        }
    }

    public static void main(String[] args) {
        new TrafficLight().setVisible(true);
    }
}