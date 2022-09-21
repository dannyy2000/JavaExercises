package chapter6;

public class Scope {
    private static int x = 1;

    public static void main(String[] args) {

        int x = 5;

        System.out.printf("The Local x in main  is %d%n",x);

        useField();
        useLocalVariable();
        useField();
        useLocalVariable();



    }

    private static void useLocalVariable() {
        int x = 25;

        System.out.printf("The local variable x before entering method %d%n",x);

        x++;
        System.out.printf("The local variable x before exiting the method %d%n",x);


    }

    private static void useField() {
        System.out.printf("The field x before entering method %d%n",x);

        x = 10;

        System.out.printf("The field x before exiting the method %d%n",x);
    }
}
