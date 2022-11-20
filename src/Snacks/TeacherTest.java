package Snacks;

import java.util.Scanner;

public class TeacherTest {
    public static void main(String[] args) {


        Teacher teacher = new Teacher();
//        teacher.addStudentsScore(30,40,50);
//        teacher.addStudentsScore(60,50,45);
//        teacher.addStudentsScore(20,40,90);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter for sub 1 ");
        int sub1 = input.nextInt();

        System.out.println("Enter for sub 2 ");
        int sub2 = input.nextInt();

        System.out.println("Enter for sub 3 ");
        int sub3 = input.nextInt();

        teacher.addStudentsScore(sub1,sub2,sub3);
        teacher.addStudentsScore2(sub1,sub2,sub3);
//        teacher.addStudentsScore(sub1,sub2,sub3);
        teacher.printStudentResult();

    }
}