package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler número de alunos , ler a nota dos alunos, e fazer a média
 * aritmética das notas
 *
 * @author Diego Almeida da Silva
 * @since 10 de fev. de 2021
 */
public class Exercicio75 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variáveis
		int alunos;
		double notas, media, contador = 0;

		// recebendo a quantidade de alunos
		alunos = Integer.parseInt(JOptionPane.showInputDialog("Informe um número de alunos na sala de aula: "));

		// iniciando o laço
		for (int i = 0; i < alunos; i++) {
			//recebendo dados do usuario
			notas = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno " + (i + 1) + " :"));
			//somando as notas dos alunos
			contador += notas;
		}//fim do laço
		//calculando a média aritmética
		media = contador / alunos;

		//exibindo o resultado na tela
		JOptionPane.showMessageDialog(null, "A média aritmética: " + media);
	}

}
