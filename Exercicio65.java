package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler notas de um aluno e imprimir a média
 * 
 * @author Diego Silva
 * @since 10/02/2021
 */
public class Exercicio65 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando variáveis
		int nota1, nota2;
		double media;
		
		//inicializando as variaveis
		nota1 = -1;
		nota2 = -1;
		
		//recebendo notas do aluno, somente valores entre 0 e 10
		while ((nota1 < 0 ) || (nota1 > 10)) {
			nota1 = Integer.parseInt(JOptionPane.showInputDialog("Para calcular a média nas avaliações, informe:" + "\n" + 
																   "Digite sua primeira nota: "));
		}
		while ((nota2 < 0 ) || (nota2 > 10)) {
			nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua segunda nota: "));
		}
		
		//verificando a média
		media = (nota1 + nota2) / 2;
		
		//exibindo resultado na tela
		JOptionPane.showMessageDialog(null, "A sua média é: " + media);
	}

}
