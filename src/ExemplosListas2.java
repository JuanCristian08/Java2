import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

    public class ExemplosListas2 {
    static ArrayList<Double> precos =  new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("N-Novo preço\nV-Ver Preços\nR-Remover\nA-Atualizar\n0-Sair\nOpção: ");
            String menu = scan.next().toLowerCase();
            if (menu.equals("0")) break;
            System.out.println();
            switch(menu){
                case "n": cadastrarPreco(scan);
                    break;

                case "v": mostrarPrecos();
                    break;

                case "r":removerPreco(scan);
                    break;

                case "a":atualizarPreco(scan);
                    break;

                default:
                    System.out.println("Entrada inválida");
                    break;
            }
            System.out.println();
        }


    }

    public static void cadastrarPreco(Scanner scan){
        try {
            System.out.print("Novo preço: R$");
            double preco = scan.nextDouble();

            if (preco < 0) System.out.println("O Preço nao pode ser negativo!");
            else precos.add(preco);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida!");
        }
    }
    public static void mostrarPrecos(){
        System.out.println("\n****** PREÇOS ******\n");
        for (Double preco : precos) {
            System.out.println(precos.indexOf(preco)+" -  R$"+preco);
        }
        System.out.println();
    }
    public static void removerPreco(Scanner scan){
        try{
            mostrarPrecos();
            System.out.println("Digite o indice do preço: ");
            int i = scan.nextInt();

            System.out.println("Deseja remover o preço R$ "+precos.get(i)+" ?");
            System.out.println("1-Sim 2-Não");
            int menu= scan.nextInt();
            if(menu == 1){
                System.out.println("Removido com sucesso!");
                precos.remove(i);
            }else if(menu == 2){
                System.out.println("voltando para o menu...");
            }else{
                throw new InputMismatchException();
            }

        }catch (InputMismatchException e){
            System.out.println("Valor inválido!");

        }catch (IndexOutOfBoundsException e){
            System.out.println("Digite um indice válido!");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static void atualizarPreco(Scanner scan){
        try {
            mostrarPrecos();
            System.out.println("Digite o indice do preço: ");
            int i = scan.nextInt();

            System.out.println("Deseja atualizar o preço R$ "+precos.get(i)+" ?");
            System.out.println("1-Sim 2-Não");
            int menu =scan.nextInt();
            if(menu == 1){
                System.out.println("Digite o valor do novo preço: ");
                System.out.print("R$ ");
                double preco = scan.nextInt();
                precos.set(i, preco);

                System.out.println("Atualizado com sucesso!");
            }else if(menu == 2){
                System.out.println("Voltando para o menu...");
            }else{
                throw new InputMismatchException();
            }

        }   catch (InputMismatchException e){
            System.out.println("Valor inválido!");

        }catch (IndexOutOfBoundsException e){
            System.out.println("Digite um indice válido!");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
