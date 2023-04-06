import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }

    public static void taxPayer() {
        List<Pessoa> lista = new ArrayList<>();
        System.out.println("Quantas pessoas irão pagar impostos? ");
        int quantidade = sc.nextInt();
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Pessoa física ou jurídica: ");
            String option = sc.nextLine().toUpperCase();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Renda anual: ");
            Double rendaAnual = sc.nextDouble();
            if (option == "FÍSICA") {
                System.out.println("Gatos com saúde: ");
                double gastosSaude = sc.nextDouble();
                lista.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            } else if (option == "JURÍDICA") {
                System.out.println("Número de funcionários da empresa: ");
                int numFuncionarios = sc.nextInt();
                lista.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
            } else {
                System.out.println("Valor inválido");
            }
        }
        System.out.println("Taxas pagas: ");
        for (Pessoa p : lista) {
            System.out.println("Nome: " + p.getNome() + "\nTaxas pagas: " + p.calcularImporto());
        }
    }}
}

