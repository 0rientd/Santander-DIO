programa
{
	
	funcao inicio()
	{
		real janeiro, fevereiro, marco, abril, media
		cadeia funcionario

		
		escreva("Digite o nome do funcionário: ")
		leia(funcionario)
		escreva("Digite a venda acumulada de janeiro: ")
		leia(janeiro)
		escreva("Digite a venda acumulada de fevereiro: ")
		leia(fevereiro)
		escreva("Digite a venda acumulada de marco: ")
		leia(marco)
		escreva("Digite a venda acumulada de abril: ")
		leia(abril)
		
		media = (janeiro+fevereiro+marco+abril) / 4

		escreva("\nA media de vendas do funcionario" + funcionario+ " é de: " + media + ".\n")
		escreva("O valor acumulado de vendas do mesmo foi de: " + media*4 + ".")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 496; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */