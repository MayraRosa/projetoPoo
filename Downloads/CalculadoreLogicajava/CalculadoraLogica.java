/*estrutura inicial da classe */
import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculadoraLogica {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        final double PRECO_POR_METRO = 53.39;

       /*entradas de dados */
        System.out.print("Digite o comprimento do baú (m): ");
        double comprimento = input.nextDouble();

        System.out.print("Digite a largura do baú (m): ");
        double largura = input.nextDouble();

        System.out.print("Digite a altura do baú (m): ");
        double altura = input.nextDouble();

        double volume = comprimento * largura * altura;

        double valorTotal = volume * PRECO_POR_METRO;



    }
}
