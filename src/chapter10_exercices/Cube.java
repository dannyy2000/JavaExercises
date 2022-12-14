package chapter10_exercices;

public class Cube extends ThreeDimensionalShape {
    @Override
    public String toString() {
        return "Cube";
    }

    private int side;
    private int length;

    public Cube(int side, int length) {
        this.side = side;
        this.length = length;
    }



    @Override
    public double getArea() {
        return 6 * (side * side);
    }

    @Override
    public double getVolume() {
        return length * length * length;
    }
}
