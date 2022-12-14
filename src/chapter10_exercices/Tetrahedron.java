package chapter10_exercices;

public class Tetrahedron extends ThreeDimensionalShape{
    @Override
    public String toString() {
        return "Tetrahedron";
    }

    private double side;

    public Tetrahedron(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * (side * side);
    }

    @Override
    public double getVolume() {
        return (side * side * side) / 6 * Math.sqrt(2);
    }
}
