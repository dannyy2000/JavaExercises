package Snacks;
import java.security.SecureRandom;
public class MaximumArray {
    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();
        float[] c = new float[110];
        float max = c[0];
        
        for(int index = 0;index < c.length;index++){
            int random = 1 + randomNumbers.nextInt(100);
            c[index] = random;
        }
        for(double number: c){
            System.out.println(number);
        }
        for(int count = 0;count< 100;count++){
            if(c[count] > max){
                max = c[count];
            }
        }
        System.out.printf("The maximum is %f%n",max);
    }
}
