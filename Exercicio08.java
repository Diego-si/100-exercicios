package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber salário e vale- refeição e exibir no console
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class Exercicio08 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		//declarando as variaveis
		double salario, valeRefeicao;
		
		//atribuindo valores as variaveis que o usuario vai passar
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário:"));
		valeRefeicao = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu vale-refeição:"));
		
		//exibindo resultado no console
		System.out.println("O seu salário é: " + salario);
		System.out.println("O seu vale-refeição é: " + valeRefeicao);
	}

}
