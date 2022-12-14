package chapter10_exercices;

public class Triangle extends TwoDimensionalShape{
    @Override
    public String toString() {
        return "Triangle";
    }

    private int base;
    private double height;

    public Triangle(int base, double height) {
        this.base = base;
        this.height = height;
    }



    @Override
    public double getArea() {
        return (height * base) / 2;
    }
}
