programa
{
	
	funcao inicio()
	{
		cadeia nomesAlunos [4]
		inteiro notasAlunos [4]

		escreva("Boletim do ED\n")


		para(inteiro i = 0; i < 4 ; i++)
		{
			escreva("Digite o nome do aluno: ")
			leia (nomesAlunos [i])
			escreva("Digite a Nota do aluno: ")
			leia(notasAlunos [i])
			limpa()

		}
			escreva("\n")

			para(inteiro i = 0; i < 4 ; i++)
			{
				se(notasAlunos[i] >=0){
					escreva(nomesAlunos[i], "ficou com a nota: ", notasAlunos[i], "Parabens voce passou")
					
				} 
				escreva("Aluno: ",nomesAlunos [i], ", sua nota é: ", notasAlunos [i], "\n")
			}





	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 495; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */