package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um n�mero de ma�as e calcular o valor comprado
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio38 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		double macas, valor;

		// recebendo dados do usuario e atribuindo na variavel
		macas = Double.parseDouble(
				JOptionPane.showInputDialog("Para saber quanto vai gastar na compra de ma��s, informe abaixo: " + "\n"
						+ "Digite a quantidade de ma��s: "));

		// verificando a quantidade de ma��s e atribuindo o valor de custo para cada
		// quantidade, e exibindo o resultado na tela
		if (macas >= 12) {
			valor = macas * 1.00;
			JOptionPane.showMessageDialog(null, "O valor total da compra �: " + valor);
		} else {
			valor = macas * 1.30;
			JOptionPane.showMessageDialog(null, "O valor total da compra �: " + valor);
		}
	}

}
