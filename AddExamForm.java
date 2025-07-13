import javax.swing.*;
import java.util.ArrayList;

public class AddExamForm {
    public static ArrayList<Exam> exams = new ArrayList<>();

    public static void showForm() {
        JFrame frame = new JFrame("Add Exam");
        frame.setSize(300, 300);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JTextField courseField = new JTextField();
        JTextField dateField = new JTextField();
        JTextField timeField = new JTextField();
        JTextField roomField = new JTextField();

        panel.add(new JLabel("Course Name:")); panel.add(courseField);
        panel.add(new JLabel("Date (dd-mm-yyyy):")); panel.add(dateField);
        panel.add(new JLabel("Time (hh:mm):")); panel.add(timeField);
        panel.add(new JLabel("Room No:")); panel.add(roomField);

        JButton submitBtn = new JButton("Add Exam");
        submitBtn.addActionListener(e -> {
            exams.add(new Exam(courseField.getText(), dateField.getText(), timeField.getText(), roomField.getText()));
            JOptionPane.showMessageDialog(frame, "Exam Added!");
            frame.dispose();
        });

        panel.add(submitBtn);
        frame.add(panel);
        frame.setVisible(true);
    }
}
