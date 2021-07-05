package lista3;
/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)

 */
import java.util.*;

public class Lista3Tarefa3 {

	public static void main(String[] args) {
		int idade;
		int contador21=0;
		int contador50=0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.printf("\n DIGITE A IDADE: ");
		idade = leia.nextInt();
		 
		while(idade!=-99)
		 {
		 if(idade<21)
		 contador21++;
		 if(idade>50)
		 contador50++;
		 System.out.printf("\n Digite a idade: (PARA ENCERRAR DIGITE -99) : ");
		 idade = leia.nextInt();
		 }
		System.out.printf("\n O total de pessoas com manos de 21 anos é:%d",contador21);
		System.out.printf("\n O Ltotal de pessoas com mais de 50 anos é:%d",contador50);
		System.out.printf("\n\n");
		
		 


	}

}
