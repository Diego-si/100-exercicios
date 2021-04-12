package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um número de maças e calcular o valor comprado
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio38 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		double macas, valor;

		// recebendo dados do usuario e atribuindo na variavel
		macas = Double.parseDouble(
				JOptionPane.showInputDialog("Para saber quanto vai gastar na compra de maçãs, informe abaixo: " + "\n"
						+ "Digite a quantidade de maçãs: "));

		// verificando a quantidade de maçãs e atribuindo o valor de custo para cada
		// quantidade, e exibindo o resultado na tela
		if (macas >= 12) {
			valor = macas * 1.00;
			JOptionPane.showMessageDialog(null, "O valor total da compra é: " + valor);
		} else {
			valor = macas * 1.30;
			JOptionPane.showMessageDialog(null, "O valor total da compra é: " + valor);
		}
	}

}
