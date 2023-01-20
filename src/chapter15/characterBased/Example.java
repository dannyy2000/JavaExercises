package chapter15.characterBased;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Example {
    public static void main(String[] args) {
        try( BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in))){
            System.out.println("Enter a string: ");
            String input = bufferedReader.readLine();
            System.out.println("digits:: ");

            for(int count = 0;count <input.length();count++){
                if(input.charAt(count) == ' ')
                    System.out.println(Character.toString(input.charAt(count+1)));
            }

            } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    }

