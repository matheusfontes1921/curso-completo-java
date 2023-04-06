package app;

import entities.Account;
import exception.DomainException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Número da conta: ");
            int numero = teclado.nextInt();
            System.out.println("Nome do titular: ");
            String titular = teclado.next();
            System.out.println("Saldo atual: ");
            double saldoAtual = teclado.nextDouble();
            System.out.println("Limite de saque: ");
            double saque = teclado.nextDouble();

            Account acc1 = new Account(numero, titular, saldoAtual, saque);

            System.out.println("Valor que será sacado: ");
            double valorSaque = teclado.nextDouble();
            acc1.withdraw(valorSaque);
            System.out.println("Novo saldo da conta: " + acc1.getSaldo());

        } catch (DomainException e) {
            System.out.println("Erro no saque: " + e.getMsg());
        }
        catch (InputMismatchException e) {
            System.out.println("Dado não esperado");
        }
        catch (RuntimeException e) {
            System.out.println("Erro inesperado");
        }

    }
}