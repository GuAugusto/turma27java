package lista2;
/*
 * Faça um programa que entre com três números e coloque em ordem crescente.
 * 
 * 
 * 
 */

import java.util.*;
public class lista2Tarefa2 {

	public static void main(String[] args) {
		
		int n1;
		int n2;
		int n3;
			
		Scanner ler = new Scanner (System.in);

		System.out.println("Entre com o valor de N1: ");
		n1 = ler.nextInt();
	
		System.out.println("Entre com o valor de N2: ");
		n2 = ler.nextInt();

		System.out.println("Entre com o valor de N3: ");
		n3 = ler.nextInt();

		
		if (n1 <= n2 && n2 <= n3)
	    {
		System.out.printf("A ordem crescente: %d %d %d\n", n1, n2, n3);
	    }
	  else if (n1 <= n3 && n3 <= n2)
	    {
		  System.out.printf("A ordem crescente: %d %d %d\n", n1, n3, n2);
	    }
	  else if (n2 <= n1 && n1 <= n3)
	    {
		  System.out.printf("A ordem crescente: %d %d %d\n", n2, n1, n3);
	    }
	  else if (n2 <= n3 && n3 <= n1) 
	    {
		  System.out.printf("A ordem crescente: %d %d %d\n", n2, n3, n1);
	    }
	  else if (n3 <= n1 && n1 <= n2) 
	    {
		  System.out.printf("A ordem crescente: %d %d %d\n", n3, n1, n2);
	    }
	  else  
	    {
		  System.out.printf("A ordem crescente: %d %d %d\n", n3, n2, n1);
	    }

	}

}
