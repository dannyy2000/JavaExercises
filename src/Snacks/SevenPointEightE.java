package Snacks;
//e) Compute the product of the third to the tenth elements, both inclusive, in a hundredelement integer array w.
public class SevenPointEightE {
    public static void main(String[] args) {
        int [] w = new int[100];
        int products = 1;

        for(int counter = 0;counter < w.length;counter++){
            if(counter >= 3 && counter <=  10){
                products *= counter;
            }
        }
        System.out.printf("the products of the third to the tenth elements is:%d%n",products);
    }
}
