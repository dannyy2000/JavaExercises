package chapter10_exercices;

public class Sphere extends ThreeDimensionalShape{
    @Override
    public String toString() {
        return "Sphere";
    }

    private int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (4) * (Math.PI) * (radius * radius);
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * (radius * radius * radius)) / 3;
    }
}
