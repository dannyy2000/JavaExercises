package chapter8_Exercises;

public class Cylinder {


    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        validateRadius(radius);
        this.radius = radius;
    }

    private void validateRadius(double radius) {
        boolean negativeRadius = radius < 0.0;
        if(negativeRadius) throw new IllegalArgumentException("Radius should be positive");
    }

    public void setHeight(double height) {
        validateHeight(height);
        this.height = height;
    }

    private void validateHeight(double height) {
        boolean negativeHeight = height < 0.0;
        if(negativeHeight) throw new IllegalArgumentException("Height should be positive");
    }

    public double calculateVolume() {
        int volume = (int) (Math.PI * (radius * radius) * height);

        return volume;
    }
}
