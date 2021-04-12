package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber diversos litros de refrigerante e calcular quantos litros foi comprado
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class Exercicio32 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		//declarando as variaveis
		double latao, garrafa, lata, garrafaMedia, garrafaGrande, sub;
		
		//recebendo dados do usuario e atribuindo nas variaveis
		lata = Double.parseDouble(JOptionPane.showInputDialog("Para saber quantos litros de refrigerante vai comprar , informe os dados abaixo: " + "\n" +
															  "Digite a quantidade de latas de 350ml: "));
		garrafaMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de latas de 600ml: "));
		garrafaGrande = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de latas de 2 litros: "));
		
		//realizando os calculos
		//garrafas pequenas 350ml
		latao = lata * 350;
		//garrafas 600 ml
		garrafa = garrafaMedia * 600;
		//somando o total com a de 2 litros
		sub = garrafaGrande * 2 + ( latao / 1000 ) + ( garrafa / 1000 );
		
		//exibindo os dados na tela
		JOptionPane.showMessageDialog(null, "O total de litros de refrigerante é: " + sub + " litros de refrigerante");
	}

}
