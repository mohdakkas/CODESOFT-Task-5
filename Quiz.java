


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz extends JFrame implements ActionListener {

    // Define components
    private JTextField tfname;
    private JButton rule;
    private JButton back;

    public Quiz() {
        // Set frame title
        super("Quiz");

        // Create the heading label
        JLabel heading = new JLabel("Welcome to the Quiz");
        heading.setFont(new Font("Arial", Font.BOLD, 24));
        heading.setHorizontalAlignment(JLabel.CENTER);

        // Create the name label
        JLabel name = new JLabel("Enter your name ");
        name.setFont(new Font("Arial", Font.BOLD, 24));
        name.setHorizontalAlignment(JLabel.CENTER);

        // Initialize text field
        tfname = new JTextField(20); // Specify columns instead of bounds
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));

        // Initialize buttons
        rule = new JButton("Rule");
        rule.setBackground(new Color(30, 144, 254));
        rule.setBounds(600, 400, 600, 40);
        rule.setForeground(Color.WHITE);
        rule.addActionListener(this);

        back = new JButton("Back");
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);

        // Load the image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("login.jpeg"));
        JLabel image = new JLabel(i1);

        // Create a panel for the image and set its layout to FlowLayout.LEFT
        JPanel imagePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        imagePanel.add(image);

        // Create a panel with BorderLayout for the overall layout
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(heading, BorderLayout.NORTH);

        // Create a panel for name input and buttons
        JPanel inputPanel = new JPanel();
        inputPanel.add(name);
        inputPanel.add(tfname);
        inputPanel.add(rule);
        inputPanel.add(back);

        mainPanel.add(inputPanel, BorderLayout.CENTER);
        mainPanel.add(imagePanel, BorderLayout.WEST);

        // Add the main panel to the frame
        add(mainPanel);

        // Set frame properties
        setSize(1200, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rule) {
            // Add logic for Rule button
            setVisible(false);
            new Rule();
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Quiz class
        new Quiz();
    }
}

