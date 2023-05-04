package services;

public interface TaxPayment {
    double tax(double amount);
    double interest(double amount, int months);
}
