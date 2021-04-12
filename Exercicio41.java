package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa ppara ler dois valores e escrever o maior deles
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio41 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		//declarando as variaveis
		double valor1, valor2;
		
		//recebendo dados do usuario e atribuindo nas variaveis
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Para saber qual valor e maior, informe abaixo: " + "\n" + 
																"Digite um n�mero: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
		
		//verificando qual dos numero e maior e exibindo na tela
		if (valor1 > valor2) {
			JOptionPane.showMessageDialog(null, "O maior n�mero �: " + valor1);
		} else {
			JOptionPane.showMessageDialog(null, "O maior n�mero �: " + valor2);
		}
	}

}
