package StudentInfo;

import javax.swing.*;

public class StudentInfoSwing {
    JFrame frameInfo;
    JPanel pnl;
    JLabel nameLbl, courseLbl, rollLbl, collegeLbl;
    JTextArea nameTxt, courseTxt, rollTxt, collegeTxt;

    StudentInfoSwing(String name, String course, String roll, String college) {
        frameInfo = new JFrame("Student Info");
        pnl = new JPanel();

        pnl.setLayout(null);

        nameLbl = new JLabel("Name: ");
        courseLbl = new JLabel("Course: ");
        rollLbl = new JLabel("Roll No.: ");
        collegeLbl = new JLabel("College: ");

        nameTxt = new JTextArea(name);
        courseTxt = new JTextArea(course);
        rollTxt = new JTextArea(roll);
        collegeTxt = new JTextArea(college);

        nameLbl.setBounds(50, 50, 80, 20);
        nameTxt.setBounds(200, 50, 200, 20);
        nameTxt.setEditable(false);

        courseLbl.setBounds(50, 100, 80, 20);
        courseTxt.setBounds(200, 100, 200, 20);
        courseTxt.setEditable(false);

        rollLbl.setBounds(50, 150, 80, 20);
        rollTxt.setBounds(200, 150, 200, 20);
        rollTxt.setEditable(false);

        collegeLbl.setBounds(50, 200, 80, 20);
        collegeTxt.setBounds(200, 200, 200, 20);
        collegeTxt.setEditable(false);

        pnl.add(nameLbl);
        pnl.add(nameTxt);
        pnl.add(courseLbl);
        pnl.add(courseTxt);
        pnl.add(rollLbl);
        pnl.add(rollTxt);
        pnl.add(collegeLbl);
        pnl.add(collegeTxt);

        frameInfo.add(pnl);
        frameInfo.setSize(500, 300);
        frameInfo.setVisible(true);
        frameInfo.setLayout(null);
        frameInfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
