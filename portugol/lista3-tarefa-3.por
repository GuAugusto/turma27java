programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		/*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos 
		 * e apresente no final o total do somatório, a média e o total de valores lidos. 
		 * O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
		 * Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
		 */

		 //VARIAVEIS
		 inteiro valorDigitado=0
		 inteiro totalSomatorio=0
		 real media=0.0
		 real totalValoresLidos=0.0

		  //ENTRADAS  //PROCESSAMENTOS
		  enquanto(valorDigitado>=0){
		  	escreva("Digite uma valor positivo ou negativo para sair: ")
		  	leia(valorDigitado)
		  	se(valorDigitado>=0){
		  		totalSomatorio+=valorDigitado
		  		totalValoresLidos++
		  		
		  	}
		  	
		  }
		  media= totalSomatorio / totalValoresLidos
		  
		  
		  
		 //SAIDAS
		 escreva("\nTotal somatorio: ",totalSomatorio)
		 escreva("\nTotal de numreslidos: ",totalValoresLidos)
		 escreva("\nmédia: ",mat.arredondar(media,2))
		 escreva("\nFim de programa!!!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 940; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */