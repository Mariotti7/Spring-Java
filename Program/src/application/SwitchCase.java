package application;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		// Condicionais
		
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		// if-else
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		/*if(idade < 16 ) {
			System.out.println("Não pode votar");
		}else if( idade >=16 && idade < 18) {
			System.out.println("Voto opcional");
		}else {
			System.out.println("Vote consciente");
		}
		
		// ternário
		
		String maioridade = idade >= 18 ? "Maior de idade" : "Menor de idade";
		System.out.println(maioridade);
		*/
		
		// switch case
		
		switch (idade) {
		case 18:
			System.out.println("maior");
			break;
		case 17:
			System.out.println("opcional");
			break;
		case 16:
			System.out.println("opcional");
			break;
		case 15:
			System.out.println("menor");
		default:
			break;
		}
		
		sc.close();

	}

}
