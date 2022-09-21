package chapter3;
public class PetrolPurchase {

   private String stationLocation;
   private String petrolType;
   private int quantityPurchase;
   private double pricePerLitre;
   private double percentageDiscount;


    public PetrolPurchase(String stationLocation,String petrolType,int quantityPurchase,double pricePerLitre,double percentageDiscount){

     this.stationLocation = stationLocation;

     this.petrolType = petrolType;

     this.quantityPurchase = quantityPurchase;

     this.pricePerLitre = pricePerLitre;

     this.percentageDiscount = percentageDiscount;
   }
    public void setStationLocation(String stationLocation){

       this.stationLocation = stationLocation;
  }
    public String getStationLocation(){

        return stationLocation;
 }
    public void setPetrolType(String petrolType){

        this.petrolType = petrolType;
  }
    public String getPetrolType(){

        return petrolType;
  }
    public void setQuantityPurchase(int quantityPurchase){

        this.quantityPurchase = quantityPurchase;
  }
    public int getQuantityPurchase(){

        return quantityPurchase;
  }
    public void setPricePerLitre(double pricePerLitre){

        this.pricePerLitre = pricePerLitre;
  }
    public double getPricePerLitre(){

        return pricePerLitre;
  }
    public void setPercentageDiscount(double percentageDiscount){

        this.percentageDiscount = percentageDiscount;
  }
    public double getPercentageDiscount(){

        return percentageDiscount;
  }
    public double getPurchaseAmount(){
        double purchaseAmount = (quantityPurchase * pricePerLitre) - percentageDiscount;
        return purchaseAmount;
 }
}