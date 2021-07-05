package lista3;
import java.util.*;
/*
 * Solicitar a idade de várias pessoas e imprimir: 
 * Total de pessoas com menos de 21 anos. 
 * Total de pessoas com mais de 50 anos. 
 * O programa termina quando idade for =-99. (WHILE)
 */

public class Lista3Tarefa2 {

	public static void main(String[] args) {
		int par=0, num, i;
		
		Scanner leia = new Scanner (System.in);
		
		for (i=1; i<=10; i++) {
			System.out.printf("Digite qualquer numero: ");
			num = leia.nextInt();
			if (num%2==0) {
				par=par+1;
			}
		}
		System.out.printf("Pares %d\n",par);
		System.out.printf("Impares: %d", 10-par);
	} 	
}
