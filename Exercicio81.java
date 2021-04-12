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
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variáveis
		int numero;
		int maior, menor;

		// inicializando variaveis
		maior = 0;
		menor = 100000000; // pode ser maior que o valor que o usuario digita

		// iniciando o laço
		for (int i = 0; i < 10; i++) {
			// recebendo dados do usuario
			numero = Integer
					.parseInt(JOptionPane.showInputDialog("Para saber quais são os números maiores e menores, informe: "
							+ "\n" + "Digite o " + (i + 1) + "ª" + " número"));

			// verificando o maior
			if (numero > maior) {
				maior = numero;
			}
			// verificando o menor
			if (numero < menor) {
				menor = numero;
			}
		} // fim do laço

		// exibindo dados em tela
		JOptionPane.showMessageDialog(null, "O maior número é: " + maior + "\n" + "O menor número é: " + menor);
	}

}
