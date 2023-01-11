package chapter14;

public class ExampleOne {
    public static void main(String[] args) {
        String name = new String();

          byte item1 = Byte.parseByte("65");
          byte item2 = Byte.parseByte("66");
          byte item3 = Byte.parseByte("67");

          byte[] myByteArray = {item1,item2,item3};
          String myName = new String(myByteArray,1,2);
        System.out.println(myName);


        char[] charArray = {'A','b','c','d'};
        String mySchoolName = new String(charArray);
        System.out.println(mySchoolName);


        String secondName = new String("Daniel");
        System.out.println(secondName);
        System.out.println(secondName.charAt(3));

        System.out.println(myName.length() == 2);
    }
}
