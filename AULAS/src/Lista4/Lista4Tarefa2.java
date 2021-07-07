package Lista4;
import java.util.Scanner;
public class Lista4Tarefa2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int lancamento[] = new int [10];
		int media=0, soma=0, maior=0;
		int jogada=0;
		
		System.out.println("Jogo do Dado - Lembre-se que o dado tem pontuação de 1 até 6.");
		
		for(int x=0;x<lancamento.length;x++) {
			System.out.println("Digite qual sua pontuação no lançamento: ");
			lancamento[x]=leia.nextInt();
			//jogada = leia.nextInt();
			//if(jogada>6 || jogada<1) {
			//	System.out.println("Valor maior que 6 ou menor que 1, digite um valor valido.");
			//} else {
				soma+=lancamento[x];
			//}

		}
		
		for(int x=0;x<10;x++) {
			if( lancamento[x]>maior){
				maior=lancamento[x];
			}
		}
		
		System.out.println("Sua maior pontuação foi: "+maior);	
		
		media=soma/10;
		System.out.println("O total de pontuação foi: "+soma+" E a média é: "+media);

	}

}
