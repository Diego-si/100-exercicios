package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler uma quantidade em estoque e verificar se pode compra mais ou nao
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio47 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		//declarando as variaveis
		double quantAtual, quantMax, quantMin, quantMed;
		
		//recebendo dados do usuario e atribuindo nas variaveis
		quantAtual = Double.parseDouble(JOptionPane.showInputDialog("Para sabe se e necessario obter mais produtos, informe abaixo: " + "\n" +
																	"Digite a quantidade atual de produto: "));
		quantMax = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade m�xima em estoque: "));
		quantMin = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade m�nima em estoque: "));
		
		//obtendo a m�dia 
		quantMed = (quantMax + quantMin) / 2;
		
		//verificando se a quantidade que tem e estoque e maior ou igual a media com isso pode se dizer se pode comprar mais produto, e exibindo na tela
		if (quantAtual >= quantMed) {
			JOptionPane.showMessageDialog(null, "N�o efetuar compra");
		} else {
			JOptionPane.showMessageDialog(null, "Efetuar compra");
		}
	}

}
