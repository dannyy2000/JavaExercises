package Chapter4;
import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        while(counter != -1){
            System.out.println("Enter number");
            int number = input.nextInt();
            if(number % counter == 0){
                System.out.printf("%d%n",number);
            }
            sum = sum + 1;
            counter++;
        }
        System.out.printf("The sum of the factor is :%d%n",sum);
    }
}
