package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para imprimir a tabuada do 8
 *
 * @author Diego Almeida da Silva
 * @since 10 de fev. de 2021
 */
public class Exercicio70 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando variaveis
		String resultado;
		int tabuada;

		// atribuindo cabeçalho na variável
		resultado = "Tabuada do 8\n";

		// laço pra calcular a tabuada
		for (int i = 0; i < 11; i++) {
			// calculando o valor so resultado
			tabuada = 8 * i;
			resultado += "8 x " + i + " = " + tabuada + "\n";
		}

		// exibindo o resultado da tabuada
		JOptionPane.showMessageDialog(null, resultado);
	}

}
