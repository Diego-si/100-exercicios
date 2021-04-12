package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e calcular a média aritmética
 *
 * @author Diego Almeida da Silva
 * @since 10 de fev. de 2021
 */
public class Exercicio74 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando variaveis
		int valor;
		int cont = 0; //inicializando o contador com 0
		double media;

		// iniciando o laço
		for (int i = 0; i < 10; i++) { 
			// recebendo valor do usuario
			valor = Integer.parseInt(
					JOptionPane.showInputDialog("Para calcular a média aritmética: " + "\n" + "Digite um número: "));
			// a variavel cont esta somando o valor
			cont += valor;
		} // fim do laço
		media = (double) cont / 10; // calculando a média
		// exibindo a mensagem na tela
		JOptionPane.showMessageDialog(null, "A média aritmética é: " + media);
	}

}
