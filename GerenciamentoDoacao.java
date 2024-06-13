import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoDoacao {

    public static void main(String[] args) {
       
        ArrayList<Doacao> doacoes = new ArrayList<>();

        
        try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
			  
			    System.out.print("Tipo de doação (dinheiro, alimentos, roupas, etc.): ");
			    String tipoDoacao = scanner.nextLine();

			    System.out.print("Quantidade: ");
			    int quantidade = scanner.nextInt();
			    scanner.nextLine();

			    System.out.print("Data (dd/mm/aaaa): ");
			    String data = scanner.nextLine();

			  
			    doacoes.add(new Doacao(tipoDoacao, quantidade, data));

			  
			    System.out.print("Deseja continuar (s/n)? ");
			    String continuar = scanner.nextLine();
			    if (continuar.equalsIgnoreCase("n")) {
			        break;
			    }
			}
		}
        try {
      
            File arquivo = new File("doacoes.txt");
            FileWriter escritor = new FileWriter(arquivo);

            for (Doacao doacao : doacoes) {
                escritor.write(doacao.getTipoDoacao() + "," + doacao.getQuantidade() + "," + doacao.getData() + "\n");
            }

            escritor.close();
        }
        
        catch (IOException e) {            
        }
    }
}
