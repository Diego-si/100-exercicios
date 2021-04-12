package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler custo de fabrica de um carro e ler o custon final
 * 
 * @author Diego Silva
 *
 */
public class Exercicio21 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		//declarando as variaves
		double custoF, valorFinal;
		
		//capturando dados do usuario e informando para as variavez
		custoF = Double.parseDouble(JOptionPane.showInputDialog("Para calcular o custo final de um carro informe:"));
		
		//efetuando os calculos
		valorFinal = custoF + ( custoF * (18+45) / 100);
		
		//exibindo dados na tela
		JOptionPane.showMessageDialog(null, "O valor final é : " + valorFinal);
	}

}
