import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exEvent01 extends JFrame {
    JLabel number1 = new JLabel("Number 1");
    JLabel number2 = new JLabel("Number 2");
    JLabel result = new JLabel("Result");

    JTextField numberone = new JTextField("", 5);
    JTextField numbertwo = new JTextField("", 5);

    JButton Add = new JButton("Add");
    JButton Subtract = new JButton("Subtract");
    JButton Multiply = new JButton("Multiply");
    JButton Divide = new JButton("Divide");

    
    Subtract.addActionListener(new SubtractListener());
    Multiply.addActionListener(new MultiplyListener());
    Divide.addActionListener(new DivideListener());

    exEvent01() {
        JPanel mainPanel = new JPanel(new GridLayout(2, 1));

        JPanel numberPanel = new JPanel(new FlowLayout());
        numberPanel.add(number1);
        numberPanel.add(numberone);
        numberPanel.add(number2);
        numberPanel.add(numbertwo);
        numberPanel.add(result);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(Add);
        buttonPanel.add(Subtract);
        buttonPanel.add(Multiply);
        buttonPanel.add(Divide);
        

        mainPanel.add(numberPanel);
        mainPanel.add(buttonPanel);
        add(mainPanel);

    }

    public static void main(String[] args) {
        exEvent01 frame = new exEvent01();
        frame.setTitle("Exercise10_01");
        frame.setSize(500, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }

    class AddListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int samp = Integer.parseInt(number1.getText()) + Integer.parseInt(number2.getText());
            result.setText(Integer.toString(samp));
        }
    }

    class SubtractListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int samp = Integer.parseInt(number1.getText()) - Integer.parseInt(number2.getText());
            result.setText(Integer.toString(samp));
        }
    }

    class MultiplyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int samp = Integer.parseInt(number1.getText()) * Integer.parseInt(number2.getText());
            result.setText(Integer.toString(samp));
        }
    }

    class DivideListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int samp = Integer.parseInt(number1.getText()) / Integer.parseInt(number2.getText());
            result.setText(Integer.toString(samp));
        }
    }

}
