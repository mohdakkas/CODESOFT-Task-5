





// import javax.swing.*;


//  public class Score extends JFrame{
    
 
//      Score(){
//         setLayout(null);


//         ImageIcon  ImageIcon= new  ImageIcon(ClassLoader.getSystemResource("score.png"));
//         JLabel Jlabel  = new JLabel(ImageIcon);
//         Jlabel.setBounds(100, 100, 200, 200);
//         add(Jlabel);


//     this.setSize(1200, 600);
//     this.setLocationRelativeTo(null);
//     this.setResizable(false);
//     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     this.setVisible(true);

//      }

   
//     public static void main(String[] args) {
//         new Score();


    
//    }

// }


// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;
// public class Score extends JFrame {

//     private JLabel jLabel;

//     Score() {
//         setLayout(null);

//         ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("score.png"));
//         jLabel = new JLabel(imageIcon);
//         add(jLabel);

//         JLabel heading = new JLabel(" thank you ");
//         heading.setBounds(400, 300, 50, 30);
//         setBackground(Color.BLUE);
//         add(heading);

//         // Set initial size and position
//         setSize(1400, 800);
//         positionLabel();

//         this.setLocationRelativeTo(null);
//         this.setResizable(false);
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setVisible(true);

                 
//             }
        
    

//     private void positionLabel() {
//         int labelWidth = jLabel.getIcon().getIconWidth();
//         int labelHeight = jLabel.getIcon().getIconHeight();
//         int x = 0; // X-coordinate for the bottom-left corner
//         int y = getHeight() - labelHeight - 30; // Adjusted for the window's insets
//         jLabel.setBounds(x, y, labelWidth, labelHeight);
//     }

//     public static void main(String[] args) {
//         new Score();
//     }
// }



import javax.swing.*;
import java.awt.*;

public class Score extends JFrame {

    private JLabel jLabel;

    Score() {
        setLayout(null);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("score.png"));
        jLabel = new JLabel(imageIcon);
        add(jLabel);

        JLabel heading = new JLabel("Thank you" + getName() + " plying");
        heading.setBounds(45, 30, 700, 13); // Adjusted size for better visibility
        heading.setFont(new Font("Tahoma", Font.PLAIN, 20)); // Set a font size for better visibility
        add(heading);

        getContentPane().setBackground(Color.white); // Set background color

        // Set initial size and position
        setSize(1400, 800);
        positionLabel();

        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void positionLabel() {
        int labelWidth = jLabel.getIcon().getIconWidth();
        int labelHeight = jLabel.getIcon().getIconHeight();
        int x = 0; // X-coordinate for the bottom-left corner
        int y = getHeight() - labelHeight - 30; // Adjusted for the window's insets
        jLabel.setBounds(x, y, labelWidth, labelHeight);
    }

    public static void main(String[] args) {
        new Score();
    }
}
