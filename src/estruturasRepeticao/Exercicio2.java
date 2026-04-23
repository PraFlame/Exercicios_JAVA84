package estruturasRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Declarações de variáveis.
		Scanner leia = new Scanner(System.in);
		int numero, a, b, contador;
				
		// Entrada de dados.
		a = b = 0;
		System.out.println("Informe a sequência de números a ser verificada. A sequência deve conter 10 números inteiros.");
				
		// Processamento de entradas.
		for (contador = 0; contador < 10; contador++) {
			numero = leia.nextInt();
			if(numero%2 == 0) {
    			a++; //Contagem de números pares.
    		}else {
    			b++; //Contagem de números ímpares.
    		}
    		
		}
		//Saída de dados
		System.out.println("\nO total de números pares é "+a+".\nO total de números ímpares é "+b+".");
	}

}
