package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o codigo o pre�o de 5 produto informa o maior e realizar a
 * media
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class Exercicio83 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as vari�veis
		int codigo;
		double preco, media, soma, maior;

		// iniciando as vari�veis
		maior = 0;
		soma = 0;
		media = 0;
		codigo = -1;

		// iniciando o la�o
		for (int i = 0; i < 5; i++) {
			// recebendo dados do usuario
			codigo = Integer
					.parseInt(JOptionPane.showInputDialog("Digite o codigo do produto que queira passar o seu pre�o: "
							+ "\n" + "Digite o " + (i + 1) + "�" + " c�digo"));

			preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o deste produto: "));

			// verificando o maior pre�o lido
			if (preco > maior) {
				maior = preco;
				codigo++;
			}

			// realizando a soma dos pre�os
			soma += preco;

			// realizando a m�dia aritm�tica
			media = soma / 5;
		} // fim do la�o
			// exibindo dados na tela
		JOptionPane.showMessageDialog(null,
				"Codigo do produto " + (codigo-1) + ", e seu maior pre�o lido: " + maior + "\n" + "A m�dia aritm�tica dos pre�os dos produtos �: " + media);
	}

}
