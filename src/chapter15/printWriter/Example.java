package chapter15.printWriter;

import java.io.IOException;
import java.io.PrintWriter;

public class Example {
    public static void main(String[] args) {
        try(PrintWriter writer = new PrintWriter("C:\\Users\\user\\IdeaProjects\\JavaDietel\\src\\chapter15\\printWriter\\daniel.txt")){
            writer.print("hello there");
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
