package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 n�meros, depois ler mais um n�mero e verificar quantas vezes ele aparece no vetor
 *
 * @author Diego Almeida da Silva
 * @since 15 de fev. de 2021
 */
public class Exercicio99 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando os vetores e atribuindo o seu valor
		int[] numero = new int[10];

		// declarando variaveis
		int mais;
		int cont = 0;

		// iniciando o la�o para receber os dados do usuario
		for (int i = 0; i < numero.length; i++) {
			numero[i] = Integer
					.parseInt(JOptionPane.showInputDialog("Informe alguns n�meros para fazer algumas verifica��es"
							+ "\n" + "Digite o " + (i + 1) + "� n�mero: "));
		}

		mais = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero que deseja verificar: "));

		// la�o para verificar a existencia do n�mero
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] == mais) {
				cont++;
			}
		}

		// exibindo os dados na tela
		System.out.println("O n�mero de vezes que o n�mero " + mais + " \naparece no vetor �: " + cont);
	}

}
