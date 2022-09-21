package chapter3;
import java.util.Scanner;
import java.time.LocalDate;

public class HeartRatesTest {
    public static void main(String[] args) {

        HeartRates hr = new HeartRates("Daniel","Akinsanya",30,5,2000);
        //LocalDate Local
        // Date = java.time.LocalDate.parse("MM/dd/yyyy")

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String firstName = input.nextLine();
        hr.setFirstName(firstName);

        System.out.println();

        System.out.print("Enter the last name: ");
        String lastName = input.nextLine();
        hr.setLastName(lastName);

        System.out.println();

        System.out.print("Enter the day of birth: ");
        int day = input.nextInt();
        hr.setDay(day);

        System.out.print("Enter the month  of birth: ");
        int month = input.nextInt();
        hr.setMonth(month);

        System.out.print("Enter the year of birth: ");
        int year = input.nextInt();
        hr.setYearOfBirth(year);

        System.out.println();
        System.out.printf("%s%n",hr.getFirstName());
        System.out.printf("%s%n",hr.getLastName());
        System.out.printf("date of birth is %s%n",hr.getDateOfBirth());
        System.out.printf("The age in years is %d%n ",hr.getAge());
        System.out.printf("The maximum heart rate is %d%n ",hr.getMaximumHeartRate());
        System.out.printf("The target heart rate is %d - %d%n",hr.getTotalTargetHeartRate1(),
                hr.getTotalTargetHeartRate2());


    }
}
