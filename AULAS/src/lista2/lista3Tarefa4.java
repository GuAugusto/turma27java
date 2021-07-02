package lista2;

import java.util.Scanner;

/*
 * Faça um programa em que permita a entrada de um número qualquer 
 * e exiba se este número é par ou ímpar. 
 * Se for par exiba também a raiz quadrada do mesmo; 
 * se for ímpar exiba o número elevado ao quadrado.
 */


import java.util.Scanner;
public class lista3Tarefa4 {

	public static void main(String[] args) {
		double numero;
	
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		numero = ler.nextInt();
		
		if (numero < 0) {
			System.out.println("Infelizmente não consigo ler numeros negativos, apenas positivos!");	
			}
		
			else if (numero == 0){
					System.out.println("\nO numero: " + numero + ", é neutro.\nDigite um numero positivo impar ou par!!!");
					
			 }
		
			else if (numero % 2 ==0&& Math.sqrt(numero)){
				System.out.println("\nO numero: " + numero + ", é par!");
		
			} 
		
			 else if (numero % 2 ==1 &&  Math.pow(numero, 2) )
			 {
				System.out.println("\nO numero: " + numero + ", é ímpar!");
				
			}
			
			 System.out.println("\n\n\nFim do programa!");
	}

}
