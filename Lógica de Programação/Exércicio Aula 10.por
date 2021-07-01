programa
{
	
	funcao inicio()
	{
		cadeia dados[][] = {
			{"João", "São Paulo", "(11) 9999-5241"},
			{"Maria", "Ribeirão Preto", "(16) 9999-8596"},
			{"Ana", "Manaus", "(92) 9999-8574"}
		}
		inteiro contador = 0


		escreva("Dados:\n")
		faca {
			escreva("Nome: " + dados[contador][0] + " | Localidade: " + dados[contador][1] + " | Número: " + dados[contador][2] + " |\n")
			contador = contador + 1

		} enquanto (contador <= 2)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 448; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */