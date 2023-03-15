import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello,World!");
}

public static void empregado(){
    Scanner teclado = new Scanner(System.in);
        ArrayList <Empregado> lista = new ArrayList<>();
        System.out.println("Digite o número de empregados: ");
        int n = teclado.nextInt();
        int i =0;
        while(i < n) {
            System.out.println("Nome do funcionário a ser adcionado: ");
            teclado.nextLine();
            String nome = teclado.nextLine();
            System.out.println("Salário do funcionário a ser adicionado: ");
            double salario = teclado.nextDouble();
            System.out.println("Id do funcionário a ser adicionado: ");
            int id = teclado.nextInt();
            if(!conferirId(lista,id)) {
                Empregado emp = new Empregado(nome,id,salario);
                lista.add(emp);
                i++;
            } else {
                System.out.println("Id já adicionado");
            }
        }

        for(Empregado e : lista) {
            System.out.println(e.toString());
            System.out.println(" ");
        }

        System.out.println("Id do funcionário que terá o aumento de salário: ");
        int idAumento = teclado.nextInt();
        Empregado emp = lista.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
        if(emp == null) {
            System.out.println("Salário não existe");
        } else {
            System.out.println("Qual a porcentagem a ser adicionado: ");
            double percent = teclado.nextDouble();
            System.out.println("O salário de " + emp.getNome() + " foi adicionado");
            emp.increaseSalary(percent);
            System.out.println("O novo salário é de " + emp.getSalary());
        }

    }

    public static boolean conferirId(ArrayList<Empregado> empregado, int id) {
        Empregado funcionario = empregado.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return funcionario!=null;
    }
}
