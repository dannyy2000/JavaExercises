package chapter10_exercices;

public class Circle extends TwoDimensionalShape{
    @Override
    public String toString() {
        return "Circle";
    }

    private int radius;



    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI) * radius * radius;
    }
}
