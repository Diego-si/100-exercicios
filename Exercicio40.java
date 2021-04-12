package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler ano atual e ano de nascimento de uma pessoa e informa se ela poderá votar ou não
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio40 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		//declarando as variaveis
		int ano, anoAtual, totalAno;
		
		//recebendo dado do usuario e atribuindo nas variaveis
		ano = Integer.parseInt(JOptionPane.showInputDialog("Para verificar se você pode votar, informe os valores abaixo: " + "\n" +
														   "Digite o ano de seu nascimento: "));
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
		
		//subtraindo o ano
		totalAno = anoAtual - ano;
		
		//verificando se pode votar ou não
		if (totalAno >= 16) {
			JOptionPane.showMessageDialog(null, "Parabéns, Você pode votar este ano!");
		} else {
			JOptionPane.showMessageDialog(null, "Lamento, Você não podera votar este ano!");
		}
	}

}
