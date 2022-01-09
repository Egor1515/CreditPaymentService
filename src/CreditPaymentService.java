public class CreditPaymentService {
    public double calculate(int amount, int credterm, double irate){


         double x =  (irate / credterm) / 100;
         double z = x + 1;
         double i = Math.pow(z,credterm);
         double payment = (x * i) / (i - 1) * (amount);

         return payment;




        //Сумма кредита, срок кредита, ежемесяыный платеж, процентная ставка,
    }
}
