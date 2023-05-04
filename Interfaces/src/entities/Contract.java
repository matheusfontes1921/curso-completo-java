package entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private LocalDate date;
    private List<Installment> installments = new ArrayList<>();
    private Double totalValue;
    private Integer contractNumber;

    public Contract(){}
    public Contract(LocalDate date, Double totalValue, Integer contractNumber) {
        this.contractNumber = contractNumber;
        this.date = date;
        this.totalValue = totalValue;

    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public Integer getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(Integer contractNumber) {
        this.contractNumber = contractNumber;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

}
