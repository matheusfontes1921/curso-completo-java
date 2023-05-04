package services;

import entities.Contract;
import entities.Installment;
import services.TaxPayment;

import java.time.LocalDate;

public class ContractService {
    private TaxPayment taxPayment;

    public ContractService(TaxPayment taxPayment) {
        this.taxPayment = taxPayment;
    }

    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = taxPayment.interest(basicQuota,i);
            double fee = taxPayment.tax(basicQuota+interest);
            double total = basicQuota + interest + fee;
            System.out.println("Data da parcela: " + dueDate + " - Valor da Parcela: " + total);
            contract.getInstallments().add(new Installment(dueDate, total));
        }
    }
}
