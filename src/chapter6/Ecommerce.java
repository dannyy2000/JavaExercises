package chapter6;

public class Ecommerce {

    private String products;
    private static String Order = "Lagos";

    public static void main(String[] args) {
      // buyProducts();
       deliveryOrder();
       sellProducts();

    }

    private static String sellProducts() {
        String products = "Accessories";
        System.out.printf("The name of the products is %s%n",products);
            return products;
    }

    private static String deliveryOrder() {
              String Order = "Abuja";
        System.out.printf("The location of the order is %s%n",Order);
        return Order;
    }

  //  private static String buyProducts() {
    //    System.out.printf("%s",buyProducts());
      //  return buyProducts();
    //}
}
