package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para armazenar 20 numeros , somente positivos, e encontra o maior e sua posição
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class Exercicio90 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando o vetor
		int vetor[];

		// inicializando o vetor
		vetor = new int[20];

		// declarando varivais
		int maior;

		// iniciando a variavel maior
		maior = 0;

		// inciando o laço e recebendo o valor do usuario
		for (int i = 0; i < vetor.length; i++) {
			// verificando se o número e positivo
			do {
				vetor[i] = Integer.parseInt(JOptionPane
						.showInputDialog("Para saber qual o maior valor e sua posição, informe alguns valores abaixo"
								+ "\n" + "Digite o " + (i + 1) + "ª número: "));
			} while (vetor[i] < 0); // fim da verificando se o número e positivo

			// encontrando o maior valor
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}

		// laço para acha a posicao do maior numero
		// verificando se em que posição do vetor o numero maior esta
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == maior) {
				// imprimindo o resultado na tela
				JOptionPane.showMessageDialog(null, "O maior é: " + maior + "\n" + "Esta na posição: " + i);
			}
		} // fim do laço para acha a posicao do maior numero
	}

}
