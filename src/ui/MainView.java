package ui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import java.awt.*;

public class MainView {
    private JFrame frame;
    private JPanel panel;

    public static void main(String[] args) {
        new MainView().drawUI();
    }
    
    public void drawUI() {
        panel = new JPanel();
        frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel text = new JLabel("My feng bruhh", JLabel.CENTER);
        text.setBounds(100, 300, 100, 50);
        frame.add(text);
    }
}
