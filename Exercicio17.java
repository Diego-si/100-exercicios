package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler idade de uma pessoa e expressar em dias
 * 
 * @author Diego Silva
 *
 */
public class Exercicio17 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		//declarando variaveis
		int idade, meses, dia, anoDia, resDiaAno, diaMes, resultado;
		
		//capturando informações do usuario e atribuindo nas variaveis
		idade = Integer.parseInt(JOptionPane.showInputDialog("Para saber a quantidade de dias em anos que você tem informe:" + "\n" +
													   		 "Digite o seu ano de nanscimento:" ));
		meses = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes que você nasceu:"));
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do seu nascimento:"));
		
		//realizando os calculos
		//obtendo os dias entra anos
		anoDia = 2021 - idade;
		resDiaAno = anoDia * 365;
				
		//obtendo os meses nos dias
		diaMes = 30 * meses;
		
		//obtendo todos os dias
		resultado = dia + resDiaAno + diaMes + dia;
		
		//exibir dados na tela
		JOptionPane.showMessageDialog(null, "A quantidade de dias e igual a: " + resultado);
		
	}

}
