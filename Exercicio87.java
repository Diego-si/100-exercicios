package exercicios;

/**
 * Programa para Escreva um programa que desenhe na tela um retângulo de 60
 * colunas (a partir da coluna 1 da tela) e 10 linhas (a partir da linha 1 da
 * tela)
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class Exercicio87 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declando variaveis
		String resultado;

		// atribuindo valor na variavel
		resultado = "Seguencia de caracteres \n";

		// iniciando o laço
		for (int i = 1; i < 10; i++) {
			// segundo laço
			if ((i == 1) || (i == 10)) {
				// atribuindo valores no resultado
				resultado += "\n";
				for (int j = 0; j <= 60; j++) {
					// atribuindo valores no resultado
					resultado += "+"; //linha de cima
				} // fim segundo laço

			} else if ((i > 1) && (i < 10)) {
				resultado += "\n-"; //linha lateral direita
				// inicio terceiro laço
				for (int j = 0; j < 59; j++) {
					resultado += " ";
				} // fim terceiro laço
				resultado += "+"; //linha lateral esquerda
			}

		} // fim primeiro laço

		// laço para linha de baixo
		for (int i = 1; i < 10; i++) {

			if ((i == 1) || (i == 10)) {
				// atribuindo valores no resultado
				resultado += "\n";
				for (int j = 0; j <= 60; j++) {
					// atribuindo valores no resultado
					resultado += "+";
				}

			}

		} // fim primeiro laço

		// exibindo resultado
		System.out.println(resultado);
	}

}
