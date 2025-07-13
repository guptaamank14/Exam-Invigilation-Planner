public class Scheduler {
    public static void assignInvigilators() {
        ArrayList<Exam> exams = AddExamForm.exams;
        ArrayList<Faculty> faculties = AddFacultyForm.facultyList;

        if (faculties.size() < 2) {
            JOptionPane.showMessageDialog(null, "At least 2 faculty required.");
            return;
        }

        for (Exam exam : exams) {
            faculties.sort((a, b) -> Integer.compare(a.getAssignedCount(), b.getAssignedCount()));
            Faculty f1 = faculties.get(0);
            Faculty f2 = faculties.get(1);

            exam.setInvigilators(f1, f2);
            f1.incrementAssigned();
            f2.incrementAssigned();
        }

        JOptionPane.showMessageDialog(null, "Invigilators Assigned!");
    }
}
