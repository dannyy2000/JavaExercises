package Chapter2;
import java.util.Scanner;
     public class GreatPyramid {

     public static void main(String [] args) {

      Scanner input = new Scanner(System.in);

      double EstimatedNumberOfStones;
      double AverageWeight;
      int NumberOfYears;
      double WeightEachYear;
      double WeightEachHour;
      double WeightEachMinute;

      System.out.println("Enter the estimated number of stones: ");
      EstimatedNumberOfStones = input.nextDouble();

      System.out.println("Enter the average weight of each stone: ");
      AverageWeight = input.nextDouble();

      System.out.println("Enter the number of years taken to build the pyramid: ");
      NumberOfYears = input.nextInt();

      WeightEachYear = AverageWeight / NumberOfYears;

      WeightEachHour = WeightEachYear / 8760.00;

      WeightEachMinute = WeightEachHour / 60.00;

      System.out.printf("The weight of the pyramid each year is %f%n ",WeightEachYear);
      System.out.printf("The weight of the pyramid each hour is %f%n",WeightEachHour);
      System.out.printf("The weight of the pyramid each minute is %f%n",WeightEachMinute);
        }
   }

