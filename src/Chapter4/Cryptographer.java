package Chapter4;

public class Cryptographer {
    public static int encrypt(int digits){
        int result = 0;
        int firstDigit = digits / 1000;
        int secondDigits = (digits % 1000) / 100;
        int thirdDigits = (digits % 1000);
        thirdDigits = (thirdDigits % 100) / 10;
        int fourthDigits = (digits % 1000);
         fourthDigits = (fourthDigits % 100);
        fourthDigits = (fourthDigits % 10);

        firstDigit += 7;
        secondDigits += 7;
        thirdDigits += 7;
        fourthDigits += 7;

        firstDigit %= 10;
        secondDigits %= 10;
        thirdDigits %= 10;
        fourthDigits %= 10;

        int tempStorage =  firstDigit;
        firstDigit = thirdDigits;
        thirdDigits = tempStorage;

        tempStorage = secondDigits;
        secondDigits = fourthDigits;
        fourthDigits = tempStorage;

        return 1000 * firstDigit + 100 * secondDigits + 10 * thirdDigits + fourthDigits;

    }
    public static int decrypt(int digits){
        int results = 0;
        int firstDigit = digits / 1000 % 10;
        int secondDigits = digits / 100 % 10;
        int thirdDigits = digits / 10 % 10;
//        thirdDigits = (thirdDigits % 100) / 10;
//        int fourthDigits = (digits % 1000);
//        fourthDigits = (fourthDigits % 100);
        int fourthDigits = digits % 10;

        int tempStorage =  firstDigit;
        firstDigit = thirdDigits;
        thirdDigits = tempStorage;

        tempStorage = secondDigits;
        secondDigits = fourthDigits;
        fourthDigits = tempStorage;

//       firstDigit %= 10;
//
        firstDigit = (firstDigit + 10 <= 16 ? firstDigit + 10 : firstDigit);
       secondDigits = (secondDigits + 10 <= 16) ? secondDigits + 10 : secondDigits;
//       thirdDigits %= 10;
       thirdDigits = (thirdDigits + 10 <= 16) ? thirdDigits + 10: thirdDigits;
//       fourthDigits %= 10;
       fourthDigits = (fourthDigits + 10 <= 16) ? fourthDigits + 10 : fourthDigits;

       firstDigit -= 7;
       secondDigits -= 7;
       thirdDigits -= 7;
       fourthDigits -= 7;

//       firstDigit *= 1000;
//       secondDigits *= 100;
//       thirdDigits *= 10;
       return 1000 * firstDigit + 100 * secondDigits + 10 * thirdDigits + fourthDigits;
//       return results;
//
    }
}
