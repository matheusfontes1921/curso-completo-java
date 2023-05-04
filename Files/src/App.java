import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o caminho do arquivo: ");
        String strPath = teclado.nextLine();
        File path = new File(strPath);
        try(BufferedReader br = new BufferedReader(new FileReader (path))){
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
    }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
}

public static void leituraDePastasECriacaoDeArquivos(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Entre com o caminho: ");
    String caminhoPasta = teclado.nextLine();
    File caminho = new File(caminhoPasta);
    File[] pastas = caminho.listFiles(File::isDirectory);
    for(File arquivos : pastas) {
        System.out.println(arquivos);
    }
    boolean success = new File(caminhoPasta + "\\Campeonato Brasileio").mkdir();
    System.out.println("Criado: " + success);

    teclado.close();
}
}
