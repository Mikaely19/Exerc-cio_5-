import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de clientes
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("João", 30));
        clientes.add(new Cliente("Maria", 25));
        clientes.add(new Cliente("Pedro", 40));

        // Salvando a lista em um arquivo texto
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("clientes.txt"))) {
            for (Cliente c : clientes) {
                writer.write(c.toString());
                writer.newLine(); // pula uma linha para cada cliente
            }
            System.out.println("Clientes salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar o arquivo: " + e.getMessage());
        }
    }
}
