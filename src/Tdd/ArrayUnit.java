package Tdd;

public class ArrayUnit {
    public static int[] reverse(int[] UserArray) {
        int[] reversedArray = new int[UserArray.length];
        //int backwardCounter = UserArray.length - 1;
        int forwardCounter = 0;

        for(int backwardCounter = UserArray.length -1;backwardCounter != -1;backwardCounter--){
            reversedArray[forwardCounter++] = UserArray[backwardCounter];

        }
        return reversedArray;
    }

    public static String reverse(String userString) {
        String reversedString = "";
        int backwardCounter = userString.length() - 1;
        while(backwardCounter != -1){
            reversedString += userString.charAt(backwardCounter--);

        }
        return reversedString;
    }

    public static String oneLineReverse(String userString){
        return new StringBuilder(userString).reverse().toString();
    }

    public static String capitalize(String userString) {
        String firstLetter = (""+userString.charAt(0)).toUpperCase();
        String otherLetters = "";
        for(int i = 1; i < userString.length();i++){
            otherLetters += userString.charAt(i);
        }
        return firstLetter + otherLetters.toLowerCase();

    }
}
