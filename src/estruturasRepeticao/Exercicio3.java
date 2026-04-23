package estruturasRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Declarações de variáveis.
		Scanner leia = new Scanner(System.in);
		int idade, a, b;
		
		//Entrada automática
		idade = a = b = 0;
		while(idade > -1 ) {
			System.out.println("Por favor, informe a idade de uma pessoa.");
			idade = leia.nextInt();
			//Processamento.
			if(idade > 50) {
				a++;
			}
			else if(idade>-1 && idade < 21){
				b++;
			}
		}
		//Saída de dados.
		System.out.println("\nO total de pessoas com mais de 50 anos é "+a+".\nO total de pessoas com menos de 21 anos é "+b+".");
		
	}

}
