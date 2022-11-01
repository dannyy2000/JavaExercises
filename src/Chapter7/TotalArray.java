package Chapter7;

public class TotalArray {

        public static void main(String[] args) {

            int [] numbers = {50,40,70,20,10,90,25,45,80};
            int Sum = 0;

            for(int index = 0;index < numbers.length;index++){
                Sum+=numbers[index];
                System.out.printf("The sum of the elements is:%d%n",Sum);
            }
            System.out.printf("The sum of the elements is:%d%n",Sum);
        }

    }

