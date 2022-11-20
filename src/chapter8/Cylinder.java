package chapter8;

import java.math.*;
public class Cylinder {

    double radius = 1;
    double height = 1;

    double volume;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0){
        this.radius = radius;}
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0.0 ){
        this.height = height;}
    }

    public double cylinderVolume(){
        double radHeight;
        radHeight = (radius * height) * 2;
        volume = Math.PI * radHeight;
        return Math.round(volume);
    }
    public double cylinderVolume(double radius, double height){
        double sqrRadHeight;
        if (radius > 0 && height > 0){
            sqrRadHeight = (radius * height) * 2;
            volume = Math.PI * sqrRadHeight;
        }return Math.round(volume);
    }
}
