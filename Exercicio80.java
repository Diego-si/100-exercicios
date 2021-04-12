package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber número de mercadoria, e valores de cada, somar o valor
 * total e a média
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class Exercicio80 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variáveis
		int mercadoria;
		double valor, contador, media;

		// inicializando as variáveis
		contador = 0;
		media = 0;

		// recebendo dados do usuário
		mercadoria = Integer.parseInt(
				JOptionPane.showInputDialog("Para realizar o levantamento de todas as mercadoria em estoque, informe: "
						+ "\n" + "Digite a quantidade de mercadorias em estoque: "));

		// iniciando o laço
		for (int i = 0; i < mercadoria; i++) {
			// recebendo dados do usuario os valores de cada mercadoria
			valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de cada mercadoria: "));

			// realizando a soma dos valores
			contador += valor;

			// realizando a média aritmética
			media = contador / mercadoria;
		} // fim do laço

		// exibindo dados na tela
		JOptionPane.showMessageDialog(null,
				"O valor total em estoque é: " + contador + "\n" + "A média aritmética é: " + media);
	}

}
