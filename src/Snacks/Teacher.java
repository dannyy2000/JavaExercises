package Snacks;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private final List<Student> students = new ArrayList<>();

    public void addStudentsScore(int subScore1, int subScore2, int subScore3) {
        Student student = new Student(subScore1, subScore2, subScore3);
        students.add(student);
    }
    public void addStudentsScore2(int subScore1, int subScore2, int subScore3) {
        Student student1 = new Student(subScore1, subScore2, subScore3);
        students.add(student1);

    }
    public void printStudentResult() {
        System.out.print("STUDENTS\tSUB1\tSUB2\tSUB3\tTOT\t\tAVE\n");
        for (int i = 0; i < students.size(); i++) {
            System.out.print("Student" + " " + (i + 1) + "    ");
            students.get(i).printResult();

//            for (int j = 0; j < students.size(); j++) {
//                System.out.print("Student" + " " + (j + 1) + "    ");
//                students.get(j).printResult();
//            }
        }
//        for (int j = 0; j < students.size(); j++) {
//            System.out.print("Student" + " " + (j + 1) + "    ");
//            students.get(j).printResult();
//        }


    }
}
