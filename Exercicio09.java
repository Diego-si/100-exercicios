package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores e exibir a soma
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class Exercicio09 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		//declarando variaveis
		int valor1, valor2, resultado;
		
		//recebendo dados do usuario e atribuindo as variaveis
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Para somar dois numeros:" + "\n" +
																"Digite o primeiro valor: "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		//realizando o calculo
		resultado = valor1 + valor2;
		
		JOptionPane.showMessageDialog(null, "O resultado da soma é: " + resultado);
	}

}
