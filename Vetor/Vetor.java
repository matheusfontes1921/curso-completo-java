import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        exercicioUm();
        exercicioDois();
        exercicioTres();
        exercicioQuatro();
        exercicioCinco();
        exercicioSeis();
        exercicioSete();
    }

    public static void exercicioUm(){
        /*  Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
            e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos números serão inscritos?");
        int n = teclado.nextInt();
        int [] vect = new int[n];
        int qtdNegativo = 0;
        ArrayList vectNegativo = new ArrayList<>();

        for(int i = 0; i<n; i++) {
            System.out.println("Número: ");
            int numAtual = teclado.nextInt();
            vect[i] = numAtual;
            if(numAtual<0) {
                vectNegativo.add(numAtual);

            }
        }
        System.out.println(Arrays.toString(vect));
        System.out.println(vectNegativo);
    }

    public static void exercicioDois(){
        /*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor*/
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos números serão inscritos?");
        int n = teclado.nextInt();
        double [] vect = new double[n];
        double soma = 0;
        for (int i = 0; i<n; i++) {
            System.out.println("Número: ");
            double numAtual = teclado.nextDouble();
            vect[i] = numAtual;
            soma += numAtual;
        }
        System.out.println("Valores: " + Arrays.toString(vect));
        System.out.printf("A soma é: %.2f ",soma);
        System.out.println(" ");
        double media = soma/n;
        System.out.printf("A média é: %.2f ", media, "\n");
    }

    public static void exercicioTres(){
        /*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
        tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
        bem como os nomes dessas pessoas caso houver. */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Número de pessoas: ");
        int n = teclado.nextInt();
        int somaMenores = 0;
        String nome;
        double porcentagem = 0;
        double somaAltura = 0;
        ArrayList pessoas = new ArrayList<>();
        for (int i=0;i<n;i++) {
            System.out.println("Nome: ");
            nome =  teclado.next();
            System.out.println("Altura: ");
            double altura = teclado.nextDouble();
            somaAltura += altura;
            System.out.println("Idade: ");
            int idade = teclado.nextInt();
            if(idade<16) {
                pessoas.add(nome);
                somaMenores++;


            }
            porcentagem = (double) somaMenores/n*100;
        }
        double mediaAltura = somaAltura / n;
        System.out.println("Pessoas com menos de 16 anos: " + pessoas);
        System.out.printf("A média das alturas é de: %.2f", mediaAltura);
        System.out.println(" ");
        System.out.printf("A porcentagem de menores é: %.2f", porcentagem);
    }

    public static void exercicioQuatro() {
        /*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
        tela todos os números pares, e também a quantidade de números pares. */
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantidade de números: ");
        int n = teclado. nextInt();
        int[] numeros = new int[n];
        int qtdPar = 0;
        ArrayList pares = new ArrayList<>();
        for(int i=0; i<n; i++) {
            System.out.println("Número: ");
            int numeroAtual = teclado.nextInt();
            if(numeroAtual%2==0) {
                qtdPar++;
                pares.add(numeroAtual);
            }
        }
        System.out.println("Quatidade de pares: " + qtdPar);
        System.out.println("Números pares: " + pares);

    }

    public static void exercicioCinco() {
        /*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
        o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
        considerando a primeira posição como 0 (zero). */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantidade de números: ");
        int n = teclado.nextInt();
        double [] numeros = new double[n];
        double maior = 0;
        int posicao = 0;
        for(int i = 1; i <= n; i++) {
            System.out.println("Número: ");
            double numAtual = teclado.nextDouble();
            if(numAtual > maior) {
                maior = numAtual;
                posicao = i;
            }
        }
        System.out.println("Número maior: " + maior);
        System.out.println("Posição do número maior: " + posicao);

    }

    public static void exercicioSeis() {
        /*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
        terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
        o vetor C gerado*/
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantidade de números: ");
        int n = teclado.nextInt();
        double [] vetorUm = new double [n];
        double [] vetorDois = new double [n];
        double [] vetorTres = new double [n];
        System.out.println("Valores do vetor um: ");
        for (int i =0; i < n; i++) {
            System.out.println("Número: ");
            double numAtual = teclado.nextDouble();
            vetorUm[i] = numAtual;
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Número: ");
            double numAtual = teclado.nextDouble();
            vetorDois[i] = numAtual;
        }
        for(int i = 0; i < n; i++) {
            vetorTres[i] = vetorUm[i] + vetorDois[i];
        }
        System.out.println("Vetor um -> " + Arrays.toString(vetorUm));
        System.out.println("Vetor dois -> " + Arrays.toString(vetorDois));
        System.out.println("Soma dos vetores -> " + Arrays.toString(vetorTres));
    }

    public static void exercicioSete(){
        /*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
        mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
        os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de números: ");
        int n = sc.nextInt();
        double [] vetor = new double [n];
        ArrayList vetorAbaixo = new ArrayList<>();
        int soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Número: ");
            double numAtual = sc.nextDouble();
            vetor[i] = numAtual;
            soma += numAtual;
        }
        double media = (double) soma / n;
        for (int j = 0; j < n; j++) {
            if(vetor[j] < media) {
                vetorAbaixo.add(vetor[j]);
            }
        }
        System.out.printf("A média é %.3f", media);
        System.out.printf("Números abaixo da média: ", vetorAbaixo);

    }
}


