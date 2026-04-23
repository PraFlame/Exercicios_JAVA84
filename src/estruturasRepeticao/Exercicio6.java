package estruturasRepeticao;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		// Declarações de variáveis.
		Scanner leia = new Scanner(System.in);
		int numero, contador = 0, somaMultiplos = 0;
		float  media;
		final int multiplo = 3;	
		
		// Chamada à entrada.
		System.out.println("Informe a sequência de números inteiros a ser verificada.");
				
		// Do
		do {
			// Entrada de dados.
			numero = leia.nextInt();
			if(numero%multiplo == 0) {
    			contador++; //Contador da média
    			somaMultiplos = somaMultiplos + numero;
    		}	
		}while(numero != 0);
		contador--;
		media = Float.valueOf(somaMultiplos)/contador;
		//Saída de dados
		if(contador !=0) {
			System.out.println("\nA média de todos os números múltiplos de 3 é "+media+".");
		}
		else {
			System.out.println("\nA média de todos os números múltiplos de 3 é 0.");
		}
	}
}
