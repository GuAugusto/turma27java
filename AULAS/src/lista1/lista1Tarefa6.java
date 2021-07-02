package lista1;
import java.util.Scanner;
public class lista1Tarefa6 {
	
	public static void main(String[] args) {
		
		double d;
		double x1;
		double x2;
		double y1;
		double y2;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de X1: ");
		x1 = ler.nextDouble();
		System.out.println("Digite o valor de X2: ");
		x2 = ler.nextDouble();
		System.out.println("Digite o valor de Y1: ");
		y1 = ler.nextDouble();
		System.out.println("Digite o valor de Y2: ");
		y2 = ler.nextDouble();
		
		d =Math.sqrt(((Math.pow((x2-x1),2))+Math.pow((y2-y1),2)));
		
		System.out.printf("A distancia de D é igual a %.2f",d);
		
		
		
	}
	
}
