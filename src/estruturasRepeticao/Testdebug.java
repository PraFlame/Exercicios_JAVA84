package estruturasRepeticao;

import java.util.Scanner;

public class Testdebug {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int menu1, menu2, idade,totalIdade = 37, nBackend, nMFrontend, nHMobile, nNBFullStack, nRespostas=2;
		float media;
		
		System.out.println("\nPor favor, informe a idade da "+nRespostas+"° pessoa a ser processada.");
		idade = leia.nextInt();
		totalIdade = totalIdade + idade;
		media = Float.valueOf(totalIdade)/nRespostas;
		System.out.println(media);
	}

}
