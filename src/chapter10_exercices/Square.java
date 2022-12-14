package chapter10_exercices;

public class Square extends TwoDimensionalShape {
    private int side;

    @Override
    public String toString() {
        return "Square";
    }

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
