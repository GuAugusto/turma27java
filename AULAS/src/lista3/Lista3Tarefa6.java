package lista3;
/*
 * Escrever um programa que receba vários números inteiros no teclado. 
 * E no final imprimir a média dos números múltiplos de 3. 
 * Para sair digitar 0(zero).(DO...WHILE)

 */
import java.util.*;
public class Lista3Tarefa6 {

	public static void main(String[] args) {
		int num, soma=0;
		 double media=0, cont=0;
		 
		 Scanner leia = new Scanner (System.in);
		 
		 
		 System.out.println("\n DIGITE UM NUMERO INTEIRO: ");
		 num= leia.nextInt();
		 if(num %3==0 && num!=0)
		 {
		 soma=soma+num;
		 cont++;
		 }
		 while(num!=0)
		{
			 System.out.println("\n DIGITE UM NUMERO INTEIRO: ");
			 num= leia.nextInt();

		 if(num %3==0 && num!=0)
		 {
		 soma=soma+num;
		 cont++;
		 }}
		 media=soma/cont;
		 System.out.printf("\n\n A media dos numeros é: %3.2f ",media);
		 System.out.printf("\n\n");
		 System.out.printf("pause");


	}

}
