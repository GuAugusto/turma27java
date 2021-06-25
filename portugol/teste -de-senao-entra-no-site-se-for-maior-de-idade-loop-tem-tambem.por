programa
{
	
	funcao inicio()
	{
		inteiro idade
		inteiro contador=1
		
		escreva("Digite a sua idade: ")
		leia(idade)

		enquanto(idade <  18){
			escreva("Voce não tem permissão para acessar este site \n")

			escreva("Digite a sua idade: ")
			leia (idade)
			contador++
			
			se(contador>=3){
				escreva("\nAmigão, ja eras voce errou mais que tres vezes")
				pare
			}
			
		}
		se(contador==1){
			escreva("Você pode acessar site")
		}senao{
			escreva("\nVocê não pode acessar site!")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 408; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */