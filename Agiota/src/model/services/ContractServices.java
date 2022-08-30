package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractServices {

    private PaymentsServices paymentsServices;

    public ContractServices(PaymentsServices paymentsServices) {
        this.paymentsServices = paymentsServices;
    }

    public void processContract(Contract contract, int month){
        double basicQuota = contract.getTotalValue() / month;
        for (int i = 1; i <= month; i++) {
            double updatedQuota = basicQuota + paymentsServices.interest(basicQuota,i);
            double fullQuota = updatedQuota + paymentsServices.paymentFee(updatedQuota);
            Date dueDate = addMonths(contract.getDate(),i);
            contract.getInstallments().add(new Installment(dueDate,fullQuota));
        }
    }

    private Date addMonths(Date date, int N){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, N);
        return calendar.getTime();
    }
}
