package chapter_9_Exercise;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       AudioBook audioBook = new AudioBook("Rich dad,poor dad",2000,"Akinsanya daniel",
               100,50,"Oluwatomiwa");
       PrintBook printBook = new PrintBook("Titanic",2001,"Jack","John stones",
               "333-33-1245");

        System.out.println(audioBook.toString());
        System.out.println(printBook.toString());


    }
}
