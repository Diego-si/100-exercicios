package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 3 valores e informa se forman um triângulo
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio54 {

	/*
	 * Método principal para executar a classa
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		double a, b, c;

		// recebendo do ususario alguns dados
		a = Double.parseDouble(JOptionPane
				.showInputDialog("Vamos verificar se os números formam um triângulo, para isso, informe abiaxo: " + "\n"
						+ "Digite o primeiro número: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número: "));

		// pegando os valores, e exibindo na tela
		if ((a < b + c) || (b < a + c) || (c < a + b)) {
			JOptionPane.showMessageDialog(null, "Formam um triângulo");
		} else {
			JOptionPane.showMessageDialog(null, "Não formam um triângulo");
		}
	}

}
