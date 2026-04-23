package estruturasRepeticao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		// Declarações de variáveis.
		Scanner leia = new Scanner(System.in);
		int menu1, menu2, idade,totalIdade, nBackend, nMFrontend, nHMobile, nNBFullStack, nRespostas;
		float media = 0.0f;
		String continua = "s" ;
		
		//Apresentação.
		System.out.println("Bem-vinde ao processamento de dados da pesquisa.\n");
		idade = totalIdade = nRespostas = nMFrontend = nBackend = nHMobile = nNBFullStack = 0;
		
		//Início da entrada de dados
		while(!continua.equalsIgnoreCase("n")) {
			nRespostas++;
			System.out.println("\nPor favor, informe a idade da "+nRespostas+"° pessoa a ser processada.");
			idade = leia.nextInt();
			System.out.println("\n1 - Mulher Cis\n2 - Homem Cis\n3 - Pessoa Não-Binária\n4 - Mulher Trans\n5 - Homem Trans\n6 - Outros\nObservando o menu a cima, informe a identidade de gênero da "+nRespostas+"° pessoa a ser processada.");
			menu1 = leia.nextInt();
			System.out.println("\n1 - Backend\n2 - Frontend\n3 - Monile\n4 - Fullstack\nObservando o menu a cima, informe a classificação da "+nRespostas+"° pessoa desenvolvedora a ser processada.");
			menu2 = leia.nextInt();
			System.out.println("\nDeseja continuar a leitura de dados de ume nove colaboradore? (S/N)\n");
			continua = leia.nextLine();
			
			//Processamento.
			if(menu2 == 1) {
				nBackend++;
			}
			if((menu1==1 ||menu1==4) && menu2 == 2){
				nMFrontend++;
			}
			if((menu1==2 ||menu1==5) && menu2==3 && idade > 40){
				nHMobile++;
			}
			if((menu1==3) && menu2==4 && idade < 30){
				nNBFullStack++;
			}
			totalIdade = totalIdade + idade;
			media = Float.valueOf(totalIdade)/nRespostas;
		}
		//Saída de dados.
		System.out.println("\nO número de pessoas desenvolvedoras Backend é "+nBackend+".\nO número de mulheres desenvolvedoras Frontend é "+nMFrontend+".\nO número de homens desenvolvedoras Mobile com idade superior a 40 anos é "+nHMobile+".\nO número de pessoas não-binárias desenvolvedoras FullStack com idade infeior a 30 anos é "+nNBFullStack+".\nO número de pessoas que respondeu a pesquisa é "+nRespostas+".\nA média de idade das pessoas que responderam essa pesquisa é "+media);
		
	}
}
