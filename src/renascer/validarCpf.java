package renascer;

import java.util.Scanner;

public class validarCpf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero de CPF (apenas números): ");
		String cpf = scanner.nextLine().trim().replace(".", "").replace("-", "");
		
		if (validarCPF(cpf)) {
			System.out.println("CPF válido!");
		} else {
			System.out.println("CPF inválido!");
		}
		
		scanner .close();
	}
	
	public static boolean validarCPF(String cpf) {
		if (cpf == null || cpf.length() !=11 || !cpf.matches("\\d{11}")) {
			return false;
		}
		
		int[] numeros = new int [11];
		for (int i = 0; i< 11; i++) {
			numeros[i] = Integer.parseInt(cpf.substring(i, i + 1));
		}
		
		if (todosDigitosIguais(numeros)) {
			return false;
		}
		
		int soma1 = 0;
		for (int i = 0; i < 9; i++) {
			soma1 += numeros[i] *(10 - i);
		}
		
		int digitoVerificador1 = soma1 % 11;
		digitoVerificador1 = (digitoVerificador1 <2) ? 0 :(11 - digitoVerificador1);
		
		if (digitoVerificador1 != numeros[9]) {
			return false;
		}
		
		int soma2 = 0;
		for (int i = 0; i < 10; i++) {
			soma2+= numeros[i] * (11 - i);
		}
		
		int digitoVerificador2 = soma2 % 11;
		digitoVerificador2 = (digitoVerificador2 < 2) ? 0 :(11 - digitoVerificador2);
		
		return digitoVerificador2 == numeros[10];
	}
		
	public static boolean todosDigitosIguais(int[] numeros) {
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] != numeros[i - 1]) {
				return false;
			}
		}
		return true;
	}
	
}
