programa
{
	
	funcao inicio()
	{ 
		cadeia nome
		inteiro temperaturaEmF 
		real temperaturaEmC
		
		escreva("Digite seu nome: ")
		leia (nome)
		escreva( " Coloque a temperatura ( em Fahrenheit )")
		leia (temperaturaEmF)
		temperaturaEmC = (temperaturaEmF-32) /1.8
		escreva("Bom dia, " + nome + " A temperatura de hoje é: " + temperaturaEmC)


		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 319; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */