package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para o dono informar a quantidade de sanduiches e a maquina informa a quantidade de produto
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class Exercicio29 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		//declarando as variaveis
		double sanduiches, quiloPresunto, quiloHamburguer, quiloQueijo;
		
		//recebendo do usuario os dados do usuario e passando para a variavel
		sanduiches = Double.parseDouble(JOptionPane.showInputDialog("Para saber a quantidade em peso de produtos que vai precisar para fazer Sandu�ches, informa a baixo: " + "\n" +
																	"Digite a quantidade de Sandu�ches que deseja fazer: "));
		//realizando os calculos
		// fatia de queijo ou presunto pesa 50 gramas e hamb�rguer pesa 100 gramas
		quiloQueijo     = ( sanduiches * 100 ) / 1000;
		quiloPresunto   = ( sanduiches * 50  ) / 1000;
		quiloHamburguer = ( sanduiches * 100 ) / 1000;
		
		//exibindo dados na tela
		JOptionPane.showMessageDialog(null, "A quantidade em quilos de Quiejo �: " + quiloQueijo + " quilos" + "\n" +
				"A quantidade em quilos de Presunto �: " + quiloPresunto + " quilos" +  "\n" +
				"A quantidade em quilos de Hamb�rguer �: " + quiloHamburguer +  " quilos");
	}

}
