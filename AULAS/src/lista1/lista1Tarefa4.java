package lista1;
import java.util.Scanner;
public class lista1Tarefa4 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		double r;
		double s;
		double d;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = ler.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = ler.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = ler.nextInt();
		
		r = Math.pow((a + b), 2);
		
		s = Math.pow((c + b), 2);
	
		
		d= (r+s)/2;
		
		System.out.println("Valor de D: "+d);
		
		
		
		
	}

}
