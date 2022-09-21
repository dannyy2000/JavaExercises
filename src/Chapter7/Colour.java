package Chapter7;

public class Colour {
    public static void main(String[] args) {

        String[] colour = new String[7];

        colour[0] = "Red";
        colour[1] = "Blue";
        colour[2] = "Orange";
        colour[3] = "Green";
        colour[4] = "Black";
        colour[5] = "White";
        colour[6] = "Violet";

        for(int index = 0;index < colour.length;index++){
            System.out.println(colour[index]);
        }
    }
}
