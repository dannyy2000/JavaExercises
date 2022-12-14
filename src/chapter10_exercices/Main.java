package chapter10_exercices;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(10);
        Triangle triangle = new Triangle(4, 8);
        Sphere sphere = new Sphere(4);
        Cube cube = new Cube(4, 6);
        Tetrahedron tetrahedron = new Tetrahedron(3);

        Shape[] shapes = new Shape[6];

        shapes[0] = circle;
        shapes[1] = square;
        shapes[2] = triangle;
        shapes[3] = sphere;
        shapes[4] = cube;
        shapes[5] = tetrahedron;


        for (Shape myShape : shapes) {
            System.out.println(myShape);
            if (myShape instanceof TwoDimensionalShape) {
                System.out.println(myShape.getArea());

            } else if (myShape instanceof ThreeDimensionalShape) {
                System.out.println(((ThreeDimensionalShape) myShape).getVolume());
                System.out.println(myShape.getArea());
            }
            System.out.println();
        }
    }
}







