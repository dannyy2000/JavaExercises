package ArrayPractice;

public class Maximum {
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5,6,10,7,8,9,13,12,11,15,14,16,19,18,20,21,25,26,23,30,28,29,27};

        int maximum = number.length ;

        for (int i = 0;i < number.length;i++){
            if(number[i] > maximum){
                maximum = number[i];
                System.out.println(maximum);

            }

        }
    }
}
