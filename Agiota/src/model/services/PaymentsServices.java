package model.services;

public interface PaymentsServices {

    double paymentFee(double amount);
    double interest(double amount,int month);

}
