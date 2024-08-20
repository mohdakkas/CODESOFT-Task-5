import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rule extends JFrame implements ActionListener {

    JButton Back, start;
    String name;


    Rule( ) 
    { this.name = name;
        // super("Rule");
        setLayout(null); // Setting layout to null for absolute positioning

        JLabel heading = new JLabel("welcome to the rule");
        heading.setFont(new Font("Arial", Font.BOLD, 24));
        heading.setBounds(50, 20, 700, 30);
        add(heading);

        JLabel rule = new JLabel();
        rule.setFont(new Font("Arial", Font.PLAIN, 24));
        rule.setBounds(20, 90, 1150, 400);
        rule.setText(
            "<html>" +
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "</html>"
        );
        add(rule);

        start = new JButton("start");
        start.setBackground(new Color(30, 144, 254));
        start.setBounds(400, 500, 100, 30); // Setting bounds for the button
        start.addActionListener(this);
        add(start);

        Back = new JButton("Back");
        Back.setBackground(new Color(30, 144, 254));
        Back.setBounds(600, 500, 100, 30); // Setting bounds for the button
        Back.addActionListener(this);
        add(Back);

        setSize(1200, 650);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            // Add logic for start button
            setVisible(false);
            new quiz1(name);
            // new Rule();
        } else if (ae.getSource() == Back) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Rule class to display the frame
        new Rule();
    }
}
