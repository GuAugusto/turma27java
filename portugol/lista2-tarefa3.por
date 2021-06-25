programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		
		real n1,n2,n3,n4,resultadon1, resultadon2, resultadon3,resultadon4
		
		
	
		
		escreva("Digite qualquer numero: ")
		leia (n1)
		escreva("Digite qualquer numero: ")
		leia (n2)
		escreva("Digite qualquer numero: ")
		leia (n3)
		escreva("Digite qualquer numero: ")
		leia (n4)
		
		resultadon1 = mat.potencia(n1, 2)
		resultadon2 = mat.potencia(n2, 2)
		resultadon3 = mat.potencia(n3, 2)
		resultadon4 = mat.potencia(n4, 2)

		se(resultadon3 >=1000 )
			{
			escreva("O valor é: ",resultadon3 )
		} senao{
		escreva("Os valores são: ",resultadon1,"\n",resultadon2,"\n",resultadon3,"\n",resultadon4,"\n" )	
		}
		
		
		
		
		




	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 680; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */