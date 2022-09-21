package Chapter2;

import java.util.Scanner;
      public class WorldGrowth {

       public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double CurrentPopulation;
        double PopulationGrowthRate;
        double YearOne;
        double YearTwo;
        double YearThree;
        double YearFour;
        double YearFive;

        System.out.print("Enter current world population: ");
        CurrentPopulation = input.nextDouble();

        System.out.print("Enter the annual world population growth rate:");
        PopulationGrowthRate = input.nextDouble();

        YearOne = CurrentPopulation + (CurrentPopulation * PopulationGrowthRate);

        YearTwo = YearOne + (YearOne * PopulationGrowthRate);

        YearThree = YearTwo + (YearTwo * PopulationGrowthRate);

        YearFour = YearThree + (YearThree * PopulationGrowthRate);

        YearFive = YearFour + (YearFour * PopulationGrowthRate);

        System.out.printf("The world population after one year is %f%n",YearOne);
        System.out.printf("The world population after Two years is %f%n",YearTwo);
        System.out.printf("The world population after three years is %f%n",YearThree);
        System.out.printf("The world population after four years is %f%n",YearFour);
        System.out.printf("The world population after five years is %f%n",YearFive);
    }
  }
