package lista1;

import java.util.Scanner;
public class lista1Tarefa2 {

	public static void main(String[] args) {

		int ano;
		int mes;
		int dia;
		int dias;

		Scanner ler = new Scanner(System.in);
		System.out.println("\nOlá, tudo bem ?\nInforme a sua idade em dias: ");
		dias = ler.nextInt();
		
		ano = ( dias /365);
		mes = ( dias %365)/ 30;
		dia = ( dias % 365)% 30;
		 System.out.println("A idade em anos, meses e dias é: "+ ano+"anos "+mes+"meses "+dia+"dias ");


	}

}
