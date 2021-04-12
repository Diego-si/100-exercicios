package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber uma data e informa quantos dias se passou desde o inicio do ano
 * 
 * @author Diego Silva
 * @since 05/02/2021
 */
public class Exercicio26 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		//declarando variaveis
		int dia, mes, toDias, diaMes;
		
		//recebendo dados do usuario e passando para as variaveis
		dia = Integer.parseInt(JOptionPane.showInputDialog("Para saber quantos dias se passou desde o inicio do ano, informe abaixo: " + "\n" +
														   "Digite um dia: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um mes: "));
		
		//realizando os calculos
		//encontrando o mes
		diaMes = (mes - 1) * 30;
				
		//encontrando o dia
		toDias = diaMes + dia;
		
		//exibindo os dados na tela
		JOptionPane.showMessageDialog(null, "Se passaram " + toDias + " dias");
	}

}
