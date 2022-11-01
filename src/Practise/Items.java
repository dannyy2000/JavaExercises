package Practise;

public class Items {
    private String itemName;
    private int quantity;
    private double price;
    private double total;

    public Items(String itemName,int quantity,double price,double total){
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
    }

    public void printFormat(){

        System.out.printf("%s\t%d\t%.2f\t%.2f%n",itemName,quantity,price,total);
    }

    @Override
    public String toString() {
        return "Items{" +
                "itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", total=" + total +
                '}';
    }
}
