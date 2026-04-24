package vetores;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		// Declaração de variáveis
		final int dim = 10;
		int soma = 0, vetorNumeros[] = new int[dim];
		float media;
		Scanner leia = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Digite os 10 números inteiros do vetor:\n");
		for(byte indice = 0; indice < dim; indice++) {
			vetorNumeros[indice] = leia.nextInt();
			soma = soma + vetorNumeros[indice];
		}

		//Processamento da média.
		media = Float.valueOf(soma)/dim;
		
		//Saída de dados
		//Elementos em índices ímpares
		System.out.println("\nElementos em índices ímpares:\n");
		for (byte indice = 1; indice < dim; indice = (byte)(indice + 2)) {
			System.out.print(vetorNumeros[indice]+" ");
		}
		
		//Elementos pares do vetor
		System.out.println("\nElementos em pares:\n");
		for (byte indice = 0; indice < 10; indice++) {
			if (vetorNumeros[indice]%2 == 0) {
				System.out.print(vetorNumeros[indice]+" ");
			}
		}
		System.out.println("\nA soma total dos fornecidos valores é :"+soma);
		System.out.println("\nA media dos valores fornecidos é :"+media);

	}

}
