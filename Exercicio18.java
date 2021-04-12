package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber numero de votos e calcular o percentual deles
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class Exercicio18 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		//declarando variaveis
		double eleitores, brancos, nulos, validos, porcenBran, porcenNul, porcenVali;
		
		//atribuindo valores que o usuario passar para as variaveis
		eleitores = Double.parseDouble(JOptionPane.showInputDialog("Para saber o percentual de votos em relação aos eleitores informe: " + "\n" +
																   "Digite o numero de eleitores:"));
		brancos = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de votos em branco: "));
		nulos = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de votos nulos: "));
		validos = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de votos validos: "));
		
		//realizando os calculos
		porcenBran = brancos * (eleitores / 100);
		porcenNul = nulos * (eleitores / 100);
		porcenVali = validos * (eleitores / 100);
		
		//exibindo os dados na tela
		JOptionPane.showMessageDialog(null, "A porcentagem de votos Branco é: " + porcenBran + "\n" +
											"A porcentagem de votos Nulos é : " + porcenNul + "\n" +
											"A porcentagem de votos Validos é: " + porcenVali);
	}

}
