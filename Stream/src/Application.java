import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o caminho do arquivo: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);
        try (BufferedReader br = new BufferedReader(new FileReader (path))) {
            Comparator<String> comp = (p1,p2) -> p1.toUpperCase().compareTo(p2.toUpperCase());
            List<Employeer> list = new ArrayList<>();
            String line = br.readLine();
            while(line != null) {
                String[] fields = line.split(",");
                list.add(new Employeer(fields[0],fields[1],Double.parseDouble(fields[2])));
                line = br.readLine();
            }
            System.out.println("Digite a nota de corte: ");
            double notaCorte = sc.nextDouble();
            List<String> listEmail = list.stream()
                    .filter(x -> x.getSalary() > notaCorte)
                    .map(x -> x.getName())
                    .sorted(comp)
                    .collect(Collectors.toList());
            listEmail.forEach(System.out::println);
            double sum = list.stream()
                    .filter(x -> x.getName().charAt(0) == 'M')
                    .map(x -> x.getSalary())
                    .reduce(0.0, (x, y) -> x + y);
            System.out.println("Soma dos salários de funcionários cujo e-mail começa com a letra m = " +  sum);



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
