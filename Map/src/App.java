import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strPath = "C:\\Users\\Matheus\\Desktop\\PUC 2023.1\\in.txt";
        File path = new File(strPath);
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Map<String, Integer> eleicoes = new HashMap<>();
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String nome = fields[0];
                int votos = Integer.parseInt(fields[1]);
                if (eleicoes.containsKey(nome)) {
                    int votesSoFar = eleicoes.get(nome);
                    eleicoes.put(nome, votos + votesSoFar);
                }
                else {
                    eleicoes.put(nome, votos);
                }
                line = br.readLine();
            }
            for (String key : eleicoes.keySet()) {
                System.out.println(key + ": " + eleicoes.get(key));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
