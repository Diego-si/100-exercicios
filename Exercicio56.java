package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dois valores e imprimir uma mensagem, numero ihuais ou
 * primeiro e maior ou segundo e maior
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio56 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando variaveis
		double valor1, valor2;

		// recebendo dados do usuario e atribuindo nas variaveis
		valor1 = Double.parseDouble(JOptionPane
				.showInputDialog("Para saber se números são iguais, ou saber qual e o maior, informe os dados abaixo: "
						+ "\n" + "Digite o primeiro número: "));

		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));

		// verificando as alternativar com base nos valores
		if (valor1 == valor2) {
			JOptionPane.showMessageDialog(null, "Números iguais");
		} else if (valor1 > valor2) {
			JOptionPane.showMessageDialog(null, "Primeiro é maior");
		} else {
			JOptionPane.showMessageDialog(null, "Segundo é maior");
		}
	}

}
