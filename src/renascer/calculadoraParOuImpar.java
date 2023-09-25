package renascer;

import java.util.Scanner;

public class calculadoraParOuImpar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma lista de n�meros separados por v�rgulas;  ");
		String entrada = scanner.nextLine().trim();
		
		String[] numeros = entrada.split(",");
		System.out.println("Resultado: ");

	    for (String numeroStr : numeros) {
	    	try {
				int numero = Integer.parseInt(numeroStr.trim());
				
				if (numero % 2 == 0) {
					System.out.println(numero + " � par. ");
				} else {
					System.out.println(numero + "� impar. ");
				}
			} catch (NumberFormatException e ) {
				System.out.println(numeroStr + " n�o � um n�mero v�lido.");
			}
	    }
	    
	    scanner.close();
	}
}
