package chapter10_exercices.AccountPayable;

public class Invoice implements Payable {

    private final String partNumber;
    private final String partDescription;
    private final int quantity;
    private final double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        validateQuantity(quantity);
        this.quantity = quantity;
        validatePricePerItem(pricePerItem);
        this.pricePerItem = pricePerItem;
    }

    private void validatePricePerItem(double pricePerItem) {
        if (pricePerItem < 0.0) throw new IllegalArgumentException("price per item >= 0.0");
    }

    private void validateQuantity(int quantity) {
        if (quantity < 0.0) throw new IllegalArgumentException("quantity must be >= 0.0");
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }


    @Override
    public double getPaymentAmount() {
        return getQuantity() * getQuantity();
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s: %s%n%s: %d %s:$%.2f", "PartNumber"
                , getPartNumber(), "PartDescription", getPartDescription(), "Quantity",
                getQuantity(), "PricePerItem", getPricePerItem());
    }
}
