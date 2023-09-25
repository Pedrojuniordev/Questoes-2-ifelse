package renascer;

import java.util.Scanner;

public class verificaodorSenha {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua senha: ");
		String senha = scanner.nextLine().trim();
		
		if (verificarSenha(senha)) {
			System.out.println("Senha segura! Parabéns. ");
		} else {
			System.out.println("Senha não atende aos critérios de segurança mínimos");
		}
		
		scanner.close();
	}
	
	public static boolean verificarSenha(String senha) {
		if (senha.length() < 8) {
			return false;
		}
		boolean temMaiuscula = false;
		boolean temMinuscula = false;
		boolean temNumero = false;
		boolean temCaracterEspecial = false;
		
		for (char caractere : senha.toCharArray()) {
			if (Character.isUpperCase(caractere)) {
				temMaiuscula = true;
			} else if (Character.isLowerCase(caractere)) {
				temMinuscula = true;
			} else if (Character.isDigit(caractere)) {
				temNumero = true;
			} else {
				temCaracterEspecial = true;
			}
		}
		
		return temMaiuscula && temMinuscula && temNumero && temCaracterEspecial;
	}
}
