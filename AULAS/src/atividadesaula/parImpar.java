package atividadesaula;

import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		numero = ler.nextInt();
		
		
		
		
		if (numero < 0) {
		System.out.println("Infelizmente não consigo ler numeros negativos, apenas positivos!");	
		}
	
		else if (numero == 0){
				System.out.println("\nO numero: " + numero + ", é neutro!");
				
		 }
	
		else if (numero % 2 ==0){
			System.out.println("\nO numero: " + numero + ", é par!");
	
		} 
	
		 else 
		 {
			System.out.println("\nO numero: " + numero + ", é ímpar!");
			
		}
		
		 System.out.println("\n\n\nFim do programa!");
		
	} 
	

}
