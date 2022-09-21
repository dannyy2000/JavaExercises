public class AirCondition {
    public String state;
    public int temperature;

    public void turnOn(){
        state= "it is on";
    }

    public void turnOff(){
        state = "it is off";
    }

    public String showState() {
        return state;
    }

    public void increaseTemperature( int increase) {
        temperature = temperature + increase;
        if (temperature > 30){
            temperature= 30;
        }



    }

    public int showTemperature() {
        return temperature;
    }
}
