import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {

        int randomNumber = 30;
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = input.nextInt();

        switch(randomNumber){

            case 1 :
                if(number > randomNumber) {
                    System.out.println("Too high,try again!!");
                }
                break;


            default:
                    System.out.println("Perfect");

                break;
            }
        }
    }

