package chapter5;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {

        for (int days = 0; days <= 12; days++) {

            switch (days) {
                case 1 -> System.out.println("On the first");
                case 2 -> System.out.println("On the second");
                case 3 -> System.out.println("On the third");
                case 4 -> System.out.println("On the fourth");
                case 5 -> System.out.println("On the fifth");
                case 6 -> System.out.println("On the sixth");
                case 7 -> System.out.println("On the seventh");
                case 8 -> System.out.println("On the eight");
                case 9 -> System.out.println("On the ninth");
                case 10 -> System.out.println("On the tenth");
                case 11 -> System.out.println("On the eleventh");
                case 12 -> System.out.println("On the twelfth");
            }
            System.out.println(" Day of christmas,my true love sent to me");

            switch (days) {
                case 12:
                    System.out.println("Twelve drummers drumming");
                case 11:
                    System.out.println("Eleven pipers piping");
                case 10:
                    System.out.println("Ten lords a-leaping");
                case 9:
                    System.out.println("Nine ladies dancing");
                case 8:
                    System.out.println("Eight maids a-milking");
                case 7:
                    System.out.println("Seven swans a-swimming");
                case 6:
                    System.out.println("Six geese a-laying");
                case 5:
                    System.out.println("Five golden rings");
                case 4:
                    System.out.println("Four calling birds");
                case 3:
                    System.out.println("Three french hens");
                case 2:
                    System.out.println("Two turtle doves,and");
                case 1:
                    System.out.println("A partridge in a pear tree");
            }
            System.out.println();
        }
    }
}