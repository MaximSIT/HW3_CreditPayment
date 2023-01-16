public class CreditPaymentService {
    public double calculate(int creditSum, double rate, int years) {
        int month = years * 12;
        double ratePerMonth = rate / 100 / 12;
        int x5 = -month;
        double x4 = 1 + ratePerMonth;
        double x3 = Math.pow(x4, x5);
        double x2 = 1 - x3;
        double x1 = ratePerMonth / x2;
        double amount = creditSum * x1;
        return (int) amount;
    }
}