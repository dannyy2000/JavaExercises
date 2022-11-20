package Practise;

import java.util.Scanner;

public class Time2 {
    private int hour ;
    private int minutes;
    private int seconds;

    Scanner input = new Scanner(System.in);

    public Time2(int hour,int minutes,int seconds){
       this.hour = hour;
       this.minutes = minutes;
       this.seconds = seconds;
    }


    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minutes, seconds);

    }
    public String toString(){
              return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minutes, seconds, (hour < 12 ? "AM" : "PM"));
    }
    public static void main(String[] args) {
        Time2 time2 = new Time2(13,8,20);
        System.out.println(time2.toUniversalString());
        System.out.println(time2.toString());
    }
}