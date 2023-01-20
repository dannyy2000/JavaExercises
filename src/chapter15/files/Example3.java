package chapter15.files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example3 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\");
        System.out.println(path);
//        Path path = Paths.get(System.getProperty("file.separator")+"home","semicolon");
//        System.out.println(path);
        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)){
            directoryStream.forEach(content -> System.out.println(content.getFileName()));
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
