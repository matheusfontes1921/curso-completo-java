package entities;

import exception.DomainException;

import javax.naming.LimitExceededException;

public class Account {
    private int number;
    private String nomeTitular;
    private Double saldo;
    private Double limiteSaque;

    public Account(){
    }

    public Account(int number, String nomeTitular, Double saldo, Double limiteSaque) {
        this.number = number;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public void deposit(double valorDeposito) {
        saldo += valorDeposito;
    }

    public void withdraw(double valorSaque) throws DomainException {
        saldo -= valorSaque;
        if(valorSaque > getLimiteSaque()) {
            throw new DomainException("Limite de saque foi atingido");
        }
        if(valorSaque > getSaldo()) {
            throw new DomainException("Valor de saque superior ao saldo atual");
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }
}
