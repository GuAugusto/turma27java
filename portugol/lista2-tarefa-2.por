programa
{
	
	/*
	 * 2) Elabore um sistema que leia as variáveis C e N, 
	 * respectivamente código e número de horas trabalhadas de um operário. 
	 * E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
	 * Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, 
	 * caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
	 * No final do processamento imprimir o salário total e o salário excedente.
 */
	funcao inicio()
	{
		cadeia codigoFuncionario
		inteiro numeroHorasTrabalhadas
		real excesso= 0.00
		const real VALOR_HORA_TRABALHADA = 10.00
		const real VALOR_HORA_EXCEDENTE= 20.00
		const inteiro LIMITE_HORAS=50
		real salarioTotal=0.00, salarioExcedente=0.00

		escreva("Digite o código do Funcionário: ")
		leia (codigoFuncionario)
		escreva("Qual a quantidade de horas trabalhadas?: ")
		leia (numeroHorasTrabalhadas)

		se(numeroHorasTrabalhadas <= LIMITE_HORAS){
		salarioTotal= numeroHorasTrabalhadas * VALOR_HORA_TRABALHADA
		escreva("Salario Total: ",salarioTotal, "\n")
		escreva("salarioExcedente: ",salarioExcedente, "\n")
		
		}senao{
			salarioExcedente=(numeroHorasTrabalhadas - LIMITE_HORAS) * VALOR_HORA_EXCEDENTE
			salarioTotal=500 + salarioExcedente
			escreva("Salario Total: ",salarioTotal, "\n")
			escreva("salarioExcedente: ",salarioExcedente, "\n")
		

			
		}
		
			
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 481; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */