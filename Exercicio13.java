package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber um ou dois valores e exibir sua exponencia��o
 * 
 * @author Diego Silva
 *
 */
public class Exercicio13 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		//atribuindo variaveis
		double valor, resultado;
		
		//atribuindo valor a variavel
		valor = 6;
		
		//realizando a exponencia��o
		resultado = Math.pow(valor, valor);
		
		//exibindo o resultado na tela
		JOptionPane.showMessageDialog(null, "A exponencia��o de " + valor + " � " + resultado);
	}

}
