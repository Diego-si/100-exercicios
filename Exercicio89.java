package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler notas de 20 alunos , calcular a media e informa quantos
 * alunos obtiveram a media
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class Exercicio89 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando um vetor
		double notas[];

		// declarando as variaveis
		double media;
		double soma;
		int contador;

		// inicializando o vetor notas
		notas = new double[20];

		// iniciando variaveis
		media = 0;
		soma = 0;
		contador = 0;

		// iniciando o for e recebendo os dados do usuario
		for (int i = 0; i < notas.length; i++) {
			notas[i] = Double.parseDouble(
					JOptionPane.showInputDialog("Informe as notas dos alunos para saber quantos passaram na média: "
							+ "\n" + "Informe o " + (i+1) + "ª aluno: "));

			// realizando a media
			soma += notas[i]; // somando as notas
			media = soma / 20; // obtendo a media

			if (notas[i] > media) { // verificando os alunos que tiraram notas acima da media
				contador++; // realizando a contagem dos alunos acima da media
			}
		} //fim do laço
		// exibindo o resultado
		JOptionPane.showMessageDialog(null, "A média da turma é: " + media + "\n"
				+ "A quantidade de alunos que obtiveram nota acima da média é: " + contador);

	}

}
