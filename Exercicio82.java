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
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variáveis
		int soma, maior, quantidade, numero;
		double media;

		// inicializando as variaveis
		maior = 0;
		soma = 0;
		media = 0;

		// recebendo dados do usuario
		quantidade = Integer.parseInt(
				JOptionPane.showInputDialog("Digite uma quantidade de número para realizar sua média aritmética:"));

		// iniciando o laço
		for (int i = 0; i < quantidade; i++) {
			// recebendo dados do usuário
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "ª" + " número"));

			// verificando o maior deles
			if (numero > maior) {
				maior = numero;
			}

			// somando os numero
			soma += numero;

			// realizando a média
			media = soma / quantidade;
		} // fim do laço
			// exebindo dados na tela
		JOptionPane.showMessageDialog(null, "O maior número é: " + maior + "\n" + "A média aritmética é: " + media);
	}

}
