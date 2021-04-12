package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 números, e escrever em ordem crescente no vetor
 *
 * @author Diego Almeida da Silva
 * @since 12 de fev. de 2021
 */
public class Exercicio95 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando os vetores
		int numeros[];

		int menor = 0;

		// inicializando o vetor
		numeros = new int[10];

		// iniciando o laço e recebendo os dados do usuario
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer
					.parseInt(JOptionPane.showInputDialog("Para receber os números em ordem crescente, informe " + "\n"
							+ "Digite o " + (i + 1) + "ª número: "));

		}

		// laço para ordenar os numeros em ordem crescente,
		for (int i = 1; i < numeros.length; i++) {
			for (int j = 0; j < i; j++) { // laço para armazenar os numeros e ir comparando
				if (numeros[i] < numeros[j]) {
					menor = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = menor;
				}
			}
		}

		// laço para inprimir todos os numeros em ordem crescente
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
}
