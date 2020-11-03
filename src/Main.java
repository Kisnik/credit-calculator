public class Main {
    public static void main(String[] args) {

        CreditPaymentService creditPayment = new CreditPaymentService();
        System.out.println(creditPayment.calculate(1000000, 12, 0.0999));
        System.out.println(creditPayment.calculate(1000000, 24, 0.0999));
        System.out.println(creditPayment.calculate(1000000, 36, 0.0999));

    }
}
