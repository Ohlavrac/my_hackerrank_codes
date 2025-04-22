import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        //OLD LOCALE
        //Locale in = new Locale("en", "IN");

        //NEW LOCALE
        Locale in = Locale.of("en", "IN");
        NumberFormat currencyUS = NumberFormat.getCurrencyInstance(Locale.US);

        String us = currencyUS.format(payment);
        String india = convertPayment(in, payment);
        String china = convertPayment(Locale.CHINA, payment);;
        String france = convertPayment(Locale.FRANCE, payment);
        
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
    
    public static String convertPayment(Locale locale, Double payment) {
        NumberFormat paymentFormated = NumberFormat.getCurrencyInstance(locale);
        
        return paymentFormated.format(payment);
    }
}