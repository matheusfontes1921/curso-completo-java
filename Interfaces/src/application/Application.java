package application;

import entities.Contract;
import entities.PayPal;
import services.ContractService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Número do contrato: ");
        int contractNumber = sc.nextInt();
        System.out.print("Data do contrato (dd/MM/yyyy): ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(sc.next(),fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();
        Contract c1 = new Contract(date, totalValue, contractNumber);
        System.out.print("Número de parcelas: ");
        int pNumber = sc.nextInt();

        ContractService contractService = new ContractService(new PayPal());
        contractService.processContract(c1,pNumber);




    }
}
