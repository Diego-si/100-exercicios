package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber sal�rio e vale- refei��o e exibir no console
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class Exercicio08 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		//declarando as variaveis
		double salario, valeRefeicao;
		
		//atribuindo valores as variaveis que o usuario vai passar
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu sal�rio:"));
		valeRefeicao = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu vale-refei��o:"));
		
		//exibindo resultado no console
		System.out.println("O seu sal�rio �: " + salario);
		System.out.println("O seu vale-refei��o �: " + valeRefeicao);
	}

}
