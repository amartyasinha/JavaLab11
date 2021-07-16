//creating this class in package StudentInfo for better management of multiple class files
package StudentInfo;

//importing required packages
import javax.swing.*;

//public class for displaying student info
public class StudentInfoSwing {
//declaring objs of JFrame, JPanel, JLabel, and JTextArea
    JFrame frameInfo;
    JPanel pnl;
    JLabel nameLbl, courseLbl, rollLbl, collegeLbl;
    JTextArea nameTxt, courseTxt, rollTxt, collegeTxt;

//parametrized constructor with student info as parameters
    StudentInfoSwing(String name, String course, String roll, String college) {
//creating frame, giving it title
        frameInfo = new JFrame("Student Info");

//creating panel and setting is layout to null
        pnl = new JPanel();
        pnl.setLayout(null);

//creating labels for name, course, roll, and clg
        nameLbl = new JLabel("Name: ");
        courseLbl = new JLabel("Course: ");
        rollLbl = new JLabel("Roll No.: ");
        collegeLbl = new JLabel("College: ");

//creating txtArea for name, course, roll, and clg
        nameTxt = new JTextArea(name);
        courseTxt = new JTextArea(course);
        rollTxt = new JTextArea(roll);
        collegeTxt = new JTextArea(college);

//setting bounds of all labels
        nameLbl.setBounds(50, 50, 80, 20);
        courseLbl.setBounds(50, 100, 80, 20);
        rollLbl.setBounds(50, 150, 80, 20);
        collegeLbl.setBounds(50, 200, 80, 20);

//setting bounds of all txtAreas
        nameTxt.setBounds(200, 50, 200, 20);
        courseTxt.setBounds(200, 100, 200, 20);
        rollTxt.setBounds(200, 150, 200, 20);
        collegeTxt.setBounds(200, 200, 200, 20);

//adding all labels and txtAreas to panel
        pnl.add(nameLbl);
        pnl.add(nameTxt);
        pnl.add(courseLbl);
        pnl.add(courseTxt);
        pnl.add(rollLbl);
        pnl.add(rollTxt);
        pnl.add(collegeLbl);
        pnl.add(collegeTxt);

//adding panel to frame, and then setting size, visibility, layout, and defaultCloseOperation of JFrame
        frameInfo.add(pnl);
        frameInfo.setSize(500, 300);
        frameInfo.setVisible(true);
        frameInfo.setLayout(null);
        frameInfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
