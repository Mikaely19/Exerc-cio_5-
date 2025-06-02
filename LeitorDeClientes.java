import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDeClientes {
    public static void main(String[] args) {
        String caminhoArquivo = "clientes.txt"; // Substitua pelo caminho do seu arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                // Aqui você pode processar cada linha, por exemplo, dividir os dados do cliente
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
