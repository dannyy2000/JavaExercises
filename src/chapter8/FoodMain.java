package chapter8;

public class FoodMain {
    public static void main(String[] args) {
        Food food = Food.APPLE;
        System.out.println("The calories of " + Food.APPLE + " is " +food.getCalories());
        System.out.println(food.getType() + " is a type of "+ Food.APPLE);
    }

}
