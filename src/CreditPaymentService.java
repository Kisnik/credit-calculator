public class CreditPaymentService {
    int calculate (int total, int month, double percent) {
       int payment = 0;

       //процентная ставка на 1 месяц
        double percent_m = percent/12;
        //вспомогательное вычисление для формулы расчета платежа
        double tmp = Math.pow(1+percent_m, month)-1;

        //расчет платежа
        payment = (int) (total*(percent_m+percent_m/tmp));


       return payment;
    }

}
