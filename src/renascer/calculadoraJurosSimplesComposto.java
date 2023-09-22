package renascer;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class calculadoraJurosSimplesComposto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite o valor principal: ");
        System.out.print("Colocar .e , obrigado");
        double principal = lerNumero(scanner);

        System.out.print("Digite a taxa de juros (em decimal): ");
        double taxaDeJuros = lerNumero(scanner);

        System.out.print("Digite o tempo em anos: ");
        int tempoEmAnos = scanner.nextInt();

       
        System.out.print("Escolha o tipo de juros (1 para simples, 2 para compostos): ");
        int escolha = scanner.nextInt();

        
        double juros;
        if (escolha == 1) {
            
            juros = calcularJurosSimples(principal, taxaDeJuros, tempoEmAnos);
        } else if (escolha == 2) {
           
            juros = calcularJurosCompostos(principal, taxaDeJuros, tempoEmAnos);
        } else {
            System.out.println("Escolha inválida. Encerrando o programa.");
            return;
        }

       
        System.out.printf("O valor dos juros é: %.2f\n", juros);
    }

    private static double lerNumero(Scanner scanner) {
       
        NumberFormat format = NumberFormat.getInstance(Locale.US);
        double numero = 0;

        while (true) {
            try {
                numero = format.parse(scanner.next()).doubleValue();
                break;
            } catch (ParseException e) {
                System.out.println("Entrada inválida. Digite novamente: ");
                scanner.nextLine(); 
            }
        }

        return numero;
    }

    private static double calcularJurosSimples(double principal, double taxaDeJuros, int tempoEmAnos) {
        return principal * taxaDeJuros * tempoEmAnos ;
    }

    private static double calcularJurosCompostos(double principal, double taxaDeJuros, int tempoEmAnos) {
        return principal * (Math.pow(1 + taxaDeJuros, tempoEmAnos) - 1) / 100;
    }
}