


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Next extends JFrame implements ActionListener {

    JButton back, start;
    Next() {
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel heading = new JLabel("WELCOME TO QUIZ ");
        heading.setBounds(50, 20, 700, 45);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        heading.setForeground(new Color(44, 56, 77));
        add(heading);

        JLabel next = new JLabel();
        next.setFont(new Font("Arial", Font.PLAIN, 18)); // Slightly smaller font for better fit
        next.setBounds(20, 80, 1140, 460); // Adjusted size to fit all content
        next.setText(
            "<html>" +
                "1. You are trained to be a programmer and not a storyteller, answer point to point.<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer.<br><br>" +
                "3. You may have a lot of options in life but here all the questions are compulsory.<br><br>" +
                "4. Crying is allowed but please do so quietly.<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise).<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, maybe he/she is doing Jai Mata Di.<br><br>" +
                "7. Brace yourself, this paper is not for the faint-hearted.<br><br>" +
                "8. May you know more than what Jon Snow knows. Good Luck!<br><br>" +
            "</html>"
        );
        add(next);


        back = new JButton("Back");
        back.setBackground(new Color(30, 144, 254));
        back.setBounds(250, 500, 120, 40);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
    
        add(back);

        start = new JButton("Start");
        start.setBounds(400, 500, 144, 44);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        this.setSize(1200, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    @Override
    public  void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz2();

        } else if (ae.getSource() == back){
            setVisible(false);
        }
        }

    

    public static void main(String[] args) {
        new Next();
    }
}

