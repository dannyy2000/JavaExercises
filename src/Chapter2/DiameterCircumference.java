package Chapter2;
import java.util.Scanner;
public class DiameterCircumference {

    public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            int radius;
            double diameter;
            double circumference;
            double area;

            System.out.print("The radius of a circle: ");
            radius = input.nextInt();

            diameter = 2 * radius;

            circumference = 2 * 3.14159 * radius;

            area = 3.14159 * radius * radius;

            System.out.printf("The diameter is %f%n",diameter);
            System.out.printf("The circumference is %f%n",circumference);
            System.out.printf("The area is %f%n",area);
        }
    }

