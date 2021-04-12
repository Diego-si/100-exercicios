package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dimensões e calcular a area do retângulo
 * 
 * @author Diego Silva
 *
 */
public class Exercicio16 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		//atribuindo variaveis
		double area, altura, base;
		
		//atribuindo valores que o usuario passar para as variaveis
		altura = Double.parseDouble(JOptionPane.showInputDialog("Para calcular a área do retângulo informe:" + "\n" +
																"Digite a altura:"));
		base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base:"));
		
		//realizando o calculo
		area = altura * base;
		
		//exibindo os valores na tela
		JOptionPane.showMessageDialog(null, "O valor da área do retângulo é: " + area);
	}

}
