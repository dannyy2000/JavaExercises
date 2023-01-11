package Chapter7;

public class PixelQuantization {
    public static void main(String[] args) {

        int [] array = new int[11];

        for(int counter = 1;counter < array.length;counter++){
          if (counter == 10){
              System.out.printf("181 >: %d",counter * 20 - 10);
          }
          else{
              System.out.printf("%d-%d: %d ",counter * 20-19,counter*20,counter * 20 - 10);
          }

            System.out.println();
        }

    }

}
