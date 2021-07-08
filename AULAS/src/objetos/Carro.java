package objetos;

public class Carro {
	public String marca;
	public String modelo;
	public double motor;
	public char combustivel;
	public boolean ligado;
	public int velocidade;
	
	
	public void ligarCarro() {
		ligado = true;
		System.out.println("Carro ligando...");
	}
	public void desligarCarro() {
		if (velocidade ==0) {
		ligado = false;
		System.out.println("Carro desligando...");
		} else {
			System.out.println("Desacelere para desligar o carro!!!");
		}
			
	}
	public void acelarar() {
		velocidade++;
	}
}
