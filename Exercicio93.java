package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 20 números e armazenar em um vetor, e escrever em ordem
 * inversa
 *
 * @author Diego Almeida da Silva
 * @since 12 de fev. de 2021
 */
public class Exercicio93 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando o vetor
		int numero[];
		int ordem[];

		// inicializando o vetor
		numero = new int[20]; // para receber dados do usuario
		ordem = new int[20]; // para ajudar a colocar em ordem inversa

		// iniciando o laço
		for (int i = 0; i < numero.length; i++) {
			// recebendo dados do usuario
			numero[i] = Integer
					.parseInt(JOptionPane.showInputDialog("Para verificar números em ordem inversa, informe abaixo: "
							+ "\n" + "Digite o " + (i + 1) + "ª número: "));
		} // fim do laço que recebe dados do usuario

		// laço para colocar os dados em ordem inversa
		for (int i = ordem.length - 1; i >= 0; i--) {
			ordem[i] += numero[i];
			// imprimindo os dados na tela
			System.out.println(ordem[i]);
		} // fim do laço que coloca os dados em ordem inversa

	}

}
