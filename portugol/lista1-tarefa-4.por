programa
{
	inclua biblioteca Matematica -->Mat
	
	funcao inicio()
	{
		inteiro a
		inteiro b
		inteiro c
		inteiro r
		inteiro s
		real d
		
		escreva("Digite o valor de A: ")
		leia (a)
		
		escreva("Digite o valor de B: ")
		leia(b)
		
		escreva("Digite o valor de B: ")
		leia (c)

		r=Mat.potencia((a+b),2)
		s=Mat.potencia((b+c),2)

		d= ( r+s)/2
		escreva ("valor de D: " + d)
		
		
		
		
	
		
		
		
		 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 343; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = matriz;
 */