package renascer;

import java.util.Scanner;

public class classificaçãoNotas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma nota entre 0 a 100");
		int nota = scanner.nextInt();
		
		String classificacao = classificarNota(nota);
		
		if (classificacao !=null) {
			System.out.println("Classificação" + classificacao);
		} else {
			System.out.println("Nota inválida. Por favor, insira uma nota 0 a 100.");
		}
	}

	
	public static String classificarNota(int nota) {
		if (nota >= 0 && nota <= 100) {
			if (nota >= 60) {
				return "Aprovado";
			} else if (nota >= 40) {
				return "Recupera";
			}else {
				return "Reprovado";
			}
		}else {
			return null;
		}
	}
}
