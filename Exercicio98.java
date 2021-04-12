package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dois vetores e contar quantas vezes os dois possuem numeros
 * iguais na mesma posição
 *
 * @author Diego Almeida da Silva
 * @since 15 de fev. de 2021
 */
public class Exercicio98 {

	/*
	 * Método principal para executar a classe
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

		// laço para receber os dados do usuario
		for (int i = 0; i < tamanho; i++) {
			V1[i] = Integer.parseInt(
					JOptionPane.showInputDialog("Informe dados para verificar se seus numeros e posições são iguais: "
							+ "\n" + "Informe a " + (i + 1) + "ª sequencia dos primeiros número: "));

			V2[i] = Integer.parseInt(
					JOptionPane.showInputDialog("Informe a " + (i + 1) + "ª sequencia dos segundos número: "));

		}

		// laços para verificar em qual posição os números se repetem
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				if ((V1[i] == V2[j] && i == j)) {
					cont++; // fazendo a soma das posições
					// posições que os numeros se repetem
					/*
					 * System.out.println("Número V1 " + V1[i] + " Posição " + i + "\nNúmero V2 " +
					 * V2[j] + " Posição " + j + "\n");
					 */
				}
			}
		}
		// exibindo o resultado na tela
		System.out.println("A quantidade de vezes que V1 e V2 " + "\n" + "possuem os mesmos números e " + "\n"
				+ "nas mesmas posições é: " + cont);
	}

}
