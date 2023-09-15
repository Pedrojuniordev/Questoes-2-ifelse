package renascer;

import java.util.Scanner;
public class verificadorVotacao {

	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a sua idade: ");
	        int idade = scanner.nextInt();

	        if (idade >= 16) {
	            System.out.println("Você pode votar nas eleições.");
	        } else {
	            System.out.println("Você ainda não pode votar nas eleições.");
	        }
	    
	    }

}
