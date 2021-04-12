package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para atribuir valor a variavel e mostra o modulo entre eles
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class Exercicio14 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		//atribuindo as variaveis
		double modulo;
		
		//recenbendo os valores
		modulo = 5 % 2;
		
		//exibindo os valores na tela
		JOptionPane.showMessageDialog(null, "O resultado do módulo de 5 e 2 é : " + modulo);
	}

}
