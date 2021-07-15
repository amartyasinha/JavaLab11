package StudentInfo;

import javax.swing.*;
import java.awt.event.*;

public class MainSwing implements ActionListener {
    JFrame frame;
    JPanel pnl;
    JLabel aLbl, bLbl;
    JButton a, b;

    MainSwing() {
        frame = new JFrame("Select an Option");
        pnl = new JPanel();
        pnl.setLayout(null);

        a = new JButton("A");
        b = new JButton("B");
        aLbl = new JLabel("Your Personal Info: ");
        bLbl = new JLabel("Your CGPA: ");

        aLbl.setBounds(30, 100, 200, 20);
        a.setBounds(250,100, 50, 20);

        bLbl.setBounds(30, 150, 200, 20);
        b.setBounds(250,150, 50, 20);

        a.addActionListener(this);
        b.addActionListener(this);

        pnl.add(b);
        pnl.add(bLbl);
        pnl.add(a);
        pnl.add(aLbl);

        frame.add(pnl);
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == a)
            new StudentInfoSwing("Amartya Sinha", "B.Sc. (Hons) C.S", "AC-1207", "Acharya Narendra Dev College");
        else
            new CGPASwing("9");
    }

    public static void main(String[] args) {
        new MainSwing();
    }
}
