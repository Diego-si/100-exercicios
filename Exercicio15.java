package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um valor e mostrar o seu antecessor
 * 
 * @author Diego Silva
 *
 */
public class Exercicio15 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		//atribuindo variaveis
		int valor, resultado;
		
		//atribuindo valor que o usuario passar para a variavel
		valor = Integer.parseInt(JOptionPane.showInputDialog("Para saber o antecessor de um numero digite: " + "\n" +
															"Inform um numero:"));
		
		//realizando os calculos
		resultado = valor - 1;
		
		//exibindo na tela o resultado
		JOptionPane.showMessageDialog(null, "O antecessor de " + valor + " é " + resultado);
	}

}
