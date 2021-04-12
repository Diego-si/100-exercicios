package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular a média aritmética dos números entre 15 e 100
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class Exercicio79 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variáveis
		int cont, soma;
		double media;

		// inicializando as variaveis
		cont = 0;
		soma = 0;
		media = 0;

		// inicando o laço
		for (int i = 15; i <= 100; i++) {
			// somando o números lidos
			soma += i;
			
			// contando a quantidade de números
			cont++;
			
			// calculando a média aritmética
			media = soma / cont;
		} // fim do laço
			// exibindo dados na tela
		JOptionPane.showMessageDialog(null, "A média aritmética é: " + media);
	}

}
