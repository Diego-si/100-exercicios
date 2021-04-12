package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler uma quantidade depois apresentar o maio numero e a media de
 * todos
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class Exercicio82 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as vari�veis
		int soma, maior, quantidade, numero;
		double media;

		// inicializando as variaveis
		maior = 0;
		soma = 0;
		media = 0;

		// recebendo dados do usuario
		quantidade = Integer.parseInt(
				JOptionPane.showInputDialog("Digite uma quantidade de n�mero para realizar sua m�dia aritm�tica:"));

		// iniciando o la�o
		for (int i = 0; i < quantidade; i++) {
			// recebendo dados do usu�rio
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "�" + " n�mero"));

			// verificando o maior deles
			if (numero > maior) {
				maior = numero;
			}

			// somando os numero
			soma += numero;

			// realizando a m�dia
			media = soma / quantidade;
		} // fim do la�o
			// exebindo dados na tela
		JOptionPane.showMessageDialog(null, "O maior n�mero �: " + maior + "\n" + "A m�dia aritm�tica �: " + media);
	}

}
