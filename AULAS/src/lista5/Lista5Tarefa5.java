package lista5;

import objetos.Patinete;

/*
 * Crie uma classe patinete e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto patinete, defina as instancias deste objeto e apresente as informações deste objeto no console.

 */
public class Lista5Tarefa5 {

	public static void main(String[] args) {
		Patinete patinete1 = new Patinete ();
		
		patinete1.rodas = 2;
		patinete1.modelo = "Xiomi";
		patinete1.tipo = "Eletrico";
		
		System.out.println("Patinete modelo: " +patinete1.modelo );
		System.out.println("Com " + patinete1.rodas+ " rodas" );
		System.out.println("Do tipo: "+patinete1.tipo);
		
		

	}

}
