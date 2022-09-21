package chapter3;

public class Petrol{
   public static void main(String[] args){

      PetrolPurchase myPetrol = new PetrolPurchase("victoria island","Diesel",50, 102.8,10.0);

      System.out.printf("The station location is: %s%n",myPetrol.getStationLocation());
      System.out.printf("The type of petrol is: %s%n",myPetrol.getPetrolType());
      System.out.printf("The quality of purchase in litres is: %d%n",myPetrol.getQuantityPurchase());
      System.out.printf("The price per litre is: %.1f%n",myPetrol.getPricePerLitre());
      System.out.printf("The percentage discount is: %.1f%n",myPetrol.getPercentageDiscount());
      System.out.println();
      System.out.printf("The purchase amount is: %.1f",myPetrol.getPurchaseAmount());
 }
}

  