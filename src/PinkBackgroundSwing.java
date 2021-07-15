import javax.swing.*;
import java.awt.*;


public class PinkBackgroundSwing extends JFrame {
    JLabel lbl;
    PinkBackgroundSwing() {
        super("Pink Background");

        lbl = new JLabel("PINK", SwingConstants.CENTER);
        lbl.setBounds(100, 150, 200, 25);
        add(lbl);

        getContentPane().setBackground(Color.PINK);
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new PinkBackgroundSwing();
    }
}
