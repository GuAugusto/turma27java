package objetos;

public class ContaBancaria {
 private double Saldo;
 private double limite;
 private int numero;
 		

 public ContaBancaria(int numero) {
	 this.numero =  numero;
 }
 public ContaBancaria(int numero,double saldo) {
	 this.numero =  numero;
	 this.Saldo = saldo;
 }
 
 public ContaBancaria(double saldo, double limite, int numero) {
	super();
	Saldo = saldo;
	this.limite = limite;
	this.numero = numero;
}
 
 
 //ENCAPSULAMENTO - GETTERS AND SETERS
public double getSaldo() {
	return Saldo;
}
public void setSaldo(double saldo) {
	Saldo = saldo;
}
public double getLimite() {
	return limite;
}
public void setLimite(double limite) {
	this.limite = limite;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}

	 //METODOS PROPRIOS

	public void imprimiExtrato() {
		System.out.println("Conta" + numero+" saldo atual:  R$"+Saldo);
	}
	public void saca(double valorSaque) {
		Saldo = Saldo - valorSaque;
		if (valorSaque <=0) {
			System.out.println("VALOR INVALIDO");
		}
		else if(valorSaque> Saldo) {
			System.out.println("Saldo indispoonivel...");
		} else {
			Saldo =Saldo - valorSaque;
			System.out.println("Saque realizado");
		}
}
	public void deposita(double valorDeposito) {
		Saldo = Saldo + valorDeposito;
	}
}
 
 
 

