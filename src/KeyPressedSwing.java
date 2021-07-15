import javax.swing.*;
import java.awt.event.*;

public class KeyPressedSwing {
    JFrame frame;
    JLabel lbl;

    KeyPressedSwing() {
        frame = new JFrame("Check which key is pressed");
        lbl = new JLabel("Press any Key", SwingConstants.CENTER);

        lbl.setBounds(120, 150, 200, 20);

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                lbl.setText("Typed Character is " + e.getKeyChar());
            }
        });
        frame.add(lbl);

        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) { new KeyPressedSwing(); }
}
