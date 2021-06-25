programa
{
	
	funcao inicio()
	{
		real altura, base, area
		
		escreva("Digite a base do tringulo: ")
		leia (base)
		escreva("Digite a altura do tringulo: ")
		leia (altura)

		area = (base * altura) / 2
		se (base >0 e altura >0 ){
			escreva("A area do trinagulo é: ",area)
		} senao
		escreva("Desculpa não conseguimos realizar os calculos. Tente novamente")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 162; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */