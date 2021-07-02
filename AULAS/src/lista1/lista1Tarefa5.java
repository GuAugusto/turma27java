package lista1;
import java.util.Scanner;
public class lista1Tarefa5 {

	public static void main(String[] args) {
		double n1;
		double n2;
		double n3;
		double p1;
		double p2;
		double p3;
		double media;
		
		
		Scanner ler = new Scanner(System.in);
		System.out.println("\nInsira o valor da primeira nota: ");
		n1= ler.nextDouble();
		
		System.out.println("\nInsira o peso da primeira nota");
		p1= ler.nextDouble();

		System.out.println("\nInsira o valor da segunda nota: ");
		n2= ler.nextDouble();
		
		System.out.println("\nInsira o peso da segunda nota");
		p2= ler.nextDouble();
		
		System.out.println("\nInsira o valor da terceira nota: ");
		n3= ler.nextDouble();
		
		System.out.println("\nInsira o peso da terceira nota");
		p3= ler.nextDouble();
		
		media = (n1*p1+n2*p3+n3*p3)/(p1+p2+p3);
		
		System.out.printf(" A média é: %.1f",media);
		

		

	}

}
