package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {

	public static void main(String[] args) {
		// Criando a a Collection ArrayList e variáveis
		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		int numeroEncontrado;
				
		//Entrada de números
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		//Entrada de dados.
		System.out.println("Digite o número que deseja verificar se está no set:\n");
		numeroEncontrado = leia.nextInt();
		
		
		//Saída das dados
		if(numeros.contains(numeroEncontrado)) {
			System.out.println("\nO número "+numeroEncontrado+" foi encontrado!!!");
		}
		else {
			System.out.println("\nO número "+numeroEncontrado+" não foi encontrado!!!");
		}

	}

}
