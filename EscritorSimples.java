import java.io.FileWriter;
import java.io.IOException;
public class EscritorSimples {
 public static void main(String[] args) {
 try {
 FileWriter escritor = new FileWriter("frase.txt");
 escritor.write("Jesus é o caminho!");
 escritor.close();
 System.out.println("Frase concluida!");
 } catch (IOException e) {
 System.out.println("Erro.");
 e.printStackTrace();
 }
 }
}
