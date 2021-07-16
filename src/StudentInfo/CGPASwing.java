//creating this class in package StudentInfo for better management of multiple class files
package StudentInfo;

//importing required packages
import javax.swing.*;

//public class for displaying CGPA
public class CGPASwing {
//declaring objs of JFrame, JPanel, JLabel, and JTextArea
    JFrame frameCGPA;
    JPanel pnl;
    JLabel cgpaLbl;
    JTextArea cgpaTxt;

//parametrized constructor with CGPA as parameter
    CGPASwing(String cgpa) {
//creating frame and setting title
        frameCGPA = new JFrame("CGPA");

//creating panel and setting its layout
        pnl = new JPanel();
        pnl.setLayout(null);

//creating label and txtArea for CGPA
        cgpaLbl = new JLabel("Your CGPA is: ");
        cgpaTxt = new JTextArea(cgpa);

//setting bounds of label and bounds
        cgpaLbl.setBounds(50, 50, 80, 20);
        cgpaTxt.setBounds(150, 50, 100, 20);

//adding label and txtArea to panel
        pnl.add(cgpaLbl);
        pnl.add(cgpaTxt);

//adding panel to frame, and setting size, visibility, layout, and defaultCloseOperation for JFrame
        frameCGPA.add(pnl);
        frameCGPA.setSize(300, 200);
        frameCGPA.setVisible(true);
        frameCGPA.setLayout(null);
        frameCGPA.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
