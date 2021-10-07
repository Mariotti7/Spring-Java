package application;

import java.util.Scanner;

public class ArrayExercicio2 {

	public static void main(String[] args) {
		/*
		 * Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela
		 * possui.
		 */

		Scanner sc = new Scanner(System.in); 
		int[][] matriz = new int[3][3];
		int maiorQueDez = 0, cont = 0;

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("Insira os números da matriz[%d][%d]: ", linha + 1, coluna + 1);
				matriz[linha][coluna] = sc.nextInt();
				if (matriz[linha][coluna] > 10) {
					cont++;
					maiorQueDez = cont;
				}
			}
		}
		System.out.println("\n Matriz ficou: \n");
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("\t %d \t", matriz[linha][coluna]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.printf("A matriz possui %d maiores que 10", maiorQueDez);

		sc.close();

	}

}
