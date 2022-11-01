package Practise;
import java.util.ArrayList;
import java.util.Scanner;

public class Receipt {

    public static void main(String[] args) {
        double total = 0;
        double subtotal = 0;
        Scanner input = new Scanner(System.in);

        ArrayList<Items> items = new ArrayList<>();
        String answer = " ";

        do {
            System.out.println("What did the customer buy? ");
            String itemName = input.next();

            System.out.println("Enter the quantity of items bought: ");
            int quantity = input.nextInt();

            System.out.println("Enter the price of items: ");
            double price = input.nextDouble();

             total += quantity * price;

            subtotal += total;

            Items item = new Items(itemName,quantity,price,total);
            items.add(item);
//            System.out.println(item);
            System.out.println("Add more item? ");
            answer = input.next();
            answer = answer.toUpperCase();

        }while(answer.equalsIgnoreCase("YES"));
        System.out.println("Item\tQuantity\tPrice\tTotal");
          for (Items item: items){
              item.printFormat();
          }

    }

}