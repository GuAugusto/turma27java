package introducao;

import objetos.ContaBancaria;

public class BankGu {

	public static void main (String [] args) {
		
		
		ContaBancaria cliente1 = new ContaBancaria(1);
		ContaBancaria clientevip = new ContaBancaria(2,55.55);
		ContaBancaria clienteEspecial = new ContaBancaria (10.50,200.00,3);
		ContaBancaria Contajaque = new ContaBancaria (100.52,2000.0,3);
		
		clienteEspecial.setNumero(300);		
		
		System.out.println("numero da conta " + cliente1.getNumero());
		System.out.println("numero da conta " + clienteEspecial.getNumero());
		
		Contajaque.imprimiExtrato();
		Contajaque.saca(1000.33);
		Contajaque.imprimiExtrato();
		
		
		
		
		
		
	}
}
