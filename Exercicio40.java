package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler ano atual e ano de nascimento de uma pessoa e informa se ela poder� votar ou n�o
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio40 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		//declarando as variaveis
		int ano, anoAtual, totalAno;
		
		//recebendo dado do usuario e atribuindo nas variaveis
		ano = Integer.parseInt(JOptionPane.showInputDialog("Para verificar se voc� pode votar, informe os valores abaixo: " + "\n" +
														   "Digite o ano de seu nascimento: "));
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
		
		//subtraindo o ano
		totalAno = anoAtual - ano;
		
		//verificando se pode votar ou n�o
		if (totalAno >= 16) {
			JOptionPane.showMessageDialog(null, "Parab�ns, Voc� pode votar este ano!");
		} else {
			JOptionPane.showMessageDialog(null, "Lamento, Voc� n�o podera votar este ano!");
		}
	}

}
