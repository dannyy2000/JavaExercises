package chapter6;

public class MethodOverload {

    public static void main(String[] args) {
        System.out.printf("%d%n",square(7));
        System.out.printf("%f%n",square(7.5));

    }

    private static int square(int intValue) {
        return intValue * intValue;
    }
    private  static double square(double doubleValue){
        return doubleValue * doubleValue;
    }

}
