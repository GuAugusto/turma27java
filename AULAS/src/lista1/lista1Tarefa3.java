package lista1;
import java.util.Scanner;
public class lista1Tarefa3 {

	public static void main(String[] args) {
		int horas;
		int minutos;
		int segundos;
		int res;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a duração do evento em segundo: ");
		segundos = ler.nextInt();
		horas = (segundos/3600);
		minutos = ((segundos % 3600)/60);
		res = ((segundos % 3600) %60);
		
		System.out.println("A duração do evento foi de: "+horas+"horas "+minutos+"minutos e"+segundos+"segundos");

	}

}
