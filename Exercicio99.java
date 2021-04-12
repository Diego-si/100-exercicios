package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 números, depois ler mais um número e verificar quantas vezes ele aparece no vetor
 *
 * @author Diego Almeida da Silva
 * @since 15 de fev. de 2021
 */
public class Exercicio99 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando os vetores e atribuindo o seu valor
		int[] numero = new int[10];

		// declarando variaveis
		int mais;
		int cont = 0;

		// iniciando o laço para receber os dados do usuario
		for (int i = 0; i < numero.length; i++) {
			numero[i] = Integer
					.parseInt(JOptionPane.showInputDialog("Informe alguns números para fazer algumas verificações"
							+ "\n" + "Digite o " + (i + 1) + "º número: "));
		}

		mais = Integer.parseInt(JOptionPane.showInputDialog("Informe o número que deseja verificar: "));

		// laço para verificar a existencia do número
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] == mais) {
				cont++;
			}
		}

		// exibindo os dados na tela
		System.out.println("O número de vezes que o número " + mais + " \naparece no vetor é: " + cont);
	}

}
