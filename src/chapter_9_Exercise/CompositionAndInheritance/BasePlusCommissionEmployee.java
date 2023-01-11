package chapter_9_Exercise.CompositionAndInheritance;

public class BasePlusCommissionEmployee {


  private  String firstName;
  private  String lastName;
  private  String ssn;
  private BasePlusCommissionCompensationModel basePlusCommissionCompensationModel;

  public BasePlusCommissionEmployee(String firstName, String lastName, String ssn,
                                    BasePlusCommissionCompensationModel basePlusCommissionCompensationModel) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.ssn = ssn;
    this.basePlusCommissionCompensationModel = basePlusCommissionCompensationModel;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  public BasePlusCommissionCompensationModel getBasePlusCommissionCompensationModel() {
    return basePlusCommissionCompensationModel;
  }

  public void setBasePlusCommissionCompensationModel(BasePlusCommissionCompensationModel basePlusCommissionCompensationModel) {
    this.basePlusCommissionCompensationModel = basePlusCommissionCompensationModel;
  }

  public double earnings(BasePlusCommissionCompensationModel basePlusCommissionCompensationModel){
    return basePlusCommissionCompensationModel.earnings();
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
