package Chief_class;

import java.math.BigDecimal;

public class Citizen {

    private String firstName;
    private String surname;
    private BigDecimal earnings;

    public Citizen(){}
    public Citizen(String firstName,String lastName,BigDecimal earnings){
        this.firstName = firstName;
        surname = lastName;
        this.earnings = earnings;
    }

    public Citizen(String firstName,String lastName){
        this.firstName = firstName;
        this.surname = lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getEarnings() {
        return earnings;
    }

    public void setEarnings(BigDecimal earnings) {
        this.earnings = earnings;
    }

}
