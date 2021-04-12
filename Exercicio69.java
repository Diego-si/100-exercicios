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
	 * N�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando vari�vel
		int n;

		// recebendo dados do usu�rio
		n = Integer.parseInt(JOptionPane.showInputDialog(
				"Vamos imprimir os n�meros antecessores, para isso informe: " + "\n" + "Digite um n�mero: "));

		// exibindo o resultado escolhido pelo usu�rio e imprimindo os antecessores
		for (int i = 1; i <= n; i++) {
			System.out.println("N�mero: " + i);
		}
	}

}
