package introducao;
import java.util.Scanner;
public class VetoresEMatriz {
//VETOR
	public static void main(String[] args) {
		
	
		final int LIMITE=4;
		int notas [] = new int[4];
		String alunos[] = { "JOAO","MARCOS", "MARIA", "PEDRO"};
		String matricula[] = new String[4];
		Scanner leia = new Scanner(System.in);
		
		//String alunos[] = new String[4]; //0...3 
			
		
		System.out.println("Cadastro de notas");
		
		for(int x=0; x<alunos.length; x++) {
			System.out.println("Alune "+(x+1));
			matricula[x] = "MAT--"+(x+1);
			System.out.println("Matricula " +matricula[x] + "Alune "+ alunos [x].toUpperCase()+" : " );
			notas[x] = leia.nextInt();
		}
		  System.out.println("BOLETIM");
		
		for (int x=0; x<LIMITE; x++) {
			if (notas[x]>=5){
				System.out.printf("%s - %s nota : %d APROVADO \n",matricula[x],alunos[x].toUpperCase(),notas[x]);
			}
			
			System.out.printf("%s - %s nota : %d \n",matricula[x],alunos[x].toUpperCase(),notas[x]);
		  }
			  	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
