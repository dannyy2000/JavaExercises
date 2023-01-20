package chapter15.BufferedWriterr;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
      try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\user\\IdeaProjects\\JavaDietel\\src\\chapter15\\BufferedWriterr\\intellij.txt"))){
          bufferedWriter.write("I love you");
      } catch (IOException e) {
          System.out.println(e.getMessage());
      }
    }
}
