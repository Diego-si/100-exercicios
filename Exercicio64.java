package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dois valores e exibir o resultado da divisao dos dois
 * 
 * @author Diego Silva
 * @since 10/02/2021
 */
public class Exercicio64 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando variáveis
		double valor1, valor2;

		// recebendo o primeiro valor do usuario
		valor1 = Double.parseDouble(JOptionPane.showInputDialog(
				"Para saber o valor da divisão de dois número, informe: " + "\n" + "Digite o primeiro número: "));

		// iniciando a variável valor2
		valor2 = 0;

		// recebendo o segundo valor do usuario, o valor tem que ser diferente de zero
		while (valor2 == 0) {
			valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
		}

		// exibindo o resultado na tela
		JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + (valor1 / valor2));
	}

}
