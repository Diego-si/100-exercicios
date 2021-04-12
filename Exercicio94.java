package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um valor, armazenar em vetores a e b , e realizar a soma
 *
 * @author Diego Almeida da Silva
 * @since 12 de fev. de 2021
 */
public class Exercicio94 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando o vetor
		int a[], b[], soma[];

		//declarando a variavel de tamanho
		int tamanho;
		
		tamanho = Integer
				.parseInt(JOptionPane.showInputDialog("Informe um valor que será usado para realizar os calculos: "));

		// inicializando a os vetores
		a = new int[tamanho];
		b = new int[tamanho];
		soma = new int[tamanho];

		// inicializando o vetor A e recebendo os dados do usuario
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer
					.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "ª número da primeira soma: "));
		}

		// inicializando o vetor B e recebendo os dados do usuario
		for (int i = 0; i < b.length; i++) {
			b[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "ª número da segunda soma: "));
		}

		// inicializando o vetor de soma
		for (int i = 0; i < soma.length; i++) {
			soma[i] += a[i] + b[i];

			// exibindo o resultado da soma do vetor A e B 
			System.out.println("A soma de " + a[i] + " + " + b[i] + " = " + soma[i]);
		}

	}

}
