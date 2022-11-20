package chapter8;

public enum Food {
    APPLE("Fruit", 5), BANANA("Fruit",6), CARROT("vegetable",10);

    //Food(String veg_fruits, int calories){
    private final String type;
    private final int calories;

    Food(String type, int calories) {
        this.calories = calories;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getCalories() {
        return calories;
    }
}


