package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 3 notas de um aluno e escrever sua media final
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class Exercicio24 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		//declarando variaveis
		double n1, n2, n3, media;
		
		//recebendo informacoes e atribuindo nas variaveis
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Para saber sua media final informe suas notas: " + "\n" +
															"Digite a sua primeira nota: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua segunda nota: "));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua terceira nota: "));
		
		//realizando os calculos
		media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
		
		//exibindo o resultado na tela
		JOptionPane.showMessageDialog(null, "A sua média final é: " +  media);
	}

}
