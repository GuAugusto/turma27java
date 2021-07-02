package lista1;

import java.util.Scanner;
public class lista1Tarefa1 {

	public static void main(String[] args) {
		int ano;
		int mes;
		int dia;
		int diasDeVida;
		Scanner ler = new Scanner(System.in);
		System.out.println("\nOlá, tudo bem?\nPor favor, Informe o dia do seu nascimento: ");
		dia = ler.nextInt();
		System.out.println("\nPor favor, Informe o mes de seu nascimento: ");
		mes= ler.nextInt();
		System.out.println("\nE Por fim, Informe quantos anos você tem: ");
		ano = ler.nextInt();
		
		diasDeVida = ((ano * 365) + mes * 30) + dia;

		System.out.println("\nParabéns, voce já viveu: " +diasDeVida+" Dias. Continue se cuidando e sempre use mascara #forabolsonaro! ");
		

	}

}
