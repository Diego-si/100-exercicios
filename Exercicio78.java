package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 2 valores calcular e escrever a soma dos inteiros
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class Exercicio78 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as vari�veis
		int num1, num2;
		int contador;

		// inicializando o contador
		contador = 0;

		// iniciando a variavel num2
		num2 = -1;

		// recebendo dados do usu�rio
		num1 = Integer.parseInt(JOptionPane.showInputDialog(
				"Para realizar a soma dos valores entre dois n�mero, informe" + "\n" + "Digite o primeiro n�mero: "));

		// verificando se o num2 e menor que o num1, caso for ele continua a pedir o
		// segundo valor
		while (num2 < num1) {
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
		}

		// iniciando o la�o
		for (int i = num1; i <= num2; i++) {
			contador += i; // realizando a soma dos n�meros
		} // fim do la�o

		// exibindo dados na tela
		JOptionPane.showMessageDialog(null, "A soma dos n�meros entre " + num1 + " e " + num2 + " �: " + contador);
	}

}
