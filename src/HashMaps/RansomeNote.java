package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class RansomeNote {
    public static boolean canConstruct(String ransomNote, String magazine) {

        Map<String,Integer> hashRansomeNote = new HashMap<>();

        for(char word: magazine.toCharArray()){
            String words = String.valueOf(word);
            hashRansomeNote.put(words,hashRansomeNote.getOrDefault(words,0)+1);


        }
        boolean check = true;
        for (char word: ransomNote.toCharArray()){
            String words = String.valueOf(word);
            if(!hashRansomeNote.containsKey(words) || hashRansomeNote.get(words) == 0){
                check = false;
            }
            else{
                hashRansomeNote.put(words,hashRansomeNote.get(words) - 1);
            }

        }

          return check;
        }




















    public static void main(String[] args) {
       String ransomNote = "aa";
       String magazine = "aab";

        System.out.println(canConstruct(ransomNote, magazine));


    }
}