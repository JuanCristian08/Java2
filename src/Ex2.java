import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nomes = new String[10];

        // Lê os 10 nomes
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scan.nextLine();
        }

        // Pede o nome para buscar
        System.out.print("\nDigite um nome para buscar: ");
        String nomeBusca = scan.nextLine();

        // Verifica se está na lista e quantas vezes aparece
        int contador = 0;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                contador++;
            }
        }

        // Mostra o resultado
        if (contador > 0) {
            System.out.println("ACHEI! O nome aparece " + contador + " vez(es).");
        } else {
            System.out.println("NÃO ACHEI.");
        }
    }
}
