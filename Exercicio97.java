package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler vetor de 20 numeros, ler mais um número e verificar se esta
 * no vetor,
 *
 * @author Diego Almeida da Silva
 * @since 15 de fev. de 2021
 */
public class Exercicio97 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando os vetores
		int numeros[];
		int novo[];

		// declarando as variáveis
		int existe;
		int tamanho;
		int tam;
		boolean exi = false;

		// inicializado a variavel
		tamanho = 3;
		tam = 3;

		// iniciazando o vetor
		numeros = new int[tamanho];
		novo = new int[tam];

		// iniciando o laço e recebendo os dados do usuario
		for (int i = 0; i < tamanho; i++) {

			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(
					"Para alguns teste, informe abaixo: " + "\n" + "Digite o " + (i + 1) + "º número: "));

		}

		// (Considere que não haverá números repetidos no vetor)
		// laço para verificar se existe numero repetido.
		for (int i = 0; i < tamanho - 1; i++) {
			for (int j = i + 1; j < tamanho; j++) {
				while (numeros[j] == numeros[i]) {

					numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("O número " + numeros[j] + " se repete \n"
							+ "Digite novamente o " + (j + 1) + "º número: "));
				}
			}
		}

		// recebendo o dado do usuario, dado para verificar se tem outro igual
		existe = Integer.parseInt(JOptionPane.showInputDialog("Informe um número para buscar: "));

		// laço para imprimir o numeros existentes em um novo vetor
		for (int i = 0; i < novo.length; i++) {
			// e apresenta novo vetor sem o numero existente
			if (numeros[i] != existe) {
				novo[i] += numeros[i];
				System.out.println("Números existentes " + novo[i]);
			}
		}

		// laço para verificar se o numero for igual ao numero existente
		for (int j = 0; j < numeros.length; j++) {
			if (numeros[j] == existe) {
				exi = true; // para tratar esta condição la na frente
				System.out.println("Número " + existe + " existe no programa\n");
			}

			// outra opção
			/*
			 * else if (numeros[j] == novo.length - 1) { System.out.println("Número " +
			 * existe + " não esta no programa\n"); }
			 */
		}
		// se não tiver numero existente na busca cai nesta condição
		if (exi == false) { // tratando a condição
			System.out.println("Número " + existe + " não esta no programa\n");
		}

	}
}
