package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 20 n�meros e armazenar em um vetor, e escrever em ordem
 * inversa
 *
 * @author Diego Almeida da Silva
 * @since 12 de fev. de 2021
 */
public class Exercicio93 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando o vetor
		int numero[];
		int ordem[];

		// inicializando o vetor
		numero = new int[20]; // para receber dados do usuario
		ordem = new int[20]; // para ajudar a colocar em ordem inversa

		// iniciando o la�o
		for (int i = 0; i < numero.length; i++) {
			// recebendo dados do usuario
			numero[i] = Integer
					.parseInt(JOptionPane.showInputDialog("Para verificar n�meros em ordem inversa, informe abaixo: "
							+ "\n" + "Digite o " + (i + 1) + "� n�mero: "));
		} // fim do la�o que recebe dados do usuario

		// la�o para colocar os dados em ordem inversa
		for (int i = ordem.length - 1; i >= 0; i--) {
			ordem[i] += numero[i];
			// imprimindo os dados na tela
			System.out.println(ordem[i]);
		} // fim do la�o que coloca os dados em ordem inversa

	}

}
