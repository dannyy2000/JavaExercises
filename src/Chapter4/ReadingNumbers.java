package Chapter4;
import java.util.Scanner;
public class ReadingNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;

        Scanner input = new Scanner(System.in);
      while(counter != -1){
        System.out.println("Enter integer: ");
        int integer = input.nextInt();
       // sum += integer;
        if(sum == integer || sum > integer){
            break;
        }
           counter++;
    }
    }
}
