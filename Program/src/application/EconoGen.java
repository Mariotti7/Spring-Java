package application;

import java.util.Scanner;

import entities.Blueprint;
import entities.Fundos;
import entities.Usuario;

public class EconoGen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Usuario user = new Usuario();
		
		Blueprint plan = new Blueprint();
		
		Fundos fund = new Fundos();
		
		int opcao, objetivo, idade, perfil;
		String nome;
		Double renda;
		
		System.out.println(" ====== Seja Bem Vindo ao EconoGen ====== ");
		System.out.println("\nCom os seus OBJETIVOS você faz seus sonhos acontecerem.");
		System.out.println("É só dizer qual o seu SONHO e o VALOR que a gente calcula um prazo e diz o quanto da para guardar por mês.");
		
		System.out.println("Deseja iniciar? 1-SIM | 2-NÃO ");
		opcao = sc.nextInt();
		while(opcao == 1) {
			System.out.print("Digite seu nome: ");
			nome = sc.next();
			System.out.printf("Olá, %s! Vamos começar?%n",nome);
			System.out.print("Qual sua idade? ");
			idade = sc.nextInt();
			if(idade >= 18) {
				System.out.print("Qual sua renda atual em reais: ");
				renda = sc.nextDouble();
			System.out.print("Você prefere: 1- Muito Risco e Pouco Ego | 2- Equilibrar Perdas e Ganhos | 3- Perder Pouco e Ganhar Igual ? ");
			perfil = sc.nextInt();
				if(perfil == 1) {
					System.out.println("Qual seu sonho? 1-CASA PRÓPRIA | 2-CARRO NOVO | 3-VIAGEM DOS SONHOS | 4-APOSENTADORIA : ");
					objetivo = sc.nextInt();
					fund.plano(objetivo);
						if(objetivo == 1) {
							System.out.println(fund.plano(objetivo));
						}
				}
				//opcao++;
			}
		}
		
		
		sc.close();

	}

}
