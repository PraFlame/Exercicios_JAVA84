package estruturasDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		byte opcao;
		String nome;
		Queue<String> filaBanco = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
						
		do {
			// Menu
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar cliente na fila            ");
			System.out.println("            2 - Listar todas os Clientes             ");
			System.out.println("            3 - Retirar cliente da fila              ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			opcao = leia.nextByte();
			//Processamento do menu
			switch (opcao) {
			case 1:
				System.out.println("\nDigite o nome a ser adicionado na fila: ");
				nome = leia.next();
				filaBanco.add(nome);
				System.out.println ("\nFila:\n" + filaBanco);
				System.out.print("\nCliente adicionado!\n");
				break;
			case 2:
				if(filaBanco.isEmpty()) {
					System.out.print("\nA fila está vazia!\n");
				}
				else {
					System.out.println ("Lista de clientes na fila:\n" + filaBanco);
				}
				break;
			case 3:
				if(filaBanco.isEmpty()) {
					System.out.print("\nA fila está vazia!\n");
				}
				else {
					filaBanco.remove();
					System.out.println ("Lista de clientes na fila:\n" + filaBanco);
				}
				break;
			case 0:
				break;
			default:
				System.out.println("\n Opção inválida. Tente novamente.\n");
			}
		}while(opcao != 0);
		System.out.println("\nPrograma finalizado!");	
	}
}
