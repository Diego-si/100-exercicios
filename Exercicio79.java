package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular a m�dia aritm�tica dos n�meros entre 15 e 100
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class Exercicio79 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as vari�veis
		int cont, soma;
		double media;

		// inicializando as variaveis
		cont = 0;
		soma = 0;
		media = 0;

		// inicando o la�o
		for (int i = 15; i <= 100; i++) {
			// somando o n�meros lidos
			soma += i;
			
			// contando a quantidade de n�meros
			cont++;
			
			// calculando a m�dia aritm�tica
			media = soma / cont;
		} // fim do la�o
			// exibindo dados na tela
		JOptionPane.showMessageDialog(null, "A m�dia aritm�tica �: " + media);
	}

}
