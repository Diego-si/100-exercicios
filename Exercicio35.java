package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber ano nascimento, ano atual e mostre os dados
 * 
 * @author Diego Silva
 * @since 08/02/2021
 */
public class Exercicio35 {

	/*
	 * Método principal do programa
	 */
	public static void main(String[] args) {

		//declarando as variaveis
		int ano, anoAtual, idadeAnos, idadeMes, idadeDias;
		double idadeSemanas;
		
		//recebendo dados do usuario e atribuindo nas variaveis
		ano = Integer.parseInt(JOptionPane.showInputDialog("Para sua idade em meses, dias, semanas e anos, informe abaixo: " + "\n" +
														   "Digite o ano do seu nascimento: "));
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
		
		//processando os dados
		//idade em anos
		idadeAnos = anoAtual - ano;
		//idade em meses
		idadeMes = idadeAnos * 12;
		//idade em dias
		idadeDias = idadeMes * 30;
		//idade em semanas
		idadeSemanas = idadeDias / 7;
		
		//exibindo os dados na tela
		JOptionPane.showMessageDialog(null, "A sua idade em anos é: " + idadeAnos + "\n" +
											"A sua idade em meses é: " + idadeMes + "\n" +
											"A sua idade em dias é: " + idadeDias + "\n" +
											"A sua idade em semanas é: " + idadeSemanas);
	}

}
