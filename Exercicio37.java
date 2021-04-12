package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um numero e verificar se e positivo ou negativo
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio37 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando s variavel
		double num;

		// recebendo valor do usuario e atribuindo na variavel
		num = Double.parseDouble(
				JOptionPane.showInputDialog("Para saber se um numero e positivo ou negativo, informe abaixo o valor: "
						+ "\n" + "Digite um numero: "));

		// verificando se o numero e positivo ou negativo
		if (num >= 0) {
			JOptionPane.showMessageDialog(null, "O número e positivo !");
		} else {
			JOptionPane.showMessageDialog(null, "O número e negativo !");
		}
	}

}
