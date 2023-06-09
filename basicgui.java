import javax.swing.*;
import java.awt.*;

public class basicgui extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CPE121:Quiz 11 GUI");

        JPanel mainpPanel = new JPanel();
        mainpPanel.setLayout(new GridLayout(7, 1));
        frame.add(mainpPanel);

        JPanel loginPanel = new JPanel();
        JLabel login = new JLabel("*** Please login ***");
        login.setForeground(Color.red);
        loginPanel.add(login);
        mainpPanel.add(loginPanel, BorderLayout.NORTH);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 1));
        JLabel username = new JLabel("username");
        JTextField inusername = new JTextField(10);
        JLabel password = new JLabel("passwword");
        JTextField inpassword = new JTextField(10);
        inputPanel.add(username);
        inputPanel.add(inusername);
        inputPanel.add(password);
        inputPanel.add(inpassword);
        mainpPanel.add(inputPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        JButton loginButton = new JButton("Log in");
        JButton cancleButton = new JButton("Cancel");
        buttonPanel.add(loginButton);
        buttonPanel.add(cancleButton);
        mainpPanel.add(buttonPanel);

        JPanel checkboxPanel = new JPanel();
        checkboxPanel.setLayout(new GridLayout(1, 1));
        JCheckBox ongkharakCheckBox = new JCheckBox("Ongkharak");
        JCheckBox prasanmitCheckBox = new JCheckBox("Prasanmit");
        JRadioButton cpeRadioButton = new JRadioButton("CPE", true);
        JRadioButton swuRadioButton = new JRadioButton("SWU");
        JRadioButton othRadioButton = new JRadioButton("Oth");
        checkboxPanel.add(ongkharakCheckBox);
        checkboxPanel.add(prasanmitCheckBox);
        checkboxPanel.add(cpeRadioButton);
        checkboxPanel.add(swuRadioButton);
        checkboxPanel.add(othRadioButton);
        mainpPanel.add(checkboxPanel);

        JPanel comboboxPanel = new JPanel();
        comboboxPanel.setLayout(new GridLayout(1, 2));
        JComboBox combo;
        String type[] = { "Faculty of Science", "Faculty of Social Science", "Faculty of PhysicalEducation",
                "Faculty of Physical Therapy", "Faculty of Phamacy", "Faculty of Engineering", "Faculty of Nurse" };
        combo = new JComboBox<>(type);
        combo.setMaximumRowCount(6);
        combo.setSelectedItem("Faculty of Engineering");
        comboboxPanel.add(combo);

        JList AList;
        String AniList[] = { "Free Elective", "104", "120", "121", "140", "193", "194" };
        AList = new JList(AniList);
        AList.setVisibleRowCount(3);
        JScrollPane panelist = new JScrollPane(AList);
        comboboxPanel.add(panelist);
        mainpPanel.add(comboboxPanel);

        frame.setSize(600, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
