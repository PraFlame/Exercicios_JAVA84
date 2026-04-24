package vetores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Declaração de variáveis
		byte vetorNumeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 }, posicao = 0;
		int numero;
		boolean encontrei = false;
		Scanner leia = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Digite o número que deseja encontrar\n");
		numero = leia.nextInt();

		for (byte indice = 0; indice < 10; indice++) {
			if (vetorNumeros[indice] == numero) {
				encontrei = true;
				posicao = indice;
			}
		}
		if (encontrei) {
			System.out.println("\nO Número " + numero + " está na posição: " + posicao);

		} else {
			System.out.println("\nO Número " + numero + " não foi encontrado!!!");
		}

	}

}
