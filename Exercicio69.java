package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um valor N e imprimir todos os anteriores
 *
 * @author Diego Almeida da Silva
 * @since 10 de fev. de 2021
 */
public class Exercicio69 {

	/*
	 * Nétodo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando variável
		int n;

		// recebendo dados do usuário
		n = Integer.parseInt(JOptionPane.showInputDialog(
				"Vamos imprimir os números antecessores, para isso informe: " + "\n" + "Digite um número: "));

		// exibindo o resultado escolhido pelo usuário e imprimindo os antecessores
		for (int i = 1; i <= n; i++) {
			System.out.println("Número: " + i);
		}
	}

}
