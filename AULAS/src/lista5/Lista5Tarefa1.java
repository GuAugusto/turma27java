package lista5;
/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto no console.
 */
import java.util.Scanner;

import objetos.Cliente;

public class Lista5Tarefa1 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		 
		 Cliente cliente1 = new Cliente ();
		 Cliente cliente2 = new Cliente ();
		 
		 System.out.println("Digite o nome: ");
	        cliente1.nome = leia.next().toUpperCase();


	        System.out.println("Digite o ano de nascimento: ");
	        cliente1.anoNascimento = leia.nextInt();


	        System.out.println("Digite o nome 2: ");
	        cliente2.nome = leia.next().toUpperCase();
	        cliente2.anoNascimento = 2012;

	        System.out.printf("Meus clientes são %s e %s", cliente1.nome, cliente2.nome);
	       
	        if((cliente1.calculaIdade(2021))>(cliente2.calculaIdade(2021))) {
	            System.out.printf("\n%s é mais velha que %s\n", cliente1.nome, cliente2.nome);
	            cliente1.mostrarIdade();//chamei um método
	        } else if ((cliente1.calculaIdade(2021))<(cliente2.calculaIdade(2021))) {
	            System.out.printf("\n%s é mais velho que %s\n", cliente2.nome, cliente1.nome);
	            cliente2.mostrarIdade();
	        } else {
	            System.out.printf("\n%s tem a mesma idade que %s", cliente1.nome, cliente2.nome);
	        

	        }
	}

}
