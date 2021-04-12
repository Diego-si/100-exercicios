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
	 * Método principal para exercutar o programa
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
		System.out.println("O seu nome é: " + nome);
		System.out.println("A sua cidade é: " + cidade);
		System.out.println("O seu celular é: " + celular);
	}

}
