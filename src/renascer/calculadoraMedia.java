package renascer;

import java.util.Scanner;

public class calculadoraMedia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite primeira nota: ");
		Double nota1 = scanner.nextDouble();
		
		System.out.println("Digite segunda nota: ");
		Double nota2 = scanner.nextDouble();
		
		System.out.println("Digite terceira nota: ");
		Double nota3 = scanner.nextDouble();
		
		Double media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("A media das notas é: "+ media);
		
		if (media >= 7.0) {
			System.out.println("aluno aprovado!");
		} else {
			System.out.println("Aluno reprovado!");
		}
	}
}
