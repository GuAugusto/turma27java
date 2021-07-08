package lista5;
/*
 * Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto funcionário, defina as instancias deste objeto e apresente as informações deste objeto no console.
 */
import objetos.Funcionario;

public class Lista5Tarefa4 {

	public static void main(String[] args) {


		Funcionario funcionario1 = new Funcionario ();
		
		funcionario1.idade = 20;
		funcionario1.Cargo = "DevJr";
		funcionario1.nome = "Gustavo Augusto";
		funcionario1.Ativo = true;
		funcionario1.TempoDeEmpresa = 1.02;
		funcionario1.Ferias = true;
		
		System.out.println("Funcionario: "+funcionario1.nome);
		System.out.println("Parabéns você completou: "+funcionario1.TempoDeEmpresa+ " anos aqui na empresa");
		System.out.println("É por isso que você esta recebendo as suas ferias, diverta-se!");
		System.out.println("Você é o nosso melhor "+funcionario1.Cargo+ ", mesmo com apenas "+funcionario1.idade+" de idade. Você é muito bom no que faz!!!");
		
		
		

	}

}
