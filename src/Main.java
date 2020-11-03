public class Main {
    public static void main(String[] args) {

        CreditPaymentService creditPayment = new CreditPaymentService();
        System.out.println(creditPayment.calculate(1000000, 36, 0.0999));

    }
}
