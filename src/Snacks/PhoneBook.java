package Snacks;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {

     ArrayList <Book> list = new ArrayList<>();

    public PhoneBook(ArrayList<Book> list) {
        this.list = list;
    }

    public void create(Book book){
       if(!find(book.getName())) list.add(book);
       else System.out.println("Record already exists");
   }

  public boolean find(String name){
        for(Book phone: list){
            System.out.println(1);
        }
        return false;
  }

  public Book delete(String name){
        Book bookDel = null;
        for(Book record:list){
            if(record.getName() == null){
                System.out.println("Invalid record id");
            }
            else{
                list.remove(bookDel);
                System.out.println("Successfully deleted");
            }

        }
        return bookDel;
  }

  public Book findBook(String name){
        for(Book record : list){
            if(record.getName() .equals(name) ){
               return record;
            }
        }
        return null;
  }

  public void update(String name, Scanner input) {
      if (find(name)) {
          Book book = findBook(name);
          System.out.println("what is the new name");
          String newName = input.next();

          System.out.println("What is the new email");
          String email = input.next();

          System.out.println("What is the new telephone ");
          String telephone = input.next();

          System.out.println("What is the new address");
          String address = input.next();

          book.setName(newName);
          book.setAddress(address);
          book.setTelephone(telephone);
          book.setEmail(email);

          System.out.println("Phonebook record updated successfully");
      }
          else{
              System.out.println("Phonebook not found");
          }

  }

  public void display(){
        if(list.isEmpty()) System.out.println("The list has no records");
        for(Book rec: list){
            System.out.println(rec.toString());
        }
  }

  public void menu(){
        Scanner input = new Scanner(System.in);
      System.out.println("""
              MENU
              1. Add contact
              2. delete contact
              3.update contact
              4. display contacts
              5.search contact
              99. exit program""");
      System.out.print("Enter your selection");
      int menu = input.nextInt();
  }

}
