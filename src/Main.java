// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Ежемесячный платеж по кредиту " + service.calculate(1, 1000000) + " руб.");
        System.out.println();

        System.out.println("Ежемесячный платеж по кредиту " + service.calculate(2, 1000000) + " руб.");
        System.out.println();

        System.out.println("Ежемесячный платеж по кредиту " + service.calculate(3, 1000000) + " руб.");
        System.out.println();
    }

}
