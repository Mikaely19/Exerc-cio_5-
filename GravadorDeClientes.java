import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GravadorDeClientes {

    private String nomeArquivo;

    public GravadorDeClientes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void gravarCliente(String nome, String email) {
        try (FileWriter fw = new FileWriter(nomeArquivo, true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(nome + "," + email);
            System.out.println("Cliente gravado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao gravar o cliente: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        GravadorDeClientes gravador = new GravadorDeClientes("clientes.txt");
        gravador.gravarCliente("João Silva", "joao.silva@email.com");
        gravador.gravarCliente("Maria Oliveira", "maria.oliveira@email.com");
    }
}
