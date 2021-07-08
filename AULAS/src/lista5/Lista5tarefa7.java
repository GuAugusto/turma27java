package lista5;




import java.util.Scanner;

import objetos.Paciente;

/*
 * rie uma classe paciente e apresente os atributos e métodos referentes esta classe, em seguida crie
 *  um objeto paciente, defina as instancias deste objeto e apresente as informações deste objeto no console.

 */
public class Lista5tarefa7 {

	public static void main(String[] args) {
		Paciente paciciente1 = new Paciente ();
		Paciente paciciente2 = new Paciente ();
		
		
		
		Paciente paciciente11 = new Paciente ();
		Paciente paciciente21 = new Paciente ();
		 
		
		 paciciente11.nome = "Gustavo";


	   
	        paciciente11.anoNascimento = 2001;


	       
	        paciciente21.nome = "Livia";
	        paciciente21.anoNascimento = 2003;

	        System.out.printf("Meus paciente são %s e %s", paciciente11.nome, paciciente21.nome);
	       
	        if((paciciente11.calculaIdade(2021))>(paciciente21.calculaIdade(2021))) {
	            System.out.printf("\n%s é mais velho que %s\n", paciciente11.nome, paciciente21.nome);
	            paciciente11.mostrarIdade();//chamei um método
	        } else if ((paciciente11.calculaIdade(2021))<(paciciente21.calculaIdade(2021))) {
	            System.out.printf("\n%s é mais velho que %s\n", paciciente21.nome, paciciente11.nome);
	            paciciente21.mostrarIdade();
	        } else {
	            System.out.printf("\n%s tem a mesma idade que %s", paciciente11.nome, paciciente21.nome);

	}

}
	}
