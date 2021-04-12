package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o codigo o preço de 5 produto informa o maior e realizar a
 * media
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class Exercicio83 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variáveis
		int codigo;
		double preco, media, soma, maior;

		// iniciando as variáveis
		maior = 0;
		soma = 0;
		media = 0;
		codigo = -1;

		// iniciando o laço
		for (int i = 0; i < 5; i++) {
			// recebendo dados do usuario
			codigo = Integer
					.parseInt(JOptionPane.showInputDialog("Digite o codigo do produto que queira passar o seu preço: "
							+ "\n" + "Digite o " + (i + 1) + "ª" + " código"));

			preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço deste produto: "));

			// verificando o maior preço lido
			if (preco > maior) {
				maior = preco;
				codigo++;
			}

			// realizando a soma dos preços
			soma += preco;

			// realizando a média aritmética
			media = soma / 5;
		} // fim do laço
			// exibindo dados na tela
		JOptionPane.showMessageDialog(null,
				"Codigo do produto " + (codigo-1) + ", e seu maior preço lido: " + maior + "\n" + "A média aritmética dos preços dos produtos é: " + media);
	}

}
