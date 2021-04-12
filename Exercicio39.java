package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber notas de um aluno, verificar a media e informa se foi
 * aprovado
 * 
 * @author Diego Silva
 *
 */
public class Exercicio39 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		double nota1, nota2, media;

		// recebendo os dados do usuario e passando para as variaveis
		nota1 = Double.parseDouble(
				JOptionPane.showInputDialog("Para saber se voc� foi aprovado e obteve uma boa m�dia, informe abaixo: "
						+ "\n" + "Digite o valor da sua primeira nota: "));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da sua segunda nota: "));

		// obtendo o valor da media
		media = (nota1 + nota2) / 2;

		// verificando se a media e maior ou menor que 6 , e exibindo na tela
		if (media >= 6) {
			JOptionPane.showMessageDialog(null, "Voc� esta Aprovado ! " + "\n" + "Sua m�dia �: " + media);
		} else {
			JOptionPane.showMessageDialog(null, "Voc� esta Reprovado ! " + "\n" + "Sua m�dia �: " + media);
		}
	}

}
