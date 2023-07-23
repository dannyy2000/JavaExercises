import java.util.Arrays;

public class ReverseArray {

    public static char[] reverse(char [] list){
        char[] result = new char[list.length];
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }return result;
    }

    public static void main(String[] args) {
        char [] letters = {'s','e','m','i','c','o','l','o','n'};
        System.out.println(reverse(letters));

    }
}
