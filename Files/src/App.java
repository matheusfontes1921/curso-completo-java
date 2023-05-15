import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<String> nomesPessoas = new ArrayList<>();
        System.out.println("Digite o caminho do arquivo: ");
        String strPath = teclado.nextLine();
        File path = new File(strPath);
        try(BufferedReader br = new BufferedReader(new FileReader (path))){
            String line = br.readLine();
            while (line != null) {
                line = br.readLine();
                nomesPessoas.add(line);
            }
            nomesPessoas.remove(null);
    }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        Collections.sort(nomesPessoas);
        for (String pessoa : nomesPessoas) {
            System.out.println(pessoa);
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
