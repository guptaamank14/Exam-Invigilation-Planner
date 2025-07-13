//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Exam Invigilation Planner");
            frame.setSize(500, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new GridLayout(4, 1, 10, 10));

            JButton addExamBtn = new JButton("Add Exam");
            JButton addFacultyBtn = new JButton("Add Faculty");
            JButton scheduleBtn = new JButton("Generate Schedule");
            JButton viewBtn = new JButton("View Schedule");

            frame.add(addExamBtn);
            frame.add(addFacultyBtn);
            frame.add(scheduleBtn);
            frame.add(viewBtn);

            // Action listeners
            addExamBtn.addActionListener(e -> AddExamForm.showForm());
            addFacultyBtn.addActionListener(e -> AddFacultyForm.showForm());
            scheduleBtn.addActionListener(e -> Scheduler.assignInvigilators());
            viewBtn.addActionListener(e -> ScheduleViewer.showSchedule());

            frame.setVisible(true);
        });
    }
}
