package lista5;

import objetos.Eletronicos;

/*
 *  Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto produto eletrônico, defina as instancias deste objeto e apresente as informações deste objeto no console.
 */
public class lista5Tarefa3 {

	public static void main(String[] args) {
		
		Eletronicos celular1 = new Eletronicos ();
		celular1.camera = 1;
		celular1.modelo = "IPHONE 8";
		celular1.tipo = "SmartPhone";
		celular1.ligado = true;
		
		System.out.println("O modelo de seu celular "+ celular1.modelo+"\nO tipo  "+ celular1.tipo+", Ele tem "+celular1.camera+"camera \nE nao se preocupe ele está ligado "+celular1.ligado);
		
		
		
	}

}
