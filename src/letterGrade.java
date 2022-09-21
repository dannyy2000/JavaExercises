import java.util.Scanner;
public class letterGrade {
    public static void main(String[] args) {

        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n    %s%n   %s%n");
               // "100,90,80,70,60" ,"<Ctrl> z");

        while(input.hasNext()){
            int grade = input.nextInt();
            total=+ grade;
            gradeCounter++;

            switch(grade/10){
                case 9:
                case 10:
                    aCount++;
                    break;

                case 8:
                    bCount++;
                    break;

                case 7:
                    cCount++;
                    break;

                    case 6:
                        dCount++;
                        break;

                default:
                    fCount++;
                    break;

            }
        }



    }
}
