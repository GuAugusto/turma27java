package lista5;
/*
 * Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto avião, defina 
 * as instancias deste objeto e apresente as informações deste objeto no console.
 */
import objetos.Aviao;

public class Lista5Tarefa2 {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao ();
		
		
		aviao1.modelo = "BIMOTOR";
		aviao1.rodas = 3;
		aviao1.tipo = "PASSAGEIRO 14 LUGARES";
		aviao1.noAr = false;
		aviao1.ligado = false;
		aviao1.velocidade = 0;
		
		System.out.println("SITUACAO DO AVIAO...");
		System.out.println("Velocimetro atual: " +aviao1.velocidade+" NO AR "+ aviao1.noAr + " LIGADO " + aviao1.ligado);
		System.out.println("vamo para pista");
		aviao1.ligar();
		aviao1.aumentarVelocidade();
		aviao1.aumentarVelocidade();
		aviao1.aumentarVelocidade();
		aviao1.diminuirVelocidade();
		aviao1.diminuirVelocidade();
		aviao1.diminuirVelocidade();
		aviao1.decolando();
		aviao1.aumentarVelocidade(40);
		System.out.println("Velocimetro atual: " +aviao1.velocidade+" NO AR "+ aviao1.noAr + " LIGADO " + aviao1.ligado);
		aviao1.diminuirVelocidade(40);
		System.out.println("Velocimetro atual: " +aviao1.velocidade+" NO AR "+ aviao1.noAr + " LIGADO " + aviao1.ligado);
		aviao1.pousar();
		System.out.println("Velocimetro atual: " +aviao1.velocidade+" NO AR "+ aviao1.noAr + " LIGADO" + aviao1.ligado);
		aviao1.desliga();
		System.out.println("Velocimetro atual: " +aviao1.velocidade+" NO AR "+ aviao1.noAr + " LIGADO " + aviao1.ligado);
		 
		
		
		
		
		

	}

}
