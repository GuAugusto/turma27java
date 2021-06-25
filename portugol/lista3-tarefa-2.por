programa
{
	//2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três e que se encontram no conjunto dos números de 1 até 500
	
	
	
	funcao inicio()
	{
		const inteiro consNumero = 500
		inteiro somaNumerosDe3=0

		para(inteiro contagem=1;contagem<=500;contagem++){
			
			se(contagem%2==1 e contagem%3==0){
				somaNumerosDe3+=contagem
			}
		}
		escreva("A soma de todos os numeros impares e multiplos de 3 é: ",somaNumerosDe3)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 176; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */