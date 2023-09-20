package renascer;

import java.util.Scanner;

public class diaDaSemana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite n�mero de 1 a 7:");
		int numero = scanner.nextInt();
		
		String diaSemana = obterDiaSemana(numero);
		
		if(diaSemana!= null) {
			System.out.println("O dia da semana corresponde ao n�mero " + numero + " �:" + diaSemana);
		} else {
			System.out.println("N�mero inv�lido. Por favor, insira um n�mero de 1 a 7.");
		}
	}
	
	public static String obterDiaSemana(int numero) {
		switch (numero) {
		case 1:
			return "Segunda-feira";
		case 2:
			return "Ter�a-feira";
		case 3:
			return "Quarta-feira";
		case 4:
			return "Quinta-feira";
		case 5:
			return "Sexta-feira";
		case 6:
			return "Sabado";
		case 7:
			return "Domingo";
		default:
			return null;
		}
	}

}
