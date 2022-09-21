package chapter3;


public class Clock {
   private int hour;
    private int minutes;
  private  int seconds;

    public Clock(int hour,int minutes,int seconds) {
        if (hour > 23) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
        if (minutes > 59) {
            this.minutes = 0;
        } else {
            this.minutes = minutes;
        }

        if (seconds > 59) {
            this.seconds = 0;
        } else {
            this.seconds = seconds;
        }
    }
       public void setHour(int hour){
            this.hour = hour;
        }

        public int getHour(){
        return hour;
        }

        public void setMinutes(int minutes){
            this.minutes = minutes;
        }

        public int getMinutes(){
        return minutes;
        }

        public void setSeconds(int seconds) {
                this.seconds = seconds;
            }
            public String getDisplayTime () {
                return (hour + ":" + minutes + ":" + seconds);
            }

        }



