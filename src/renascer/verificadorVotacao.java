package renascer;

import java.util.Scanner;
public class verificadorVotacao {

	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a sua idade: ");
	        int idade = scanner.nextInt();

	        if (idade >= 16) {
	            System.out.println("Voc� pode votar nas elei��es.");
	        } else {
	            System.out.println("Voc� ainda n�o pode votar nas elei��es.");
	        }
	    
	    }

}
