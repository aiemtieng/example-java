import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class ex91a extends JFrame {
    public ex91a() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        add(new JLabel("Name"));
        add(new JTextField(10));

        JButton a = new JButton("OK");
        JButton b = new JButton("Cancle");
        JButton c = new JButton("Exit ");
        add(a);
        add(b);
        add(c);
    }

    public static void main(String[] args) {
        ex91a frame = new ex91a();
        frame.setTitle("Handle event");
        frame.setSize(400, 100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
