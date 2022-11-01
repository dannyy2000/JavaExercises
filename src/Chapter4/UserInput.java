package Chapter4;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;


        while(counter != -1){

            System.out.println("Enter the number: ");
            int number = input.nextInt();
            if(number == 1 || number == 2){
                System.out.println("correct value");
                break;
            }

            else{
                System.out.println("Incorrect value");
            }

            counter++;
        }

    }
}