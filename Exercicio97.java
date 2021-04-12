package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler vetor de 20 numeros, ler mais um n�mero e verificar se esta
 * no vetor,
 *
 * @author Diego Almeida da Silva
 * @since 15 de fev. de 2021
 */
public class Exercicio97 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando os vetores
		int numeros[];
		int novo[];

		// declarando as vari�veis
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

		// iniciando o la�o e recebendo os dados do usuario
		for (int i = 0; i < tamanho; i++) {

			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(
					"Para alguns teste, informe abaixo: " + "\n" + "Digite o " + (i + 1) + "� n�mero: "));

		}

		// (Considere que n�o haver� n�meros repetidos no vetor)
		// la�o para verificar se existe numero repetido.
		for (int i = 0; i < tamanho - 1; i++) {
			for (int j = i + 1; j < tamanho; j++) {
				while (numeros[j] == numeros[i]) {

					numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("O n�mero " + numeros[j] + " se repete \n"
							+ "Digite novamente o " + (j + 1) + "� n�mero: "));
				}
			}
		}

		// recebendo o dado do usuario, dado para verificar se tem outro igual
		existe = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero para buscar: "));

		// la�o para imprimir o numeros existentes em um novo vetor
		for (int i = 0; i < novo.length; i++) {
			// e apresenta novo vetor sem o numero existente
			if (numeros[i] != existe) {
				novo[i] += numeros[i];
				System.out.println("N�meros existentes " + novo[i]);
			}
		}

		// la�o para verificar se o numero for igual ao numero existente
		for (int j = 0; j < numeros.length; j++) {
			if (numeros[j] == existe) {
				exi = true; // para tratar esta condi��o la na frente
				System.out.println("N�mero " + existe + " existe no programa\n");
			}

			// outra op��o
			/*
			 * else if (numeros[j] == novo.length - 1) { System.out.println("N�mero " +
			 * existe + " n�o esta no programa\n"); }
			 */
		}
		// se n�o tiver numero existente na busca cai nesta condi��o
		if (exi == false) { // tratando a condi��o
			System.out.println("N�mero " + existe + " n�o esta no programa\n");
		}

	}
}
