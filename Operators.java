import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class Operators{
   public static void main(String[] args)
    {
        String one = "Hello";
        String two = "Hello";
        
       // System.out.println(one.equals(two));
        //System.out.println("Hello World");

        String sentence = "T    his is b  ett     er.";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);


//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        String string = "2017-01-01";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
        System.out.println(date);

        string = "August 25, 2017";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        date = LocalDate.parse(string, formatter);
        System.out.println(date);

        string = "August 25, 2017";
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate("MMMM d, yyyy");
        date = LocalDate.parse(string, formatter);
        System.out.println(date);
    }
}