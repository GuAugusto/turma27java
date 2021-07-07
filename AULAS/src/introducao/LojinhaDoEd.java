package introducao;

public class LojinhaDoEd {

	public static void main(String[] args) {
		String produtos[] = {"Camiseta","Calça","Chinela","Gorro","Shorts","Vestido","Brusinha","Blusão","Meia","Oculos"};
		double precos[] = {30,70,20,50,70,50,30,50,10,80};
		int codigo [] = {1,2,3,4,5,6,7,8,9,10};
		int estoque[] = {10,10,10,10,10,10,10,10,10,10};
		double carrinho[] = new double[10];
		
		String nome = "";
		
		System.out.println("Produtos:");
		for(int x = 0; x < produtos.length; x++) {
			System.out.println("G2 - 0"+codigo[x]+" -  "+produtos[x]+"  -  R$: "+precos[x]+"   -   estoque: "+estoque[x]);

			}
			
		for(int x = 0; x < estoque.length; x++) {
			System.out.println("G2 - 0"+codigo[x]+" -  "+produtos[x]+"  -  R$: "+precos[x]+"   -   estoque: "+estoque[x]);
			
			
			if (estoque[x] > 10) {
				System.out.println("G2 - 0"+codigo[x]+" -  "+produtos[x]+"  -  R$: "+precos[x]+"   -    sem estoque! "+estoque[x]);
			} else {
				System.out.println("G2 - 0"+codigo[x]+" -  "+produtos[x]+"  -  R$: "+precos[x]+"   -   estoque: "+estoque[x]);
			}
		}

	
	
	
	
	}



}