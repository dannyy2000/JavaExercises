package chapter_9_Exercise.CompositionAndInheritance;

public class CommissionEmployee {


    private  String firstName;
    private  String lastName;
    private  String ssn;
    private CommissionCompensationModel  commissionCompensationModel;

    public CommissionEmployee(String firstName, String lastName, String ssn, CommissionCompensationModel
            commissionCompensationModel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.commissionCompensationModel = commissionCompensationModel;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setCommissionCompensationModel(CommissionCompensationModel commissionCompensationModel) {
        this.commissionCompensationModel = commissionCompensationModel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public CommissionCompensationModel getCommissionCompensationModel() {
        return commissionCompensationModel;
    }

    public double earnings(CommissionCompensationModel commissionCompensationModel){
        return commissionCompensationModel.earnings();
    }

    @Override
    public String toString() {
        return String.format(
                "%s: %s %s%n%s: %s",
                "base-salaried commission employee",firstName, lastName,
                "social security number", ssn
        );
    }


}
