package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 n�meros, e escrever em ordem crescente no vetor
 *
 * @author Diego Almeida da Silva
 * @since 12 de fev. de 2021
 */
public class Exercicio95 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando os vetores
		int numeros[];

		int menor = 0;

		// inicializando o vetor
		numeros = new int[10];

		// iniciando o la�o e recebendo os dados do usuario
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer
					.parseInt(JOptionPane.showInputDialog("Para receber os n�meros em ordem crescente, informe " + "\n"
							+ "Digite o " + (i + 1) + "� n�mero: "));

		}

		// la�o para ordenar os numeros em ordem crescente,
		for (int i = 1; i < numeros.length; i++) {
			for (int j = 0; j < i; j++) { // la�o para armazenar os numeros e ir comparando
				if (numeros[i] < numeros[j]) {
					menor = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = menor;
				}
			}
		}

		// la�o para inprimir todos os numeros em ordem crescente
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
}
