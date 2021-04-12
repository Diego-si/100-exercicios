package exercicios;

/**
 * Programa para Escreva um programa que desenhe na tela um ret�ngulo de 60
 * colunas (a partir da coluna 1 da tela) e 10 linhas (a partir da linha 1 da
 * tela)
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class Exercicio87 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declando variaveis
		String resultado;

		// atribuindo valor na variavel
		resultado = "Seguencia de caracteres \n";

		// iniciando o la�o
		for (int i = 1; i < 10; i++) {
			// segundo la�o
			if ((i == 1) || (i == 10)) {
				// atribuindo valores no resultado
				resultado += "\n";
				for (int j = 0; j <= 60; j++) {
					// atribuindo valores no resultado
					resultado += "+"; //linha de cima
				} // fim segundo la�o

			} else if ((i > 1) && (i < 10)) {
				resultado += "\n-"; //linha lateral direita
				// inicio terceiro la�o
				for (int j = 0; j < 59; j++) {
					resultado += " ";
				} // fim terceiro la�o
				resultado += "+"; //linha lateral esquerda
			}

		} // fim primeiro la�o

		// la�o para linha de baixo
		for (int i = 1; i < 10; i++) {

			if ((i == 1) || (i == 10)) {
				// atribuindo valores no resultado
				resultado += "\n";
				for (int j = 0; j <= 60; j++) {
					// atribuindo valores no resultado
					resultado += "+";
				}

			}

		} // fim primeiro la�o

		// exibindo resultado
		System.out.println(resultado);
	}

}
