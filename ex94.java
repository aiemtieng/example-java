import javax.swing.*;
import java.awt.*;

public class ex94 extends JFrame {
    public ex94() {
        ImageIcon usIcon = new ImageIcon("img/UK.png");

        JButton jbt = new JButton("Click it", usIcon);
        jbt.setRolloverIcon(usIcon);
        add(jbt);

    }

    public static void main(String[] args) {
        ex94 frame = new ex94();
        frame.setTitle("Exercise08_v2_03");
        frame.setSize(500, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
