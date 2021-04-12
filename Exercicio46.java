package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler n�mero, saldo , d�bito e cr�dito de uma conta , e escrever o saldo
 * 
 * @author Diego Silva
 * @since 09/02/2021
 */
public class Exercicio46 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		//declarando as variaveis
		double conta, saldo, debito, credito, saldoAtual;
		
		//recebendo os dados do usuario e atribuindo na variaveis
		conta = Double.parseDouble(JOptionPane.showInputDialog("Para verificar se saldo em sua conta esta positivo ou negativo, informe abaixo:" + "\n" +
															   "Digite o n�mero da sua conta: "));
		saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo de sua conta: "));
		debito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de d�bito na sua conta: "));
		credito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de cr�dito da sua conta: "));
		
		//verificando o saldo atual
		saldoAtual = saldo - debito + credito;
		
		//verificando se esta com saldo positivo ou negativo e exibindo os dados na tela
		if (saldoAtual >= 0 ) {
			JOptionPane.showMessageDialog(null,"Conta :" + conta + "\n" + "Saldo de R$ " + saldoAtual + "\n" + "Saldo Positivo.");
		} else {
			JOptionPane.showMessageDialog(null,"Conta :" + conta + "\n" +  "Saldo de R$ " + saldoAtual + "\n" + "Saldo Negativo.");
		}
	}

}
