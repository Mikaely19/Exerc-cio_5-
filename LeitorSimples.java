import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorSimples {
    public static void main(String[] args) {
        try (BufferedReader buffer = new BufferedReader(new FileReader("frase.txt"))) {
            String linha;
            while ((linha = buffer.readLine()) != null) {
                System.out.println("Frase lida: " + linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo.");
            e.printStackTrace();
        }
    }
}
