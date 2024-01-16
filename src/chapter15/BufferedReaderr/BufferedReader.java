//package chapter15.BufferedReaderr;
//
//import org.junit.platform.commons.logging.Logger;
//import org.junit.platform.commons.logging.LoggerFactory;
//
//import java.io.FileReader;
//import java.io.IOException;
//
//public class BufferedReader {
//    public static void main(String[] args) {
//        Logger logger = LoggerFactory.getLogger(BufferedReader.class);
//        try(java.io.BufferedReader bufferedReader = new java.io.BufferedReader(
//                new FileReader("C://Users\\user\\IdeaProjects\\JavaDietel\\src\\chapter15\\characterBased" +
//                        "\\Output.txt")
//        )){
//            System.out.println(bufferedReader.readLine());
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//    }
//}
