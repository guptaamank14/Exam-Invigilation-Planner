import javax.swing.*;
import java.util.ArrayList;

public class AddFacultyForm {
    public static ArrayList<Faculty> facultyList = new ArrayList<>();

    public static void showForm() {
        JFrame frame = new JFrame("Add Faculty");
        frame.setSize(300, 200);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JTextField nameField = new JTextField();
        JTextField deptField = new JTextField();

        panel.add(new JLabel("Faculty Name:")); panel.add(nameField);
        panel.add(new JLabel("Department:")); panel.add(deptField);

        JButton submitBtn = new JButton("Add Faculty");
        submitBtn.addActionListener(e -> {
            facultyList.add(new Faculty(nameField.getText(), deptField.getText()));
            JOptionPane.showMessageDialog(frame, "Faculty Added!");
            frame.dispose();
        });

        panel.add(submitBtn);
        frame.add(panel);
        frame.setVisible(true);
    }
}
