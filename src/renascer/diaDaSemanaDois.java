package renascer;

import java.util.Scanner;

public class diaDaSemanaDois {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número de 1 a 7: ");
		int numeroDia = scanner.nextInt();
		
		String nomeDia;
		
		switch (numeroDia) {
			case 1:
				nomeDia = "Domingo";
				break;
			case 2:
				nomeDia = "Segunda";
				break;
			case 3:
				nomeDia = "Terça";
				break;
			case 4:
				nomeDia = "Quarta";
				break;
			case 5:
				nomeDia = "Quinta";
				break;
			case 6:
				nomeDia = "Sexta";
				break;
			case 7:
				nomeDia = "Sabado";
				break;
			default:
                nomeDia = "Dia inválido";
                break;
		}   
         System.out.println("O dia correspondente é: " + nomeDia);       
	}
}
