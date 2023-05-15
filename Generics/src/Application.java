import java.io.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o caminnho do arquivo: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);
        try (BufferedReader br = new BufferedReader(new FileReader((path))) {
            String pessoa = br.readLine();
            while()
        }


        }
}
