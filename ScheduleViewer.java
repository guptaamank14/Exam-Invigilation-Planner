import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class ScheduleViewer {
    public static void showSchedule() {
        JFrame frame = new JFrame("Exam Schedule");
        frame.setSize(700, 400);

        String[] columns = {"Course", "Date", "Time", "Room", "Invigilator 1", "Invigilator 2"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);

        ArrayList<Exam> exams = AddExamForm.exams;
        for (Exam ex : exams) {
            String[] row = {
                    ex.getCourseName(),
                    ex.getDate(),
                    ex.getTime(),
                    ex.getRoom(),
                    ex.getInvigilator1() != null ? ex.getInvigilator1().getName() : "-",
                    ex.getInvigilator2() != null ? ex.getInvigilator2().getName() : "-"
            };
            model.addRow(row);
        }

        frame.add(new JScrollPane(table));
        frame.setVisible(true);
    }
}
