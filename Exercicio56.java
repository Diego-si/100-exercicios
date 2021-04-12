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
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando variaveis
		double valor1, valor2;

		// recebendo dados do usuario e atribuindo nas variaveis
		valor1 = Double.parseDouble(JOptionPane
				.showInputDialog("Para saber se n�meros s�o iguais, ou saber qual e o maior, informe os dados abaixo: "
						+ "\n" + "Digite o primeiro n�mero: "));

		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo n�mero: "));

		// verificando as alternativar com base nos valores
		if (valor1 == valor2) {
			JOptionPane.showMessageDialog(null, "N�meros iguais");
		} else if (valor1 > valor2) {
			JOptionPane.showMessageDialog(null, "Primeiro � maior");
		} else {
			JOptionPane.showMessageDialog(null, "Segundo � maior");
		}
	}

}
