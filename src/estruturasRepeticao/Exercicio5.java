package estruturasRepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Declarações de variáveis.
		Scanner leia = new Scanner(System.in);
		int numero, soma=0;
		
		//Entrada automática
		System.out.println("Por favor, informe os números inteiros que deseja somar.");
		do {
			numero = leia.nextInt();
			soma = soma + numero;
		}while(numero != 0);
		//Saída de dados.
		System.out.println("\nA soma total é: "+soma);
		
	}
	
}
