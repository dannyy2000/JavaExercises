package Snacks;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckOut {
    static java.util.Date date = new java.util.Date();

    static Scanner input = new Scanner(System.in);

    static ArrayList<String> items = new ArrayList<>();

    static ArrayList<Integer> quantity = new ArrayList<>();

    static ArrayList<Double> price = new ArrayList<>();

    static ArrayList<String> customerName = new ArrayList<>();

    static String cashierName;

    static String answer = " ";

   public static void customerOrder(){
//       System.out.println("Enter customer name: ");
//       customerName.add(input.next());

       do{
           System.out.println("Enter customer name: ");
           customerName.add(input.next());

           System.out.println("What did the customer buy?");
           items.add(input.next());

           System.out.println("How much quantities did the customer buy? ");
           quantity.add(input.nextInt());

           System.out.println("Enter price of items bought: ");
           price.add(input.nextDouble());

           System.out.println("Add more item? ");
           answer = input.next();
           input.nextLine();
           answer = answer.toUpperCase();

       }while(answer.equals("YES"));
       System.out.println("Enter cashier's name: ");
       cashierName = input.next();
   }

   public static void receiptPrintingFormat(){
       System.out.printf("""
               **--------------------------------------------------------------------------**
               |             AKINSANYA HOLDING LIMITED                                      |
               |             TIME STAMP: %s                                                 |
               |             DANIEL'S 390 AKINSANYA AVENUE,Durban                           |
               |             CUSTOMER NAME: %s                                              |
               |             CASHIER'S NAME: %s                                             |
               **--------------------------------------------------------------------------**
               **--------------------------------------------------------------------------**
               
               """, date, customerName, cashierName, "Items", "Quantity", "Price", "Total");
   }

   public static void calculateOrder(){
       int total = 0;
       for(int i = 0; i < items.toArray().length; i++){
           total += quantity.get(i) * price.get(i);
           System.out.printf("""
                   |%12s%12s%15s%15f
                   """,items.get(i), quantity.get(i), price.get(i), quantity.get(i) * price.get(i));

       }
     System.out.printf("%39s:%16d", "Total", total);
   }
}
