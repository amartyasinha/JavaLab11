//importing required packages
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

//public class that is implementing ActionListener to handle Button Events
public class ButtonColorChangeSwing implements ActionListener {
//declaring objs of JFrame, JButton
    JFrame frame;
    JButton redButton, blueButton;

//default constructor
    ButtonColorChangeSwing() {
//creating frame and giving it a title
        frame = new JFrame("Button Color Change");

//creating redButton, setting its bounds, passing it to actionListener, and then adding to JFrame
        redButton = new JButton("RED");
        redButton.setBounds(120, 90, 150, 20);
        redButton.addActionListener(this);
        frame.add(redButton);

//creating blueButton, setting its bounds, passing it to actionListener, and then adding to JFrame
        blueButton = new JButton("BLUE");
        blueButton.setBounds(120, 150, 150, 20);
        blueButton.addActionListener(this);
        frame.add(blueButton);

//setting JFrame size, layout, visibility, and defaultCloseOperation
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

//handling button events (action event) by changing the BGColor
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == redButton)
            frame.getContentPane().setBackground(Color.RED);
        if (ae.getSource() == blueButton)
            frame.getContentPane().setBackground(Color.BLUE);
    }

//main method to call the obj of our class
    public static void main(String[] args) { new ButtonColorChangeSwing(); }
}
