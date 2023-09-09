package renascer;

import java.util.Scanner;

public class mediaPonderada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int peso1 = 1;
		int peso2 = 2;
		int peso3 = 3;
		int nota1, nota2, nota3, medponderada;
		
		System.out.println("Digite Nota 1:" );
		nota1 = scanner.nextInt();
		System.out.println("Digite Nota 2:" );
		nota2 = scanner.nextInt();
		System.out.println("Digite Nota 3:" );
		nota3 = scanner.nextInt();
		
		medponderada = ((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/(peso1+peso2+peso3);
		
		System.out.printf("A média pondera é:  %.3f" + medponderada);
		
	}
	

}
