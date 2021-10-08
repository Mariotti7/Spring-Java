package application;

import java.util.Scanner;

import entities.Animal;

public class MundoAnimal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Animal animal = new Animal();
		
		int opcao;
		String som, acao, nome;
		
		System.out.println("===== Bem Vindo ao Mundo Animal ===== ");
		
		for(int i = 0 ; i < 2 ; i++) {
			System.out.print("\nEscolha 1-Cachorro | 2-Cavalo | 3-Preguiça: ");
			opcao = sc.nextInt();
			
			if(opcao == 1) {
				System.out.print("Escolha o nome do cachorro: ");
				nome = sc.next();
				System.out.printf("O nome do cachorro é %s%n",nome);
				System.out.printf("Qual som o %s faz? ",nome);
				som = sc.next();
				System.out.println();
				System.out.print(animal.fazBarulho(som));
				System.out.println();
				System.out.printf("A habilidade do %s é ", nome);
				acao = sc.next();
				System.out.println(animal.habilidade(acao));
				System.out.println(" =========================== ");
			}else if(opcao == 2) {
				System.out.print("Escolha o nome do cavalo: ");
				nome = sc.next();
				System.out.printf("O nome do cavalo é %s%n",nome);
				System.out.printf("Qual som o %s faz? ",nome);
				som = sc.next();
				System.out.println();
				System.out.print(animal.fazBarulho(som));
				System.out.println();
				System.out.printf("A habilidade do %s é ", nome);
				acao = sc.next();
				System.out.println(animal.habilidade(acao));
				System.out.println(" =========================== ");
			}else {
				System.out.print("Escolha o nome da preguiça: ");
				nome = sc.next();
				System.out.printf("O nome da preguiça é %s%n",nome);
				System.out.printf("Qual som o %s faz? ",nome);
				som = sc.next();
				System.out.println();
				System.out.print(animal.fazBarulho(som));
				System.out.println();
				System.out.printf("A habilidade do %s é ", nome);
				acao = sc.next();
				System.out.println(animal.habilidade(acao));
				System.out.println(" =========================== ");
			}
		}
		
		System.out.println(" ===== OBRIGADO POR TER NOS VISITADO ===== ");
		
		
		sc.close();

	}

}
