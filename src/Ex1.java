import java.util.ArrayList;
import java.util.Scanner;

    class CadastroDeNotas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Sistema de Cadastro de Notas");
        System.out.println("Digite as notas. Para sair, digite um número negativo.");

        while (true) {
            System.out.print("Digite a nota: ");
            double nota = scan.nextDouble();

            if (nota < 0) {
                break;
            }

            if (nota > 10) {
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
                continue;
            }
            notas.add(nota);
        }

        if (notas.isEmpty()) {
            System.out.println("Nenhuma nota foi cadastrada.");
        } else {
            double soma = 0;
            System.out.println("\nNotas cadastradas:");
            for (double nota : notas) {
                System.out.println(nota);
                soma += nota;
            }

            double media = soma / notas.size();
            System.out.printf("Média das notas: %.2f\n", media);
        }

        scan.close();
    }
}
