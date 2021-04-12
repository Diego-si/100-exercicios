package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber n�mero de mercadoria, e valores de cada, somar o valor
 * total e a m�dia
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class Exercicio80 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as vari�veis
		int mercadoria;
		double valor, contador, media;

		// inicializando as vari�veis
		contador = 0;
		media = 0;

		// recebendo dados do usu�rio
		mercadoria = Integer.parseInt(
				JOptionPane.showInputDialog("Para realizar o levantamento de todas as mercadoria em estoque, informe: "
						+ "\n" + "Digite a quantidade de mercadorias em estoque: "));

		// iniciando o la�o
		for (int i = 0; i < mercadoria; i++) {
			// recebendo dados do usuario os valores de cada mercadoria
			valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de cada mercadoria: "));

			// realizando a soma dos valores
			contador += valor;

			// realizando a m�dia aritm�tica
			media = contador / mercadoria;
		} // fim do la�o

		// exibindo dados na tela
		JOptionPane.showMessageDialog(null,
				"O valor total em estoque �: " + contador + "\n" + "A m�dia aritm�tica �: " + media);
	}

}
