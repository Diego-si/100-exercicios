package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber 3 valores e exibir em order crescente
 * 
 * @author Diego silva
 * @since 09/02/2021
 */
public class Exercicio52 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		double num1, num2, num3, primeiro, terceiro, segundo;

		num1 = Double.parseDouble(
				JOptionPane.showInputDialog("Vamos  ordenar números em ordem crescente, para isso, informe abiaxo: "
						+ "\n" + "Digite o primeiro número: "));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
		num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número: "));

		// verificando qual e o ultimo número
		if (num1 > num2) {
			terceiro = num1;
		} else {
			terceiro = num2;
		}
		if (num3 > terceiro) {
			terceiro = num3;
		}

		// achando o o primeiro número
		if (num1 < num2) {
			primeiro = num1;
		} else {
			primeiro = num2;
		}
		if (num3 < primeiro) {
			primeiro = num3;
		}

		// achando o segundo número
		if (num1 != primeiro) {
			segundo = num1;
		} else if (num2 != terceiro) {
			segundo = num2;
		} else {
			segundo = num3;
		}

		// exibindo msg na tela
		JOptionPane.showMessageDialog(null,
				"Números em order crescente " + primeiro + " - " + segundo + " - " + terceiro);
	}

}
