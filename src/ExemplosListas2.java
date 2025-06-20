import java.util.ArrayList;
import java.util.Scanner;

public class ExemplosListas2 {
    ArrayList<Double> precos = new ArrayList<>();
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        cadastrarPreco(scan);


    }

    public static void cadastrarPreco(Scanner scan){

        try{
            System.out.println("Novo preço: R$");
            double preco = scan.nextDouble();
        }catch (Exception e){
            System.out.println("deu erro");
        }
    }
}
