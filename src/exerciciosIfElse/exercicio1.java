package exerciciosIfElse;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// Declarações de variáveis.
		Scanner leia = new Scanner(System.in);
		int A, B, C;

		// Entrada de dados.
		System.out.println("Digite os número A, B e C respectivamente.");
		A = leia.nextInt();
		B = leia.nextInt();
		C = leia.nextInt();

		// Validação condicional e saída.
		if (A+B > C) {
			System.out.println("A soma de A + B é maior que C");
		} else if(A + B < C){
			System.out.println("A soma de A + B é menor que C");
		}else{
			System.out.println("A soma de A + B é igual a C");
		}

	}

}
