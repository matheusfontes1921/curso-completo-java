package entities;

import services.TaxPayment;

public class PayPal implements TaxPayment {
    private Contract contract;

    public double tax(double amount) {
        return 0.02 * amount;
    }

    @Override
    public double interest(double amount, int months) {
        return 0.01*months*amount;
    }
}
