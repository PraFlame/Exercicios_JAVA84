package exerciciosSwitchCase;

import java.util.Scanner;

public class Exercicios5 {
	public static void main(String[] args) {
		// Declarações de variáveis.
		Scanner leia = new Scanner(System.in);
		int opcao, quantidade;
		float valorTotal;
		
		// Entrada de dados.
		System.out.println ("Digite o número referente ao item do menu.");
		opcao = leia.nextInt();
		
		
		// Validação condicional e saída.
		switch (opcao) {
		case 1:
			System.out.println ("Você selecionou a opção \"Cachorro-quente\".Digite a quantidade desejada do item.");
			quantidade = leia.nextInt();
			valorTotal = quantidade*10;
			valorTotal = Math.round(valorTotal*100.00)/100.00f;
			System.out.println("Você realizou um pedido de Cachorro-quente. Quantidade: "+ quantidade+". O total a ser pago é R$"+ valorTotal);
			break;
		case 2:
			System.out.println ("Você selecionou a opção\"X-Salada\".Digite a quantidade desejada do item.");
			quantidade = leia.nextInt();
			valorTotal = quantidade*15;
			valorTotal = Math.round(valorTotal*100.0)/100.00f;
			System.out.println("Você realizou um pedido de X-Salada. Quantidade: "+ quantidade+". O total a ser pago é R$"+ valorTotal);
			break;
		case 3:
			System.out.println ("Você selecionou a opção \"X-Bacon\".Digite a quantidade desejada do item.");
			quantidade = leia.nextInt();
			valorTotal = quantidade*18;
			valorTotal = Math.round(valorTotal*100.0)/100.00f;
			System.out.println("Você realizou um pedido de X-Bacon. Quantidade: "+ quantidade+". O total a ser pago é R$"+ valorTotal);
			break;
		case 4:
			System.out.println ("Você selecionou a opção \"Bauru\".Digite a quantidade desejada do item.");
			quantidade = leia.nextInt();
			valorTotal = quantidade*12;
			valorTotal = Math.round(valorTotal*100.0)/100.00f;
			System.out.println("Você realizou um pedido de Bauru. Quantidade: "+ quantidade+". O total a ser pago é R$"+ valorTotal);
			break;
		case 5:
			System.out.println ("Você selecionou a opção \"Refrigerante\".Digite a quantidade desejada do item.");
			quantidade = leia.nextInt();
			valorTotal = quantidade*8;
			valorTotal = Math.round(valorTotal*100.0)/100.00f;
			System.out.println("Você realizou um pedido de Refrigerante. Quantidade: "+ quantidade+". O total a ser pago é R$"+ valorTotal);
			break;
		case 6:
			System.out.println ("Você selecionou a opção \"Suco de laranja\".Digite a quantidade desejada do item.");
			quantidade = leia.nextInt();
			valorTotal = quantidade*13;
			valorTotal = Math.round(valorTotal*100.0)/100.00f;
			System.out.println("Você realizou um pedido de Suco de laranja. Quantidade: "+ quantidade+". O total a ser pago é R$"+ valorTotal);
			break;
		default:
			System.out.println("Opção inválida. Execute novamente e insira opções de 1 a 6. :)");
		}
	}
}
