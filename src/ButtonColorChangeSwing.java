import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class ButtonColorChangeSwing implements ActionListener {
    JFrame frame;
    JButton redButton, blueButton;

    ButtonColorChangeSwing() {
        frame = new JFrame("Button Color Change");

        redButton = new JButton("RED");
        redButton.setBounds(120, 90, 150, 20);
        redButton.addActionListener(this);
        frame.add(redButton);

        blueButton = new JButton("BLUE");
        blueButton.setBounds(120, 150, 150, 20);
        blueButton.addActionListener(this);
        frame.add(blueButton);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == redButton)
            frame.getContentPane().setBackground(Color.RED);
        if (ae.getSource() == blueButton)
            frame.getContentPane().setBackground(Color.BLUE);
    }

    public static void main(String[] args) {
        new ButtonColorChangeSwing();
    }
}
