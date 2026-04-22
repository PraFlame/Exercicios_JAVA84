package exerciciosIfElse;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Declarações de variáveis.
		Scanner leia = new Scanner(System.in);
		int a;

		// Entrada de dados.
		System.out.println("Digite um número inteiro. Exemplo: -2, -1, 0, 1 ...");
		a = leia.nextInt();

		// Validação condicional e saída.
		if (a > 0) {
			if(a%2 == 0) {
				System.out.println("O número "+a+" é par e positivo.");
			}else {
				System.out.println("O número "+a+" é impar e positivo.");
			}
		}else if(a < 0) {
				if(a%2 == 0) {
					System.out.println("O número "+a+" é par e negativo.");
				}else {
					System.out.println("O número "+a+" é impar e negativo.");
				}
		}else {
				System.out.println("O número é 0, zero é par mas não é positivo ou negativo.");
		}
		
	}

}
