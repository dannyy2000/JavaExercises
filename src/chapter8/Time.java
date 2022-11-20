package chapter8;

public class Time {

    private int hour;
    private int minutes;
    private int second;

    public Time(int hour, int minutes, int second){
        validateTime(hour,minutes,second);

        this.hour = hour;
        this.minutes = minutes;
        this.second = second;

    }
    public Time(int hour){
        this(hour,0,0);
    }

    public Time(int hour,int minutes){
        this(hour,minutes,0);
    }
    public Time(){
        this(0,0,0);
    }


    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }


    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public static void validateTime(int hour, int minutes, int second) {
        validateHour(hour);
        validateMinutes(minutes);
        validateSecond(second);

    }

    public static void validateSecond(int second) {
        boolean secondIsInvalid = second < 0 || second > 59;

        if (secondIsInvalid){
            throw new IllegalArgumentException("Second is invalid");
        }
    }

    public   static void validateMinutes(int minutes) {
        boolean minutesIsInvalid = minutes < 0 || minutes > 59;

        if (minutesIsInvalid){
            throw new IllegalArgumentException("Minutes is invalid");
        }

    }

    public static void validateHour(int hour){
        boolean hourIsInvalid = hour < 0 || hour > 59;

        if (hourIsInvalid){
            throw new IllegalArgumentException("Hour is invalid");
        }
    }



}
