package Lista6;

public class Cavalo extends Animais {

	public Cavalo(String nome, int idade, boolean emiteSom) {
		super(nome, idade, emiteSom);
		
	}
		public boolean eleTemCorrido;
		public boolean isEleTemCorrido() {
			return eleTemCorrido;
		}
		public void setEleTemCorrido(boolean eleTemCorrido) {
			this.eleTemCorrido = eleTemCorrido;
		}
		
		public void elenaoTemCorrido () {
			eleTemCorrido = true;
		}
		public void eleTemCorrido () {
			eleTemCorrido = true;
		}
	
}
