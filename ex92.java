import javax.swing.*;
import java.awt.*;

public class ex92 extends JFrame {
    public ex92() {
        JPanel pJPanel = new JPanel();
        pJPanel.setLayout(new BorderLayout());

        JPanel p1JPanel = new JPanel();
        p1JPanel.setLayout(new FlowLayout());
        JPanel p2JPanel = new JPanel();
        p2JPanel.setLayout(new FlowLayout());

        JButton a = new JButton("Button 1");
        JButton b = new JButton("Button 2");
        JButton c = new JButton("Button 3");
        JButton d = new JButton("Button 4");
        JButton e = new JButton("Button 5");
        JButton f = new JButton("Button 6");

        pJPanel.add(p1JPanel, BorderLayout.SOUTH);
        pJPanel.add(p2JPanel, BorderLayout.CENTER);

        p1JPanel.add(a);
        p1JPanel.add(b);
        p1JPanel.add(c);
        p2JPanel.add(d);
        p2JPanel.add(e);
        p2JPanel.add(f);

        add(pJPanel);
    }

    public static void main(String[] args) {
        ex92 frame = new ex92();
        frame.setTitle("Exercise08_v2_01");
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
