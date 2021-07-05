//G3 Bank
//Seu dinheiro em desenvolvimento.

//conta especial não avisa o usuario, não depende dele, se o saque for maior que o saldo aceita o limite
//automaticamente.
programa{

	
	inclua biblioteca Util
	
	funcao inicio(){
	
		cadeia Menu[6]={"Conta Poupança","Conta Corrente","Conta Especial","Conta Empresa","Conta Estudante","Sair"}
		inteiro op
		//real saldo=0.00//
		caracter d,D,c,C //opção de d,D é débito e c,C é crédito
		inteiro numero //equivale ao número da conta

		
		
		escreva("Bem Vinde ao Banco G3")
		escreva("\nSeu dinheiro em desenvolvimento!\n")
		escreva("\n")

		para(inteiro x=0; x<6; x++){
			escreva(x,"-",Menu[x],"\n")
		}
		
		escreva("\nEscolha a opção desejada:")
		leia(op)
//espaço reservado para códigos das operações
		escolha(op) {
		caso 0:      
		  	limpa()
		  	escreva("Banco G3")
			escreva("\nSeu dinheiro em desenvolvimento!\n")
			escreva("\n")
			escreva("Tipo:",Menu[op],"\n")
			//codigo da conta poupança
		pare
		caso 1:      
		  	limpa()
		  	escreva("Banco G3")
			escreva("\nSeu dinheiro em desenvolvimento!\n")
			escreva("\n")
			escreva("Tipo:",Menu[op],"\n")
			//codigo da conta corrente
		pare
		caso 2:      
		  	limpa()
		  	escreva("Banco G3")
			escreva("\nSeu dinheiro em desenvolvimento!\n")
			escreva("\n")
			escreva("Tipo:",Menu[op],"\n\n")
			Util.sorteia(000000,999999)

			//codigo da especial(Jaque)
		pare
		caso 3:      
		  	limpa()
		  	escreva("Banco G3")
			escreva("\nSeu dinheiro em desenvolvimento!\n")
			escreva("\n")
			escreva("Tipo:",Menu[op],"\n")
			//codigo da conta empresa
		pare
		
		
		
		
		caso 4:      
		  	real emprestimoEstudante=0.0, valorCliente=0.00
			real saldo=0.00, emprestimo=5000.00
			caracter emprestimoCliente,transacaoCliente
			inteiro contD=0
		  	inteiro conta
		  	caracter continuar
		  	caracter voltaMenu
			limpa()			
			escreva("Banco G3")
			escreva("\nSeu dinheiro em desenvolvimento!\n")
			escreva("\n")
			escreva("Tipo:",Menu[op],"\n")
			conta = Util.sorteia(000000,999999)
			escreva("Número: ",conta,"-4")
			escreva("\nOlá Estudante! Temos uma opção de emprestimo de até R$ 5.000! Aproveite!!\n")
			
			para (inteiro x=0;x<10;x++){
				
				escreva("\nSaldo atual: R$ "+saldo +"\nLimite para emprestimo: "+emprestimo)
 				escreva("\nGostaria de um emprestimo? S-Sim N-Não: ")
 				leia(emprestimoCliente)

					se (emprestimoCliente == 'S' ou emprestimoCliente == 's' )
					{
							escreva("Digite o valor do emprestimo de até R$ 5.000: ")
							leia(emprestimoEstudante)
							
							se(emprestimoEstudante<=0)
							{
							escreva("O valor digitado é negativo ou zero e não pode ser computado")
							} senao se(emprestimoEstudante>5000.00)
							{
							escreva("Seu limite de emprestimo é R$5.000 o valor de R$",emprestimoEstudante," é superior")
							} senao
							{
							saldo += emprestimoEstudante
							emprestimo -= emprestimoEstudante
							escreva("Saldo atual: R$ "+saldo +"\nLimite para emprestimo: "+emprestimo)
							}
					}senao se(emprestimoCliente == 'N' ou emprestimoCliente == 'n' ) 
							{
		          			escreva("\nSaldo atual: R$ "+saldo +"\nLimite para emprestimo: "+emprestimo)
		  					}escreva("\nSelecione a transação D-Débito C-Crédito: ")
		                    	leia(transacaoCliente)
		                    	escreva("Qual é o valor da transação? ")
		                    	leia(valorCliente)
						
						se(valorCliente<=0){
				                    escreva("O valor digitado é negativo ou zero e não pode ser computado") 
				                    }
						senao se(transacaoCliente == 'D' ou transacaoCliente == 'd')
								{
				                    contD++
				                    se(saldo==0.0)
				                    {
				                    escreva("Você não tem saldo,faça um emprestimo ou Credito")
				                    }senao se(valorCliente >saldo)
				                    {
				                    escreva("Você não tem saldo suficiente, faça um emprestimo ou Credito")
				                    }
				                    senao
				                    {
				                    saldo = saldo - valorCliente
				                    escreva("Transação nº"+contD+" - Movimento: Debito R$ "+ valorCliente)
				                    }
						 }senao se(transacaoCliente == 'C' ou transacaoCliente == 'c')
				                    {
				                    contD++
				                    saldo = saldo + valorCliente
				                    escreva("Transação nº"+contD+" - Movimento: Credito R$ "+ valorCliente)
				                    }
					escreva("\n\nDeseja continuar S-Sim ou N-Nao: ")
					leia(continuar)
					se(continuar=='n' ou continuar=='N')
					{
					escreva("\nSaldo atual: R$ "+saldo +"\nLimite para emprestimo: "+emprestimo)
					pare
					}
					}se(contD>=10)
					{
                 		escreva("\nLimite de 10 movimentações excedido.")
                 		}

					escreva("\nDeseja voltar ao Menu principal? S-Sim ou N-Não: ")
					leia(voltaMenu)
					se(voltaMenu=='s' ou voltaMenu=='S')
					{
					inicio()
					} senao 
					{
					limpa()
					escreva("\n\nVolte Sempre!\n") 
					escreva("Banco G3")
					escreva("\nSeu dinheiro em desenvolvimento!\n")
					}
			
			

			
			//codigo da conta estudantil
		pare
		caso 5:      
		  	limpa()
			escreva("Sistema finalizado!")
			escreva("\nVolte Sempre!")
			escreva("\n\nBanco G3")
			escreva("\nSeu dinheiro em desenvolvimento!\n")
		pare
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 5192; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */