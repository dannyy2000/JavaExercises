package chapter8;

import java.util.ArrayList;
import java.util.Locale;

public class Customer {

    private static String name;
    private static String phoneNumber;

    private static String address;

    private static double loyaltyPoint;

    public Customer(String name, String phoneNumber, String address){
        Customer.name = name;
        Customer.address = address;
        Customer.phoneNumber = phoneNumber;
    }
    public static  void setClientDetails(String name, String phoneNumber, String address){
                Customer.name = name.toUpperCase(Locale.ROOT);
                Customer.phoneNumber = phoneNumber;
                Customer.address = address.toUpperCase(Locale.ROOT);
    }

//    public static String [] getClientDetails(){
//        ArrayList <String> clientDetail = new ArrayList<>();
//        for (int i = 0; i < clientDetail.size(); i++) {
//            clientDetail.add(i,name);
//            clientDetail.add(i,phoneNumber);
//            clientDetail.add(i,address);
//            clientDetail.add(i, String.valueOf(loyaltyPoint));
//        }getClientDetails() = new String[clientDetail.size()];
//        for (int i = 0; i < clientDetail.size(); i++)
//            return =clientDetail.get(i);
//    }
//    public static double addLoyaltyPoint(double discountGained) {
//        if (discountGained > 0.0){
//        Customer.loyaltyPoint += discountGained;
//        }
//        return discountGained;
//    }
}
