import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeFormatter {

    public static int age(String text) {
//        LocalDate date = LocalDate.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//        String format = date.format(formatter);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate currentDate = LocalDate.now();
        LocalDate givenDate = LocalDate.parse(text, formatter);
        Period period = Period.between(givenDate, currentDate);
        return period.getYears();

    }

    public static void main(String[] args) {
            String date = "14/05/2000";
            System.out.println(age(date));

    }

}

