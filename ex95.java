import javax.swing.*;
import java.awt.*;

public class ex95 extends JFrame {
    public ex95() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(10, 10));

        for (int i = 1; i <= 100; i++) {
            int ran = (int) (Math.random() * 2);
            p.add(new JLabel("" + ran, SwingConstants.CENTER));
        }
        add(p);
    }

    public static void main(String[] args) {
        ex95 frame = new ex95();
        frame.setTitle("Exercise08_v2_04");
        frame.setSize(300, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
