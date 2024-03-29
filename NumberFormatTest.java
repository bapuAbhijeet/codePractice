import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NumberFormatTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        String us =  NumberFormat.getCurrencyInstance(Locale.US).format(payment);
         String india =  NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);
       String china =  NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
       String france =  NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        // Write your code here.
       System.out.println("US: " + NumberFormat.getCurrencyInstance(new Locale("en","US")).format(payment));
        System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(new Locale("zh","CN")).format(payment));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(new Locale("fr","FR")).format(payment));
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}