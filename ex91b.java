import javax.swing.*;
import java.awt.*;

public class ex91b extends JFrame {
    public ex91b() {
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());

        JButton a = new JButton("OK");
        JButton b = new JButton("Cancel");
        JButton c = new JButton("Exit");
        JLabel d = new JLabel("Name");
        JTextField e = new JTextField(20);

        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());

        p.add(p1, BorderLayout.NORTH);
        p1.add(d, BorderLayout.WEST);
        p1.add(e, BorderLayout.CENTER);

        p.add(p2, BorderLayout.SOUTH);
        p2.add(a, BorderLayout.WEST);
        p2.add(b, BorderLayout.CENTER);
        p2.add(c, BorderLayout.EAST);

        add(p);
    }

    public static void main(String[] args) {
        ex91b frame = new ex91b();
        frame.setTitle("Handle Event");
        frame.setSize(400, 100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
