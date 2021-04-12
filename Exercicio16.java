package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dimens�es e calcular a area do ret�ngulo
 * 
 * @author Diego Silva
 *
 */
public class Exercicio16 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		//atribuindo variaveis
		double area, altura, base;
		
		//atribuindo valores que o usuario passar para as variaveis
		altura = Double.parseDouble(JOptionPane.showInputDialog("Para calcular a �rea do ret�ngulo informe:" + "\n" +
																"Digite a altura:"));
		base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base:"));
		
		//realizando o calculo
		area = altura * base;
		
		//exibindo os valores na tela
		JOptionPane.showMessageDialog(null, "O valor da �rea do ret�ngulo �: " + area);
	}

}
