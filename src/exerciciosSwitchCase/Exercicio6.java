package exerciciosSwitchCase;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		// Declarações de variáveis.
		Scanner leia = new Scanner(System.in);
		String nomeColaborador;
		int opcao;
		float salario, salarioReajuste;
		final float GERENTE = 0.1f, VENDEDOR = 0.07f, SUPERVISOR = 0.09f, MOTORISTA = 0.06f, ESTOQUISTA = 0.05f, TECNICOTI = 0.08f;
		
		// Entrada de dados.
		System.out.println ("Olá, tudo bem? Digite o nome do colaborador:");
		nomeColaborador = leia.nextLine();
		System.out.println ("Digite a opção referente ao cargo do colaborador. Consulte a tabela.");
		opcao = leia.nextInt();
		
		
		// Validação condicional e saída.
		switch (opcao) {
		case 1:
			System.out.println ("Digite o salário atual de "+nomeColaborador+".");
			salario = leia.nextFloat();
			salarioReajuste = (GERENTE*salario) + salario;
			salarioReajuste = Math.round(salarioReajuste*100.00)/100.00f;
			System.out.printf(nomeColaborador+" ocupa do cargo de gerente. Seu salário após o resjuste é R$ %.2f", salarioReajuste);
			break;
		case 2:
			System.out.println ("Digite o salário atual de "+nomeColaborador+".");
			salario = leia.nextFloat();
			salarioReajuste = (VENDEDOR*salario) + salario;
			salarioReajuste = Math.round(salarioReajuste*100.00)/100.00f;
			System.out.printf(nomeColaborador+" ocupa do cargo de vendedor. Seu salário após o resjuste é R$ %.2f", salarioReajuste);
			break;
		case 3:
			System.out.println ("Digite o salário atual de "+nomeColaborador+".");
			salario = leia.nextFloat();
			salarioReajuste = (SUPERVISOR*salario) + salario;
			salarioReajuste = Math.round(salarioReajuste*100.00)/100.00f;
			System.out.printf(nomeColaborador+" ocupa do cargo de supervisor. Seu salário após o resjuste é R$ %.2f", salarioReajuste);
			break;
		case 4:
			System.out.println ("Digite o salário atual de "+nomeColaborador+".");
			salario = leia.nextFloat();
			salarioReajuste = (MOTORISTA*salario) + salario;
			salarioReajuste = Math.round(salarioReajuste*100.00)/100.00f;
			System.out.printf(nomeColaborador+" ocupa do cargo de motorista. Seu salário após o resjuste é R$ %.2f", salarioReajuste);
			break;
		case 5:
			System.out.println ("Digite o salário atual de "+nomeColaborador+".");
			salario = leia.nextFloat();
			salarioReajuste = (ESTOQUISTA*salario) + salario;
			salarioReajuste = Math.round(salarioReajuste*100.00)/100.00f;
			System.out.printf(nomeColaborador+" ocupa do cargo de estoquista. Seu salário após o resjuste é R$ %.2f", salarioReajuste);
			break;
		case 6:
			System.out.println ("Digite o salário atual de "+nomeColaborador+".");
			salario = leia.nextFloat();
			salarioReajuste = (TECNICOTI*salario) + salario;
			salarioReajuste = Math.round(salarioReajuste*100.00)/100.00f;
			System.out.printf(nomeColaborador+" ocupa do cargo de técnico de TI. Seu salário após o resjuste é R$ %.2f", salarioReajuste);
			break;
		default:
			System.out.println("Cargo não encontrado. Execute novamente e insira opções de 1 a 6. Consulte a tabela.");
		}
	}
}
