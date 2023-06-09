import javax.swing.*;
import java.awt.*;

public class ex91c extends JFrame {
    public ex91c() {
        JPanel a = new JPanel();

        JLabel xJLabel = new JLabel("Hello,My name is CPE320");
        JLabel yJLabel = new JLabel("Department of Computer Engineering");
        JLabel zJLabel = new JLabel("Srinakharinwirot University");
        JLabel wJLabel = new JLabel("Ongkarak Nakornnayok");

        xJLabel.setPreferredSize(new Dimension(370, 47));
        yJLabel.setPreferredSize(new Dimension(370, 47));
        zJLabel.setPreferredSize(new Dimension(370, 47));
        wJLabel.setPreferredSize(new Dimension(370, 47));

        a.add(xJLabel);
        a.add(yJLabel);
        a.add(zJLabel);
        a.add(wJLabel);

        add(a);
    }

    public static void main(String[] args) {
        ex91c frame = new ex91c();
        frame.setTitle("Exercise 7");
        frame.setSize(400, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
