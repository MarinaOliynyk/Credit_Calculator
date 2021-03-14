public class CreditPaymentService {
    public double calculate(int creditAmount, double percent, int creditPeriod) {
        percent = percent / 100 / 12;
        return (creditAmount * (percent + percent / (Math.pow(1 + percent, creditPeriod) - 1)));
    }

}
