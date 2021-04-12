package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber do usuario idade, altura e peso e exibir na tela
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class Exercicio07 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		//declarando variaveis
		int idade;
		double altura, peso;
		
		//atribuindo dados nas variaveis que o usuario vai passar
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso:"));
		
		//exibindo resultado na tela
		System.out.println("Sua idade é: " + idade);
		System.out.println("Sua altuda é: " + altura);
		System.out.println("Seu peso é: " + peso);
	}

}
