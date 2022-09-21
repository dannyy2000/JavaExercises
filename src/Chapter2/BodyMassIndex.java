package Chapter2;

import java.util.Scanner;
       public class BodyMassIndex{
        public static void main(String[] args){

         Scanner input = new Scanner(System.in);
    
         double weightInKilograms;
         double heightInMetres;
         double bodyMassIndex;

         System.out.println("BMI VALUES ");
         System.out.println("Underweight: less than 18.5 ");
         System.out.println("Normal: between 18.5 and 24.9 ");
         System.out.println("Overweight: between 25 and 29.9 ");
         System.out.println("Obese: 30 or greater ");
         System.out.println();

         System.out.println("Enter the weight in kilograms: ");
         weightInKilograms = input.nextDouble();

         System.out.println("Enter the height in metres: ");
         heightInMetres = input.nextDouble();

         bodyMassIndex = weightInKilograms / heightInMetres * heightInMetres;

         System.out.printf("The body mass index is %f%n",bodyMassIndex);
  }
}