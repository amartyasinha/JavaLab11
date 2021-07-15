package StudentInfo;

import javax.swing.*;

public class CGPASwing {
    JFrame frameCGPA;
    JPanel pnl;
    JLabel cgpaLbl;
    JTextArea cgpaTxt;

    CGPASwing(String cgpa) {
        frameCGPA = new JFrame("CGPA");
        pnl = new JPanel();
        pnl.setLayout(null);

        cgpaLbl = new JLabel("Your CGPA is: ");
        cgpaTxt = new JTextArea(cgpa);

        cgpaLbl.setBounds(50, 50, 80, 20);
        cgpaTxt.setBounds(150, 50, 100, 20);
        cgpaTxt.setEditable(false);

        pnl.add(cgpaLbl);
        pnl.add(cgpaTxt);

        frameCGPA.add(pnl);
        frameCGPA.setSize(300, 200);
        frameCGPA.setVisible(true);
        frameCGPA.setLayout(null);
        frameCGPA.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
