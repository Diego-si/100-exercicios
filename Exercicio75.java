package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler n�mero de alunos , ler a nota dos alunos, e fazer a m�dia
 * aritm�tica das notas
 *
 * @author Diego Almeida da Silva
 * @since 10 de fev. de 2021
 */
public class Exercicio75 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as vari�veis
		int alunos;
		double notas, media, contador = 0;

		// recebendo a quantidade de alunos
		alunos = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero de alunos na sala de aula: "));

		// iniciando o la�o
		for (int i = 0; i < alunos; i++) {
			//recebendo dados do usuario
			notas = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno " + (i + 1) + " :"));
			//somando as notas dos alunos
			contador += notas;
		}//fim do la�o
		//calculando a m�dia aritm�tica
		media = contador / alunos;

		//exibindo o resultado na tela
		JOptionPane.showMessageDialog(null, "A m�dia aritm�tica: " + media);
	}

}
