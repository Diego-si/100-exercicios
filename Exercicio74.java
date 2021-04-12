package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e calcular a m�dia aritm�tica
 *
 * @author Diego Almeida da Silva
 * @since 10 de fev. de 2021
 */
public class Exercicio74 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando variaveis
		int valor;
		int cont = 0; //inicializando o contador com 0
		double media;

		// iniciando o la�o
		for (int i = 0; i < 10; i++) { 
			// recebendo valor do usuario
			valor = Integer.parseInt(
					JOptionPane.showInputDialog("Para calcular a m�dia aritm�tica: " + "\n" + "Digite um n�mero: "));
			// a variavel cont esta somando o valor
			cont += valor;
		} // fim do la�o
		media = (double) cont / 10; // calculando a m�dia
		// exibindo a mensagem na tela
		JOptionPane.showMessageDialog(null, "A m�dia aritm�tica �: " + media);
	}

}
