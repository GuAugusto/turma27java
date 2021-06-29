programa
{
	
	funcao inicio()
	{
		inteiro nota [5]
		inteiro maiorPontuacao = 0


		para(inteiro cont = 0;cont <5;cont++)
			{

			escreva("Informa a pontuação: ")
			leia(nota[cont])
			limpa()
			
			se(maiorPontuacao<nota[cont])
			{

				maiorPontuacao = nota[cont]
				
			}
		}
		para(inteiro cont = 0; cont <5;cont++)
		{
			escreva("\nA pontuação é: ",nota[cont])	
		}

		escreva("\nA maior pontuação é: ",maiorPontuacao )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 398; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */