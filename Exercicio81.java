package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e informa o maior e o menor
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class Exercicio81 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as vari�veis
		int numero;
		int maior, menor;

		// inicializando variaveis
		maior = 0;
		menor = 100000000; // pode ser maior que o valor que o usuario digita

		// iniciando o la�o
		for (int i = 0; i < 10; i++) {
			// recebendo dados do usuario
			numero = Integer
					.parseInt(JOptionPane.showInputDialog("Para saber quais s�o os n�meros maiores e menores, informe: "
							+ "\n" + "Digite o " + (i + 1) + "�" + " n�mero"));

			// verificando o maior
			if (numero > maior) {
				maior = numero;
			}
			// verificando o menor
			if (numero < menor) {
				menor = numero;
			}
		} // fim do la�o

		// exibindo dados em tela
		JOptionPane.showMessageDialog(null, "O maior n�mero �: " + maior + "\n" + "O menor n�mero �: " + menor);
	}

}
