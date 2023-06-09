import javax.swing.JOptionPane;

public class q12 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog(null, "Enter the starting velociti (v0) : ");
        String b = JOptionPane.showInputDialog(null, "Enter the ending velocity (v1) : ");
        String c = JOptionPane.showInputDialog(null, "Enter the time span (t) : ");

        double v0 = Double.parseDouble(a);
        double v1 = Double.parseDouble(b);
        double t = Double.parseDouble(c);
        double sum = (v1 - v0) / t;

        JOptionPane.showMessageDialog(null, "The average acceleration is " + sum);

    }

}
