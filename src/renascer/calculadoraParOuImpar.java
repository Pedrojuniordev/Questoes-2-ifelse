package renascer;

import java.util.Scanner;

public class calculadoraParOuImpar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma lista de números separados por vírgulas;  ");
		String entrada = scanner.nextLine().trim();
		
		String[] numeros = entrada.split(",");
		System.out.println("Resultado: ");

	    for (String numeroStr : numeros) {
	    	try {
				int numero = Integer.parseInt(numeroStr.trim());
				
				if (numero % 2 == 0) {
					System.out.println(numero + " é par. ");
				} else {
					System.out.println(numero + "é impar. ");
				}
			} catch (NumberFormatException e ) {
				System.out.println(numeroStr + " não é um número válido.");
			}
	    }
	    
	    scanner.close();
	}
}
