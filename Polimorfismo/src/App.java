import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws ParseException {
        Scanner teclado = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Produto> list = new ArrayList<>();
        System.out.println("Enter the number of products: ");
        int qtd = teclado.nextInt();
        for (int i=1;i<=qtd;i++) {
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/i/u): ");
            char c = teclado.next().charAt(0);
            System.out.print("Name: ");
            String name = teclado.nextLine();
            teclado.next();
            System.out.println("\nPrice: ");
            Double price = teclado.nextDouble();
            teclado.next();
            if (c == 'i') {
                teclado.next();
                System.out.println("Customs fee: ");
                Double customsFee = teclado.nextDouble();
                Produto p = new ImportedProduct(name,price,customsFee);
                list.add(p);
            } else {
                if (c == 'u') {
                    System.out.println("Manufacture Date: ");
                    Date manufactureDate = sdf.parse(teclado.next());
                    Produto p = new UsedProduct(name,price,manufactureDate);
                    list.add(p);
                } else {
                    Produto p = new Produto(name,price);
                    list.add(p);
                }
            }
        }
        for (Produto p : list) {
            System.out.println(p.getPrice() + " - " + p.getName());
        }



    }
}
