import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean shouldContinue = true;

        while (shouldContinue) {
            System.out.println("Enter the currency you want to convert: PLN, EUR, USD");
            String currencyToConvert = scanner.next().toUpperCase();
            System.out.println();

            System.out.println("Enter the amount in " + currencyToConvert + ":");
            double amount = scanner.nextDouble();
            System.out.println();

            System.out.println("Enter the currency you want to convert to: PLN, EUR, USD");
            String currencyToConvertTo = scanner.next().toUpperCase();
            System.out.println();

            String exchange = currencyToConvert + "_" + currencyToConvertTo;

            try {
                ExchangeRate exchangeRate = ExchangeRate.valueOf(exchange);
                double result = amount * exchangeRate.getRatio();

                System.out.println(amount + " " + currencyToConvert + " is an equivalent of " + result + " " + currencyToConvertTo);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input.");
            }
            System.out.println();
        }
    }
}