package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Criando a a Collection ArrayList e variáveis
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		String name;
		
		//Entrada de Cores
		System.out.println("Digite o nome de 5 cores:\n");
		
		for(byte contador = 0; contador <5 ; contador ++) {
			name = leia.nextLine();
			cores.add(name);
		}
		
		//Saída das cores
		System.out.println("As cores informadas foram:\n");
		Iterator<String> iCores = cores.iterator();
		while(iCores.hasNext()) {
			System.out.println(iCores.next());
		}
		
		//Ordenamento
		Collections.sort(cores, String.CASE_INSENSITIVE_ORDER);
		iCores = cores.iterator();
		System.out.println("\nAgora em ordem crescente:\n");
		while(iCores.hasNext()) {
			System.out.println(iCores.next());
		}

	}

}
