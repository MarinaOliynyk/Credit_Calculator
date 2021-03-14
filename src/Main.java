public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int creditAmount = 1_000_000;
        double percent = 9.99;
        int creditPeriod;

        creditPeriod = 12;
        double annuityPayment = service.calculate(creditAmount, percent, creditPeriod);
        System.out.printf("Срок кредита %d мес. Ежемесячный платеж =  %.0f руб.\n", creditPeriod, annuityPayment);

        creditPeriod = 24;
        annuityPayment = service.calculate(creditAmount, percent, creditPeriod);
        System.out.printf("Срок кредита %d мес. Ежемесячный платеж =  %.0f руб.\n", creditPeriod, annuityPayment);

        creditPeriod = 36;
        annuityPayment = service.calculate(creditAmount, percent, creditPeriod);
        System.out.printf("Срок кредита %d мес. Ежемесячный платеж =  %.0f руб.\n", creditPeriod, annuityPayment);

    }
}
