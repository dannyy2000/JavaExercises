package Snacks;

public class Book {


    private String name;
    private String address;
    private String telephone;
    private String email;
   private PhoneBook phoneBook;

    public Book(String name, String address, String telephone, String email) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PhoneBook getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public String toString(){
        return String.format("%s: %s%n%s: %s%n%s: %s%n%s: %s","name"
                ,name,"address",address,"telephone",telephone,"email",email);
    }

}
