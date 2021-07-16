//importing required packages
import javax.swing.*;
import java.awt.Color;

//public class in which we have extended JFrame
public class PinkBackgroundSwing extends JFrame {
//declaring obj of JLabel
    JLabel lbl;

//default constructor
    PinkBackgroundSwing() {
//creating title of JFrame
        super("Pink Background");

//creating JLabel obj, setting its bounds, and then adding it to JFrame
        lbl = new JLabel("PINK", SwingConstants.CENTER);
        lbl.setBounds(100, 150, 200, 25);
        add(lbl);

//setting BGColor, size, visibility, and defaultCloseOperation for JFrame
        getContentPane().setBackground(Color.PINK);
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

//main method to call the obj of our class
    public static void main(String[] args) {
        new PinkBackgroundSwing();
    }
}
