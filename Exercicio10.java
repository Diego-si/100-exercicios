package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores e exibir a subtra��o
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class Exercicio10 {

	/* 
	 * M�todo principal para executar o programa 
	 */
	public static void main(String[] args) {

		//declarando variaveis
		int num1, num2, resultado;
		
		//atribuindo valores as variaveis que o usuario vai passar
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Para realizar uma subtra��o:" + "\n" +
															"Digite o primeiro numero:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:"));
		
		//realizando os calculos
		resultado = num1 - num2;
		
		//exibindo resultado na tela
		JOptionPane.showMessageDialog(null, "O resultado da subtra��o �: " + resultado);
	}

}
