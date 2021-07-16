//importing required packages
import javax.swing.*;
import java.awt.event.*;

//public class for checking pressed key
public class KeyPressedSwing {
//declaring objs of JFrame and JLabel
    JFrame frame;
    JLabel lbl;

//default constructor
    KeyPressedSwing() {
//creating frame, setting its title, and creating label, setting its title and alignment
        frame = new JFrame("Check which key is pressed");
        lbl = new JLabel("Press any Key", SwingConstants.CENTER);

//setting bounds of label
        lbl.setBounds(120, 150, 200, 20);

//event handling to check which key is pressed and then setting it to the label
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                lbl.setText("Typed Character is " + e.getKeyChar());
            }
        });
//adding label to the frame, setting size, visibility, and default close operation for JFrame
        frame.add(lbl);
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

//main method to call the obj of our class
    public static void main(String[] args) { new KeyPressedSwing(); }
}
