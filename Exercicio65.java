package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler notas de um aluno e imprimir a m�dia
 * 
 * @author Diego Silva
 * @since 10/02/2021
 */
public class Exercicio65 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando vari�veis
		int nota1, nota2;
		double media;
		
		//inicializando as variaveis
		nota1 = -1;
		nota2 = -1;
		
		//recebendo notas do aluno, somente valores entre 0 e 10
		while ((nota1 < 0 ) || (nota1 > 10)) {
			nota1 = Integer.parseInt(JOptionPane.showInputDialog("Para calcular a m�dia nas avalia��es, informe:" + "\n" + 
																   "Digite sua primeira nota: "));
		}
		while ((nota2 < 0 ) || (nota2 > 10)) {
			nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua segunda nota: "));
		}
		
		//verificando a m�dia
		media = (nota1 + nota2) / 2;
		
		//exibindo resultado na tela
		JOptionPane.showMessageDialog(null, "A sua m�dia �: " + media);
	}

}
