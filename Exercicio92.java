package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um vetor A, ler um numero X, multiplicar A * X , e
 * armazenar em M
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class Exercicio92 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando o vetor
		int a[], m[];

		// inicializando o vetor
		a = new int[10];
		m = new int[10];

		// declarando variavel
		int x;

		// iniciando o la�o e recebendo dados do usuario
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(JOptionPane
					.showInputDialog("Digite abaixo alguns valores para realizar suas algumas multiplica��es " + "\n"
							+ "Digite o " + (i + 1) + "� n�mero:"));
		}

		// recebendo dados do usuario
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero para realizar a multiplica��o: "));

		// la�o para realizar a multiplica��o dos numeros do vetor a , pela variavel x
		for (int i = 0; i < m.length; i++) {
			m[i] = a[i] * x;
			// imprimindo o resultado na tela
			System.out.println("O resultado das multiplica��es de " + a[i] + " x " + x + " = " + m[i]);
		}

	}

}
