package estruturasDados;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		byte opcao;
		String nome;
		Deque<String> pilha = new ArrayDeque<String>();
		Scanner leia = new Scanner(System.in);
						
		do {
			// Menu
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar livro na pilha             ");
			System.out.println("            2 - Listar todas os livro                ");
			System.out.println("            3 - Retirar livro da pilha               ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			opcao = leia.nextByte();
			//Processamento do menu
			switch (opcao) {
			case 1:
				System.out.println("\nDigite o nome a ser adicionado na pilha: ");
				nome = leia.next();
				pilha.push(nome);
				System.out.println ("\nPilha:\n" + pilha);
				System.out.print("\nLivro adicionado!\n");
				break;
			case 2:
				if(pilha.isEmpty()) {
					System.out.print("\nA pilha está vazia!\n");
				}
				else {
					System.out.println ("\nLista de livros na pilha:\n" + pilha);
				}
				break;
			case 3:
				if(pilha.isEmpty()) {
					System.out.print("\nA pilha está vazia!\n");
				}
				else {
					pilha.pop();
					System.out.println ("\nLista de livros na pilha:\n" + pilha);
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
