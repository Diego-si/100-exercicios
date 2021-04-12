package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber do usuario o nome e celular e exibir no console
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class Exercicio06 {

	/*
	 * M�todo principal para exercutar o programa
	 */
	public static void main(String[] args) {

		//declarando variaveis
		String nome;
		String celular;
		String cidade;
		
		//atribuindo dados nas variaveis que o usuario passou
		nome = JOptionPane.showInputDialog("Digite o seu nome:");
		cidade = JOptionPane.showInputDialog("Digite a sua cidade:");
		celular = JOptionPane.showInputDialog("Digite o seu celular:");
		
		//exibindo resultado na tela
		System.out.println("O seu nome �: " + nome);
		System.out.println("A sua cidade �: " + cidade);
		System.out.println("O seu celular �: " + celular);
	}

}
