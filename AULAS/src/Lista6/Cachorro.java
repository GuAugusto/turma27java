package Lista6;

public class Cachorro extends Animais {

	public Cachorro(String nome, int idade, boolean emiteSom) {
		super(nome, idade, emiteSom);
		
	}
	
	public  boolean eleEstaCorrendo;

	public boolean isEleEstaCorrendo() {
		return eleEstaCorrendo;
	}

	public void setEleEstaCorrendo(boolean eleEstaCorrendo) {
		this.eleEstaCorrendo = eleEstaCorrendo;
	}
	

	public void eleNaoEstaCorrendo () {
		eleEstaCorrendo = false;
	}
	public void eleEstaCorrendo () {
		eleEstaCorrendo = true;
	}
}
