package Snacks;
public class StudentGradesTest {
    public static void main(String[] args) {


        StudentGrades student1 = new StudentGrades("Akinsanya daniel", "A");
        StudentGrades student2 = new StudentGrades("Martins jojolola", "C");
        StudentGrades student3 = new StudentGrades("Fanu samuel", "B");
        StudentGrades student4 = new StudentGrades("Martha danladi", "A");
        StudentGrades student5 = new StudentGrades("Akinsanya tomiwa", "B");

        System.out.printf("%s's letter grade is:%s%n ", student1.getName(), student1.getLetterGrade());
        System.out.printf("%s's letter grade is:%s%n ", student2.getName(), student2.getLetterGrade());
        System.out.printf("%s's letter grade is:%s%n ", student3.getName(), student3.getLetterGrade());
        System.out.printf("%s's letter grade is:%s%n ", student4.getName(), student4.getLetterGrade());
        System.out.printf("%s's letter grade is:%s%n ", student5.getName(), student5.getLetterGrade());

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int countGrade = 0;


        switch (countGrade) {

            case 1:
                System.out.printf("The number of student who got A is %d%n: ", aCount);
                aCount++;
                break;

            case 2:
                System.out.printf("The number of student who got B is %d%n: ", bCount );
                bCount++;
                break;

            case 3:
                System.out.printf("The number of student who got C is %d%n: ", cCount);
                cCount++;
                break;

            default:
                System.out.printf("The number of student who got D is %d%n: ", dCount);
                dCount++;
                break;

        }
    }
}





