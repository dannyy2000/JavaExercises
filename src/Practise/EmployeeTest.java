package Practise;

import java.util.Scanner;

public class EmployeeTest {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

  Date birth = new Date(16,5,2000);
  Date hire = new Date(11,6,2022);
  Employee employee = new Employee("Daniel","Akinsanya",birth,hire);
      System.out.println(employee.toString() );


  // Employee employee = new Employee("Daniel","Akinsanya",11/6/2022);
}
}