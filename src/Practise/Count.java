package Practise;

public class Count {



    public int noOfStrings(String strings) {
        int digit = 0;
        for(int i = 0;i < strings.length();i++){
            if(strings.charAt(i) >= '0' && strings.charAt(i) <= '9'){
                digit++;
            }
        }
        return digit;
    }

    public static int count(String text){
        int numberOfDigits = 0;
        for(int counter = 0;counter < text.length();counter++){
            if(Character.isDigit(text.charAt(counter))) numberOfDigits++;
        }
        return numberOfDigits;
    }


}
