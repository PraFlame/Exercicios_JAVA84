package estruturasRepeticao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Declarações de variáveis.
		Scanner leia = new Scanner(System.in);
		int a, b, contador;
		boolean verificador = false;
		final int multiplo = 15;
		
		// Entrada de dados.
		System.out.println("Informe o limite inferior e superior, respectivamente, do intervalo aberto a ser verificado.");
		a = leia.nextInt();
		b = leia.nextInt();
		
		// Processamento e saída.
        if(a < b) {
        	for (contador = a+1; contador < b; contador++) {
        		if(contador%multiplo == 0) {
        			System.out.println(contador+" é múltiplo de 5 e 3.");
        			contador = contador + multiplo - 1;
        			verificador = true;
        		}
        		
			}
        	if(verificador == false) {
    			System.out.println("O intervalo indicado não apresenta múltiplos de 3 e 5");
    		}
        }
		else {
			System.out.println("\nO intervalo informado não é válido. O limite superior sempre deve ser maior que o inferior. Execute e tente novamente.");
		}
        
	}

}
