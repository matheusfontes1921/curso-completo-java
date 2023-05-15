import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Aluno> a = new HashSet<>();
        Set<Aluno> b = new HashSet<>();
        Set<Aluno> c = new HashSet<>();
        System.out.println("Quantos alunos existem no curso A? ");
        int numA = sc.nextInt();
        for (int i=0;i<numA;i++){
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.println(" ");
            System.out.print("Código: ");
            int code = sc.nextInt();
            a.add(new Aluno(nome,code));
        }
        System.out.println("Quantos alunos no curso B?");
        int numB = sc.nextInt();
        for (int i=0;i<numB;i++){
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.println(" ");
            System.out.print("Código: ");
            int code = sc.nextInt();
            b.add(new Aluno(nome,code));
        }
        System.out.println("Quantos alunos no curso C?");
        int numC = sc.nextInt();
        for (int i=0;i<numC;i++){
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.println(" ");
            System.out.print("Código: ");
            int code = sc.nextInt();
            c.add(new Aluno(nome,code));
        }
        a.addAll(b);
        a.addAll(c);
        for(Aluno aluno : a){
            System.out.println(aluno);
        }
        System.out.println("Número de alunos = " + a.size());

    }
}
