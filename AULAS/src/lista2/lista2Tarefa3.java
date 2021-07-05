package lista2;
/*
 * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
	10-14 infantil
	15-17 juvenil
	18-25 adulto
 */




import java.util.Scanner;

public class lista2Tarefa3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		
		int idade;
		
		System.out.println("Digite a sua idade: ");
		idade = ler.nextInt();
		
		if (idade >= 10 && idade <= 14)
	    {
		System.out.printf("infantil");
	    }
	  else if (idade >=15 && idade <= 17)
	    {
		  System.out.printf("juvenil");
	    }
	  else if (idade >= 18 && idade <=25)
	    {
		  System.out.printf("adulto");
	    } 
	  else if (idade >= 0 && idade <= 9 )
	    {
		  System.out.printf("Só para maiores de 10 anos ");

	} else {
		System.out.println("Voce é Cringe igual o Ed KKKKKKKKKK");
	}

	}
}
