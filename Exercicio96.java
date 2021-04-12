package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 n�meros, e escrever em ordem crescente no vetor, logo
 * depois acrescentar mais um n�mero e ordena no vetor
 *
 * @author Diego Almeida da Silva
 * @since 12 de fev. de 2021
 */
public class Exercicio96 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando os vetores
		int numeros[];

		// declarando vari�veis
		int aux = 0;
		int menor = 0;

		// inicializando o vetor
		numeros = new int[11];

		// iniciando o la�o e recebendo os dados do usuario
		for (int i = 0; i < 10; i++) {
			numeros[i] = Integer
					.parseInt(JOptionPane.showInputDialog("Para receber os n�meros em ordem crescente, informe " + "\n"
							+ "Digite o " + (i + 1) + "� n�mero: "));

		}

		// la�o para ordenar os numeros em ordem crescente,
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < i; j++) { // la�o para armazenar os numeros e ir comparando
				if (numeros[i] < numeros[j]) {
					menor = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = menor;
				}
			}
		}

		// recebendo os dados do usuario
		aux = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um n�mero: "));

		// la�o para verificar se tem algum espa�o e adicionar mais um dado,
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == 0) { // se tiver algum espa�o com 0
				numeros[i] = aux; // adicionando mais um dado
				break;
			}
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
