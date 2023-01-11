package chapter14.sample;

import java.io.FileInputStream;

public class Sample {
    public static void main(String[] args) {
      String text = """
              1.We are paragons
              2.I am a winner 365 days a year
              3. The devil is a liar
              4.There are 7 days a week
              """;
      StringBuilder stringBuilder = new StringBuilder();
      for(int counter = 0;counter<text.length();counter++){
          char currentCharacter = text.charAt(counter);
          if(Character.isDigit(currentCharacter)){
              stringBuilder.append(currentCharacter);
          }
      }
      String digits = stringBuilder.toString();
        System.out.println(digits);
    }
}
