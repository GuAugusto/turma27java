package introducao;
import java.util.Scanner;
public class ExemploLojaEd {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		String produtos[] = { "camisa", "calca", "bermuda"};
		double precos [] = new double[3];
		int estoque [] = new int [3];
		String codigo [] = new String [3];
		
		System.out.println("CODIGO\tPRODUTO\tESTOQUE\tPRECO");
		for (int x=0; x<3; x++) {
			codigo [0] = "EJ-01";
			estoque [x] = 10;
			System.out.println(codigo[x]+"\t"+produtos[x]+"\t"+estoque[x]+"\t"+precos);
			
		}
		
	
		

	}

}
