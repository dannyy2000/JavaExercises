package chapter3;

public class Account{
 private String name;
 private double balance;

public Account(String name,double balance){
  this.name = name;
 
  this.balance = balance;
}
 public void withdrawal(double withdrawalAmount){
  if(withdrawalAmount <= balance)
    balance = balance - withdrawalAmount;

  else if(withdrawalAmount > balance)
       System.out.println("The amount exceeded the account balance");
        
  }

  public double getBalance(){
   return balance;
}
  public void setName(String name){
    this.name = name;
}
  public String getName(){
   return name;
}
}