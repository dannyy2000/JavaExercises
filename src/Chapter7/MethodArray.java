package Chapter7;

public class MethodArray {

    public  int addNumbers(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
             total+= numbers[i];
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("this is before exception");
        try {
            int a = 8 / 0;
        }
        catch (Exception e){
            e.getMessage();
        }
        System.out.println("without try and catch");
    }
}
