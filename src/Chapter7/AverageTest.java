package Chapter7;

public class AverageTest {

    public static double average(double...numbers){
        double total = 0.0;

        for(double value: numbers){
            total+=value;
        }
        return total / numbers.length;
    }

    public static void main(String[] args) {
        double value1 = 20.0;
        double value2 = 15.00;
        double value3 = 25.00;
        double value4 = 60.00;

        System.out.printf("value1 = %.1f%n and value2 = %.1f%n and value3 = %.1f%n and value4 = %.1f%n ",value1,value2,
                value3,value4);

        System.out.printf("The average of value1 and value2 is %.1f%n",average(value1,value2));
        System.out.printf("The average of value1 and value3 is %.1f%n",average(value1,value3));
        System.out.printf("The average of value1,value2,value3,value4 is %.1f%n",average(value1,value2,value3,value4));
        System.out.printf("The average of value3 and value2 is %.1f%n",average(value3,value2));
    }
}
