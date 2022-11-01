package Chapter4;
import java.util.Scanner;
public class Comparator {
    public static void main(String[] args) {

        int counter =0;
        Scanner input = new Scanner(System.in);

        while(counter != -1){
            System.out.println("Enter first number: ");
            int number1 = input.nextInt();

            System.out.println("Enter second number: ");
            int number2 = input.nextInt();

            if(number1 == number2 ){
                System.out.println(0);
                break;
            }
            else if (number1 > number2) {
                System.out.println(1);
                break;
            }
            else if (number2 > number1){
                System.out.println(-1);
                break;
            }
            counter++;
        }
    }
}
