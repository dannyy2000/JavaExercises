package Practise;

public class Date {

    private int day;
    private int month;
    private int year;


    public Date(int day,int month,int year){
        validateDate(day,month);
        this.day = day;
        this.month = month;
        this.year = year;
    }
//    public int getDay() {
//        return day;
//    }
//
//    public void setDay(int day) {
//        validateDay(day);
//        this.day = day;
//    }
//
//    public int getMonth() {
//        return month;
//    }
//
//    public void setMonth(int month) {
//        validateMonth(month);
//        this.month = month;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//

    private static void validateDate(int day, int month) {
        validateDay(day);
        validateMonth(month);
    }

    private static void validateMonth(int month) {
        boolean invalidMonth = month <= 0 || month > 12 ;
        if(invalidMonth){
            throw new IllegalArgumentException("Enter a valid month");
        }
    }

    private static void validateDay(int day) {
        boolean invalidDay = day > 30 || day > 31;
        if(invalidDay){
            throw new IllegalArgumentException("Enter a valid day");
        }
    }
     public String dateFormat(){
        return String.format("%2d/%02d/%4d",day,month,year);
     }
}
