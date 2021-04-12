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
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		//declarando as variaveis
		double valor1, valor2;
		
		//recebendo dados do usuario e atribuindo nas variaveis
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Para saber qual valor e maior, informe abaixo: " + "\n" + 
																"Digite um número: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		//verificando qual dos numero e maior e exibindo na tela
		if (valor1 > valor2) {
			JOptionPane.showMessageDialog(null, "O maior número é: " + valor1);
		} else {
			JOptionPane.showMessageDialog(null, "O maior número é: " + valor2);
		}
	}

}
