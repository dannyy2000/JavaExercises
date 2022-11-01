package chapter8;

public class Guy {
    private String name;
    private String phoneNumber;
    private Babe girlFriend;

    public void changeBabe(Babe newBabe){
        girlFriend = newBabe;
    }

    public String whatsYaBabesName(){
        return girlFriend.getName();
    }

}
