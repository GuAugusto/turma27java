package lista3;
import java.util.*;
public class Lista3tarefa4 {

	public static void main(String[] args) {
		
		int idade=0;
		char sexo;
		char opcoes;
		int pessoasCalmas=0; 
		int mulheresNervosas=0; 
		int homensAgressivos=0; 
		int outrosCalmos=0;
		int pessoasNervosasMais40anos=0; 
		int pessoasCalmasmenos18Anos=0;
		char op='S';
		final int  LIMITE = 150;
		int contador =1;
		Scanner leia = new Scanner (System.in);
		
		while(op=='S' && contador <=LIMITE){
			System.out.println("Participante"+ contador);
			
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			System.out.println("Digite");
			System.out.println("\n1-feminino\n2-masculino\n3-Outros ");
			sexo = leia.next().charAt(0);
			System.out.println("Selecione ");
			System.out.println("1 - pessoa calma\n2 - pessoa era nervosa\n3 - pessoa agressiva ");
			opcoes = leia.next().charAt(0);
			
			if (opcoes == '1') {
				pessoasCalmas++;
			}
			if(sexo== '1' && opcoes =='2') {
				mulheresNervosas++;
			}
			if (sexo =='2' && opcoes == '3') {
				homensAgressivos++;
			}
			if (sexo == '3' &&  opcoes == '1') {
				outrosCalmos++;
			}
			if(idade >40 && opcoes == '2') {
				pessoasNervosasMais40anos++;
			}
			if (idade <18 && opcoes == '1') {
				pessoasCalmasmenos18Anos++;
			}
			System.out.println("Contua S/N: ");
			op = leia.next().toUpperCase().charAt(0);
			
			//saida do loop
			contador++;
			
			
		} System.out.println("Pessoas calmas: " + pessoasCalmas);
		System.out.println("Mulheres nervosas: " + mulheresNervosas);
		System.out.println("Homens agressivos: " + homensAgressivos);
		System.out.println("Outros calmos: " + outrosCalmos);
		System.out.println("Pessoas nervosas mais de 40 anos: " + pessoasNervosasMais40anos);
		System.out.println("Menores de 18 calmos: " + pessoasCalmasmenos18Anos);
		
		
		
		
		
		
		

	}

}
