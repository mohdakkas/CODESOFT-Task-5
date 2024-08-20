


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    private JButton rule;
    private JButton back;
    private JButton next;
    Login() {
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon imageIcon = new ImageIcon(getClass().getResource("login.jpeg"));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0, 0, 600, 500);
        add(label);

        JLabel heading = new JLabel("WELCOME TO QUIZ ");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        heading.setForeground(new Color(44, 56, 77));
        add(heading);

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(810, 150, 300, 45);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        name.setForeground(new Color(44, 56, 77));
        add(name);

        JTextField tfname = new JTextField();
        tfname.setBounds(734, 200, 300, 20);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(tfname);

        rule = new JButton("Rule");
        rule.setBackground(new Color(30, 144, 254));
        rule.setBounds(735, 270, 120, 40);
        rule.setForeground(Color.WHITE);
        rule.addActionListener(this);  // Adding action listener
        add(rule);

        back = new JButton("Back");
        back.setBackground(new Color(30, 144, 254));
        back.setBounds(935, 270, 120, 40);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);  // Adding action listener
        add(back);

        next = new JButton("Next");
        next.setBounds(735, 400, 144, 44);
        next.setBackground(new Color(30, 144, 254));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        this.setSize(1200, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            setVisible(false);
            new Next();
        } else if (ae.getSource() == back) {
            setVisible(false);
         } 
    }

    public static void main(String[] args) {
        new Login();
    }
}
