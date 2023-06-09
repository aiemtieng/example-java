import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlCircleWithoutEventHanding extends JFrame {
    CirclePanel circlePanel = new CirclePanel();

    JButton Enlarge = new JButton("Enlarge");
    JButton Shrink = new JButton("Shrink");

    ControlCircleWithoutEventHanding() {
        JPanel panel = new JPanel();
        panel.add(Enlarge);
        panel.add(Shrink);
        Enlarge.addActionListener(new EnlargeListener());
        Shrink.addActionListener(new ShrinkListener());
        add(panel, BorderLayout.SOUTH);
        add(circlePanel, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        ControlCircleWithoutEventHanding frame = new ControlCircleWithoutEventHanding();
        frame.setTitle("ControlCircleWithoutEventHanding");
        frame.setSize(450, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    class EnlargeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            circlePanel.Enlarge();
        }
    }

    class ShrinkListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            circlePanel.Shrink();
        }
    }

    class CirclePanel extends JPanel {
        private int radius = 5;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawOval((getWidth() / 2) - radius, (getHeight() / 2) - radius, 2 * radius, 2 * radius);

        }

        public void Enlarge() {
            radius++;
            repaint();
        }

        public void Shrink() {
            radius--;
            repaint();
        }
    }
}
