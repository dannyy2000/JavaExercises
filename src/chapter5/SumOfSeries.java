package chapter5;
// todo Find the summation of the sequence of numbers 1, 2, 3 … n, where
//   n ranges from 1 to 100. Use type long. Display the results in a tabular format that shows n and the
//   corresponding sum. If this were a product instead of a sum, what difficulty might you encounter
//    with the variable that accumulates the product?

public class SumOfSeries {
    public static void main(String[] args) {
        long sum = 0;
        System.out.format("%8s %8s %8s","number","number","Corresponding sum\n");
        for (long i = 1; i <= 100 ; i++){
            //System.out.format("%8s %8s %8s","number","number","Corresponding sum\n");
            for (long j = i;j <= i; j++ ){
                System.out.println((i + "+" + j + "=") + (i + j));
                 sum += (i + j);
            }
        }
        //System.out.format("%8s %8s %8s","number","number","Corresponding sum\n");

    }
}
