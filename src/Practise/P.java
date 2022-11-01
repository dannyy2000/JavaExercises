package Practise;

import java.security.SecureRandom;

public class P {
    public static void main(String[] args) {
       double [] array = new double[10];
       double total = 0.0;

       array[9] = 5.5;

        System.out.println(array[0] + array[1]);

        for (int i = 0;i< array.length;i++){
            array[i] = i + 1;
            total+=array[i];
            System.out.print(array[i] + " ,");

        }
        //total+=array[i];
        //System.out.println(array[i]);
        System.out.println();
        System.out.println(total);

        double min = array.length;
        for (double v : array) {
            if (v < min) {
                min = v;
            }
        }
        System.out.println(min);

        SecureRandom randomNumbers = new SecureRandom();
        for (int index = 0;index<array.length;index++){
            int i = randomNumbers.nextInt(array.length);
            System.out.print(array[i] + " ,");
        }



    }
}
