package Snacks;

public class Palindrome {

    public static String[] stringPalindrome(String[] word){
        
        String [] reverse = new String[word.length];

        for(int i = 0,j = reverse.length - 1;i < word.length;i++,j--){
            reverse[j] = word[i];
        }
        return reverse;
    }


    public static int[] intPalindrome(int[] numbers) {
        int[] reverse = new int[numbers.length];

        for(int i = 0,j = reverse.length - 1;i < numbers.length;i++,j--){
            reverse[j] = numbers[i];
        }
        return reverse;
    }
}

