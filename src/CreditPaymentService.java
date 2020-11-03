public class CreditPaymentService {
    int calculate(int total, int month, double percent) {
        int payment = 0;

        //процентная ставка на 1 месяц
        double percentm = percent / 12;
        //вспомогательное вычисление для формулы расчета платежа
        double tmp = Math.pow(1 + percentm, month) - 1;

        //расчет платежа
        payment = (int) (total * (percentm + percentm / tmp));


        return payment;
    }

}
