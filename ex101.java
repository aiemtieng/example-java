import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * event
 */
public class ex101 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");

        JPanel panel = new JPanel(new GridLayout(2, 1));
        JTextField txt1 = new JTextField("", 10);
        JTextField txt2 = new JTextField("", 10);
        JButton add = new JButton("Add");
        JButton minus = new JButton("Minus");
        JButton mul = new JButton("Multiply");
        JButton div = new JButton("Divide");
        JLabel result = new JLabel("0");

        JPanel line1 = new JPanel();
        line1.add(txt1);
        line1.add(txt2);
        line1.add(add);
        line1.add(minus);
        line1.add(mul);
        line1.add(div);
        line1.add(result);

        add.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int samp = Integer.parseInt(txt1.getText()) + Integer.parseInt(txt2.getText());
                result.setText(Integer.toString(samp));
            }
        });

        minus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int samp = Integer.parseInt(txt1.getText()) - Integer.parseInt(txt2.getText());
                result.setText(Integer.toString(samp));
            }
        });
        mul.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int samp = Integer.parseInt(txt1.getText()) * Integer.parseInt(txt2.getText());
                result.setText(Integer.toString(samp));
            }
        });
        div.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int samp = Integer.parseInt(txt1.getText()) / Integer.parseInt(txt2.getText());
                result.setText(Integer.toString(samp));
            }
        });

        panel.add(line1);

        frame.add(panel);
        frame.setSize(500, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }
}
