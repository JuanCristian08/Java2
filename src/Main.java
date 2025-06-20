import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //exemplo02(scan);
        desafios01(scan);

        System.out.println("Digite Noite, Dia, Tarde.");
        String palavra = scan.next();
        String mensagem = switch (palavra) {
            case "Dia" -> "Bom dia";
            case "noite" -> "Boa noite";
            default -> "oi";
        };
    }

    public static int calculos(int a, int b, String operacao){
        return switch(operacao){
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
    }

    public static void desafios01(Scanner scan) {
        ArrayList<Double> notas = new ArrayList<>();

        while (true) {
            System.out.println("Digite sua nota. 0-Sair");
            double nota = scan.nextDouble();

            if (nota == 0) break;

            notas.add(nota);
        }

        System.out.println("\nLista de Notas:\n");
        double soma = 0;
        for (Double nota : notas) {
            System.out.println(nota);
            soma += nota;
        }

        double media = soma / notas.size();
        System.out.println("A media é: " +media);


        // Chamada do método desafio01
        desafios01(scan);

        scan.close();
    }
    public static void exemplo02(Scanner scan) {
        ArrayList<String> frutas = new ArrayList<>();

        while (true) {
            System.out.println("Digite o nome da fruta. 0-Sair");
            String fruta = scan.next();

            if (fruta.equals("0")) break;

            frutas.add(fruta);
        }

        System.out.println("\nLista de frutas:\n");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }


        // Chamada do método exemplo1
        exemplo1(scan);

        scan.close();
    }

    // Método deve estar fora do main, com parâmetros corretos
    public static void exemplo1(Scanner scan) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Pedro");
        nomes.add("Juan");
        nomes.add("Maria");
        nomes.add("Julia");
        nomes.add(1, "João");

        // Apenas chamadas que retornam algo devem ser usadas, se necessário
        boolean estaVazio = nomes.isEmpty();
        int tamanho = nomes.size();

        System.out.println("\nLista de nomes:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("\nEstá vazia? " + estaVazio);
        System.out.println("Tamanho da lista: " + tamanho);
    }
}
