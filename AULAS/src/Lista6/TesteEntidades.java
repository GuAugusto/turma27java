package Lista6;

public class TesteEntidades {

	public static void main(String[] args) {
		
		
		Cavalo cavalo1 = new Cavalo ("Tiao", 5, true);
		Cachorro cachorro1 = new Cachorro ("BOB",2,true);
		Preguica preguica1 = new Preguica ("LUCK",1,false);
		
		
		System.out.println("O cavalo: "+cavalo1.getNome()+" tem: "+cavalo1.getIdade()+ "emite som");
		System.out.println("O cachorro: "+cachorro1.getNome()+" tem: "+cachorro1.getIdade()+ "eemite som");	
		System.out.println("A preguica: "+preguica1.getNome()+" tem: "+preguica1.getIdade()+ "eemite som");
	}

}
