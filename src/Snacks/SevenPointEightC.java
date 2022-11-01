package Snacks;
 //c) Find the maximum of the first one-hundred elements of floating-point array c.
public class SevenPointEightC {
    public static void main(String[] args) {

        float[] c = new float[100];
        float max = 0.0f;

        for (int counter = 0; counter < c.length; counter++) {
            c[counter] = counter * c[counter] + (counter * 2 - 5);
        }

        for (int counter = 0; counter < c.length; counter++) {
            System.out.printf("%.2f    ", c[counter]);
            if (counter % 5 == 0) {
                System.out.println();
            }
        }

        for(float counter = 0.0f;counter < c.length;counter++){
            if(c[(int) counter] > max){
                max = c[(int) counter];
            }
        }
        System.out.printf("%nThe maximum value is %f%n",max);
    }

}
