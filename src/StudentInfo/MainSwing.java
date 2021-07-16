//creating this class in package StudentInfo for better management of multiple class files
package StudentInfo;

//importing required packages
import javax.swing.*;
import java.awt.event.*;

//public class for StudentInfo and CGPA along with the implementation of ActionListener
public class MainSwing implements ActionListener {
//declaring objs of JFrame, JPanel, JLabel, and JButton
    JFrame frame;
    JPanel pnl;
    JLabel aLbl, bLbl;
    JButton a, b;

//default constructor
    MainSwing() {
//creating frame and adding title
        frame = new JFrame("Select an Option");

//creating panel and setting its layout
        pnl = new JPanel();
        pnl.setLayout(null);

//creating buttons and labels
        a = new JButton("A");
        b = new JButton("B");
        aLbl = new JLabel("Your Personal Info: ");
        bLbl = new JLabel("Your CGPA: ");

//setting bounds of buttons and labels
        aLbl.setBounds(30, 100, 200, 20);
        a.setBounds(250,100, 50, 20);

        bLbl.setBounds(30, 150, 200, 20);
        b.setBounds(250,150, 50, 20);

//passing the buttons to actionListener to handle the event
        a.addActionListener(this);
        b.addActionListener(this);

//adding buttons and labels to the panel
        pnl.add(b);
        pnl.add(bLbl);
        pnl.add(a);
        pnl.add(aLbl);

//adding panel to frame, and setting size, visibility, layout, and defaultCloseOperation of JFrame
        frame.add(pnl);
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

//event handling for both buttons, setting the arguments while creating the new objects of both StudentInfo and CGPA class
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == a)
            new StudentInfoSwing("Amartya Sinha", "B.Sc. (Hons) C.S", "AC-1207", "Acharya Narendra Dev College");
        else
            new CGPASwing("9");
    }

//main method to call the obj of our class
    public static void main(String[] args) {
        new MainSwing();
    }
}
