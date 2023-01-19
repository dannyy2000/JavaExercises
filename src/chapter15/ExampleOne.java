package chapter15;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ExampleOne {
    public static void main(String[] args) {
        try {
            var printStream = new PrintStream("C:\\Users\\user\\IdeaProjects\\JavaDietel\\src\\chapter15\\" +
                    "printStreamOutput.txt");
            printStream.println("Semicolon Africa");


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage() );
        }
    }

}
