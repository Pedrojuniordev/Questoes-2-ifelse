package renascer;

import java.util.Scanner;

public class calculadoraImpostoDeRenda {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu Salário anual");
		double salarioAnual = scanner.nextDouble();
		
		double[] faixa = {10000, 20000, 30000, 40000, 50000 };
		double[] taxas = {0.10, 0.15, 0.20, 0.25, 0.30, 0.35 }; 
		
		double impostoDeRenda = 0.0;
		double rendaRestante = salarioAnual;
		
		for(int i = 0; i < faixas.length; i++) {
			if (rendaRestante <= 0) {
				break;
			}
			
			double faixa = faixas[i];
			double taxa = i <taxas.length ? taxas[i] : taxas[taxas.length];
			
			if (rendaRestante <=faixa) {
				impostoDeRenda +=rendaRestante * taxa;
				break;
			} else {
				impostoDeRenda += faixa * taxa;
				rendaRestante -= faixa;
			}
		}
		
		System.out.println("O imposto de renda devido é: "+ impostoDeRenda);
	}
}
