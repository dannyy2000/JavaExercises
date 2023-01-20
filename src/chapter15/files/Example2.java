package chapter15.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example2 {
    public static void main(String[] args) {
        Path currentDirectory = Paths.get("").toAbsolutePath();
        Path target = Paths.get("C:\\Users\\user\\IdeaProjects\\JavaDietel\\src\\chapter15\\formatter\\" +
                "ExampleFormat.java");
        Path relative = currentDirectory.relativize(target);
        System.out.println(relative);
        System.out.println(relative.getFileName());
        System.out.println("isDirectory:: "+ Files.isDirectory(relative));
        System.out.println("exists:: "+Files.exists(relative));

        try{
            System.out.println(("modified:: " + Files.getLastModifiedTime(relative)));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
