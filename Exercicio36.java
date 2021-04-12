package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um numero e ver se ele e maior ou menor que 10
 *
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio36 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando variaveis
		double num;

		// recebendo dados do usuario e atribuindo na variavel
		num = Double.parseDouble(
				JOptionPane.showInputDialog("Para sabe se um numero e maior ou menor que 10, informe um numero abaixo: "
						+ "\n" + "Digite um número: "));

		// verificando se um número e menor ou maior que 10 e, exibindo na tela
		if (num > 10) {
			JOptionPane.showMessageDialog(null, "É MAIOR QUE 10!");
		} else {
			JOptionPane.showMessageDialog(null, "NÃO É MAIOR QUE 10!");
		}
	}
}