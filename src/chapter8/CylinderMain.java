package chapter8;

public class CylinderMain {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(5);
        cylinder.setRadius(3);
        int vol = (int) cylinder.cylinderVolume(cylinder.getHeight(), cylinder.getRadius());
        System.out.println("The volume of your cylinder is: "+ vol);
    }
}
