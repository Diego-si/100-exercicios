package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para armazenar 20 numeros , somente positivos, e encontra o menor e
 * sua posi��o
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class Exercicio91 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando o vetor
		int vetor[];

		// inicializando o vetor
		vetor = new int[20];

		// declarando varivais
		int menor;

		// iniciando a variavel menor
		menor = 1000000000;

		// iniciando o la�o e recebendo os valores do usuario
		for (int i = 0; i < vetor.length; i++) {
			// verificando se o numero e positivo
			do {
				vetor[i] = Integer.parseInt(JOptionPane
						.showInputDialog("Para saber qual o menor valor e sua posi��o, informe alguns valores abaixo"
								+ "\n" + "Digite o " + (i + 1) + "� n�mero: "));
			} while (vetor[i] < 0); // fim da verificando se o n�mero e positivo

			// encontrando o menor valor
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}

		// la�o para achar a posi��o do menor numero
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == menor) {
				// imprimindo o resultado na tela
				JOptionPane.showMessageDialog(null, "O menor �: " + menor + "\n" + "Esta na posi��o: " + i);
			}
		} // fim do la�o para achar a posi��o do menor valor
	}

}
