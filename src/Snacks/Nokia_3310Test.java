 package Snacks;
import java.util.Scanner;
public class Nokia_3310Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Nokia_3310 nokia3310 = new Nokia_3310();

        System.out.println("""
                WELCOME TO NOKIA_3310
                press 1 to open menu:
                """);
        Integer option =0;
        //System.out.println("let us seee the clsss "  + option.getClass());
        try {
            option = Integer.valueOf(input.nextLine());
        }
        catch (Exception E){
            E.getMessage();
        }
        finally {
                System.out.println("enter a valid integer");
                option=input.nextInt();


        }


        if(option == 1){
            nokia3310.mainMenu();
        }


       System.out.println("Press 00 to switch off phone: ");
        option = input.nextInt();
        if(option == 00){
            nokia3310.switchoff();
        }
    }


}
