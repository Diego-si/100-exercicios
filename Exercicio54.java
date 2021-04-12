package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 3 valores e informa se forman um tri�ngulo
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio54 {

	/*
	 * M�todo principal para executar a classa
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		double a, b, c;

		// recebendo do ususario alguns dados
		a = Double.parseDouble(JOptionPane
				.showInputDialog("Vamos verificar se os n�meros formam um tri�ngulo, para isso, informe abiaxo: " + "\n"
						+ "Digite o primeiro n�mero: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro n�mero: "));

		// pegando os valores, e exibindo na tela
		if ((a < b + c) || (b < a + c) || (c < a + b)) {
			JOptionPane.showMessageDialog(null, "Formam um tri�ngulo");
		} else {
			JOptionPane.showMessageDialog(null, "N�o formam um tri�ngulo");
		}
	}

}
