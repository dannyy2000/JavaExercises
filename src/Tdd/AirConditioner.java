package Tdd;

public class AirConditioner {

    private boolean isOn;

    private boolean isOff;
    private int temperature;

    public void setOn(boolean value) {
        isOn = value;
    }

    public void setOff(boolean value) {
        isOff = value;
    }

    public boolean getAcIsOn(){
        return isOn;
    }

    public boolean isOff() {
        return isOff;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if(temperature < 30 ){
        temperature = temperature + 1;
        }
    }


    public void decreaseTemperature() {
        if (temperature > 16) {
            temperature = temperature - 1;
        }
    }
    public void setTemperature(int degree) {
        temperature = degree;
    }
}