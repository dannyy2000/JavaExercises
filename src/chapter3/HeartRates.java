package chapter3;

import java.time.LocalDate;

public class HeartRates {
    private String firstName;
    private String lastName;

    private int day;

    private int month;

    private int yearOfBirth;
    // private LocalDate dateOfBirth;

    public HeartRates(String firstName, String lastName, int day, int month, int yearOfBirth) {
        this.firstName = firstName;

        this.lastName = lastName;

        this.day = day;

        this.month = month;

        this.yearOfBirth = yearOfBirth;

        //this.dateOfBirth = dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
    // public void setDateOfBirth(LocalDate dateOfBirth) {
    //  Scanner input = new Scanner(System.in);

    //System.out.print("Enter the date of birth in yyyy-mm-dd: ");
    //String dob = input.nextLine();

//        hr.setDateOfBirth(LocalDate.parse(dob));

    //  System.out.print("Enter the month of birth: ");
    //int month = input.nextInt();

    //System.out.print("Enter the year of birth: ");
    //int yearOfBirth = input.nextInt();

    //System.out.print("Enter the present year: ");
    //int presentYear = input.nextInt();
    //int thisYear = LocalDate.now().getYear();
    //public LocalDate getDateOfBirth() {
    //System.out.println(pr);

    //int year = presentYear - yearOfBirth;
    //}

    //public LocalDate getDateOfBirth() {
    //  return dateOfBirth;
    //}

    public int getAge() {
        return LocalDate.now().getYear() - yearOfBirth;

    }

    public int getMaximumHeartRate() {
        return 220 - (LocalDate.now().getYear() - yearOfBirth);
    }
    public String getDateOfBirth () {
        return (yearOfBirth + ":" + month + ":" + day);
    }
    public int getTargetHeartRateFor50(){
        return (int) (0.5 * getMaximumHeartRate());
    }
    public int getTargetHeartRateFor85(){
        return (int) (0.85 * getMaximumHeartRate());
    }
    public int getTotalTargetHeartRate1(){
        return getTargetHeartRateFor50();
    }
    public int getTotalTargetHeartRate2(){
        return getTargetHeartRateFor85();
    }


}





