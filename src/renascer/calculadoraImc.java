package renascer;

import java.util.Scanner;

public class calculadoraImc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		Double peso = scanner.nextDouble();
		
		System.out.print("Digite seu altura: ");
		Double altura = scanner.nextDouble();
		
		Double imc = peso/(altura*altura);
		
		String classificacao;
		if (imc < 18.5) {
			classificacao = "Abaixo do peso ";
		} else if (imc < 24.9) {
			classificacao = ("Peso normal");
		} else if (imc < 29.9) {
			classificacao = ("Sobrepeso");
		} else if (imc < 34.9) {
			classificacao = ("Obesidade grau 1");
		} else if (imc <39.9) {
			classificacao = ("Obesidade grau 2");
		} else {
			classificacao = "Obesidade grau 3 (obesidade mórbida";
		}
		System.out.println("Seu IMC é " + String.format("%.2f", imc) + ", você estar classificado como: " +  classificacao );
	}

}
