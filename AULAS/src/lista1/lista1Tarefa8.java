package lista1;
import java.util.Scanner;
public class lista1Tarefa8 {

	public static void main(String[] args) {
		
		int vPercDistribuidor=29;
		int vPercImpostos=45;
		double vCustoFabrica;
		double vValorDistribuidor;
		double vValorImposto;
		double vCustoConsumidor;
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o valor de custo de fábrica: ");
		vCustoFabrica = ler.nextDouble();

		vValorDistribuidor = vCustoFabrica + (vCustoFabrica * vPercDistribuidor / 100);
		vValorImposto = vCustoFabrica + (vCustoFabrica * vPercImpostos / 100);
		vCustoConsumidor = vCustoFabrica + vValorDistribuidor + vValorImposto; 
		System.out.println("O custo ao consumidor é: " + vCustoConsumidor);
		
	}
	

	
}
