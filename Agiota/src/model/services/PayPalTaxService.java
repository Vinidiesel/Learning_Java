package model.services;

public class PayPalTaxService implements PaymentsServices {

    private static final double PAYMENT_FEE = 0.02;
    private static final double MONTHLY_INTEREST = 0.01;

    @Override
    public double paymentFee(double amount) {
        return amount * PAYMENT_FEE;
    }

    @Override
    public double interest(double amount, int month) {
        return amount * month * MONTHLY_INTEREST;
    }
}
