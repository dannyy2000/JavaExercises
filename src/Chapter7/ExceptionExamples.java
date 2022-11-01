package Chapter7;
import java.util.Scanner;
public class ExceptionExamples {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter your number: ");
            int number = input.nextInt();
        } catch( Exception e){
            System.out.println("Enter a valid integer");
        }
    }
}