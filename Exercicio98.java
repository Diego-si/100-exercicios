package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dois vetores e contar quantas vezes os dois possuem numeros
 * iguais na mesma posi��o
 *
 * @author Diego Almeida da Silva
 * @since 15 de fev. de 2021
 */
public class Exercicio98 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando os vetores
		int V1[];
		int V2[];

		// declarando variaveis
		int cont = 0;

		// tamanho do vetor
		int tamanho = 15;

		// iniciando os vetores
		V1 = new int[tamanho];
		V2 = new int[tamanho];

		// la�o para receber os dados do usuario
		for (int i = 0; i < tamanho; i++) {
			V1[i] = Integer.parseInt(
					JOptionPane.showInputDialog("Informe dados para verificar se seus numeros e posi��es s�o iguais: "
							+ "\n" + "Informe a " + (i + 1) + "� sequencia dos primeiros n�mero: "));

			V2[i] = Integer.parseInt(
					JOptionPane.showInputDialog("Informe a " + (i + 1) + "� sequencia dos segundos n�mero: "));

		}

		// la�os para verificar em qual posi��o os n�meros se repetem
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				if ((V1[i] == V2[j] && i == j)) {
					cont++; // fazendo a soma das posi��es
					// posi��es que os numeros se repetem
					/*
					 * System.out.println("N�mero V1 " + V1[i] + " Posi��o " + i + "\nN�mero V2 " +
					 * V2[j] + " Posi��o " + j + "\n");
					 */
				}
			}
		}
		// exibindo o resultado na tela
		System.out.println("A quantidade de vezes que V1 e V2 " + "\n" + "possuem os mesmos n�meros e " + "\n"
				+ "nas mesmas posi��es �: " + cont);
	}

}
