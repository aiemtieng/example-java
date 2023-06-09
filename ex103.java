import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex103 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercise10_03");

        JPanel mainPanel = new JPanel(new GridLayout(3, 1));

        JPanel bottonPanel = new JPanel(new FlowLayout());
        ButtonGroup group = new ButtonGroup();
        JRadioButton red = new JRadioButton("Red");
        JRadioButton yellow = new JRadioButton("Yellow");
        JRadioButton white = new JRadioButton("White");
        JRadioButton gray = new JRadioButton("Gray");
        JRadioButton green = new JRadioButton("Green");
        group.add(red);
        group.add(yellow);
        group.add(white);
        group.add(gray);
        group.add(green);

        bottonPanel.add(red);
        bottonPanel.add(yellow);
        bottonPanel.add(white);
        bottonPanel.add(gray);
        bottonPanel.add(green);
        mainPanel.add(bottonPanel);

        JPanel colorPanel = new JPanel(new BorderLayout());
        colorPanel.setBackground(Color.YELLOW);
        mainPanel.add(colorPanel);

        JPanel shapePanel = new JPanel(new FlowLayout());
        JRadioButton rectangle = new JRadioButton("Rectangle");
        JRadioButton oval = new JRadioButton("Oval");
        shapePanel.add(rectangle);
        shapePanel.add(oval);
        mainPanel.add(shapePanel);

        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorPanel.setBackground(Color.red);
            }
        });
        yellow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorPanel.setBackground(Color.yellow);
            }
        });
        white.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorPanel.setBackground(Color.white);
            }
        });
        gray.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorPanel.setBackground(Color.gray);
            }
        });
        green.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorPanel.setBackground(Color.green);
            }
        });

        frame.add(mainPanel);
        frame.setSize(500, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }

}
