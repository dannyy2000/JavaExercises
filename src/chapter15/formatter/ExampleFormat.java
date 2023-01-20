package chapter15.formatter;

    import java.io.FileInputStream;
    import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

    public class ExampleFormat {
        public static void main(String[] args) {
            StringBuilder builder = new StringBuilder();
            String patch = "Earn A living, dont stay idle ";


            try (Formatter formatter = new Formatter(
                    "format.txt");
                 Scanner scanner = new Scanner(
                         new FileInputStream("C:\\Users\\user\\IdeaProjects\\JavaDietel\\src\\chapter15\\printWriter\\daniel.txt")))
            { String str = scanner.nextLine();
                formatter.format("File update from %s to %s", str, builder.append(patch));
            } catch (IOException e) {
                System.err.println(e.getMessage());

            }

        }
    }
