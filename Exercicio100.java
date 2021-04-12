package exercicios;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * Programa para ler e armazenar em um vetor a temperatura média de todos os
 * dias da semana
 *
 * @author Diego Almeida da Silva
 * @since 15 de fev. de 2021
 */
public class Exercicio100 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando os vetores e atribuindo o seu valor
		double[] temperatura = new double[7];

		// declarando as variaveis
		double menor = 1000000000;
		double maior = 0;
		double soma = 0;
		double media = 0;
		int dias = 0;
		String semana = "";
		String mensagem = "";
		String contMe = "";
		String contMa = "";
		int contMenor = -1;
		int contMaior = -1;

		// formatando as casa decimais
		DecimalFormat formata = new DecimalFormat("00.00");

		// inciando o laço para receber as temperaturas da semana
		for (int i = 0; i < temperatura.length; i++) {

			switch (i) {
			case 0:
				semana = "no Domingo";
				break;
			case 1:
				semana = "na Seguna-feira";
				break;
			case 2:
				semana = "na Terça-feira";
				break;
			case 3:
				semana = "na Quarta-feira";
				break;
			case 4:
				semana = "na Quinta-feira";
				break;
			case 5:
				semana = "na Sexta-feira";
				break;
			case 6:
				semana = "no Sabado";
				break;
			default:
				System.out.println("Dia invalido");
			}
			//recebendo dados do usuario
			temperatura[i] = Double.parseDouble(JOptionPane.showInputDialog(
					"Para saber qual é a menor temperatura, a maior, a média semanal é mais algumas informações, "
							+ "\n" + " informe alguns dados abaixo" + "\n" + "Informe qual foi a média da temperatura "
							+ semana + ":"));
		}

		// encontrando a menor temperatura
		for (int i = 0; i < temperatura.length; i++) {
			if (temperatura[i] < menor) {
				menor = temperatura[i];
				contMenor++;// faz a contagem do dia que foi menor temperatura e coloca no switch
			}
		}

		// encontrando a maior temperatura
		for (int i = 0; i < temperatura.length; i++) {
			if (temperatura[i] > maior) {
				maior = temperatura[i];
				contMaior++; // faz a contagem do dia que foi maior temperatura e coloca no switch
			}
		}

		// encontrando a média da temperatura
		for (int i = 0; i < temperatura.length; i++) {
			soma += temperatura[i];
			media = soma / 7;
		}

		// laço para encontrar a temperatura abaixo da média
		for (int i = 0; i < temperatura.length; i++) {
			// dias em que a temperatura foi abaixo da média
			if (temperatura[i] < media) {
				dias++;
			}
		}

		// laço para verificar os dias que foram menores
		for (int i = 0; i < temperatura.length; i++) {

			switch (contMenor) {

			case 0:
				contMe = " no Domingo";
				break;
			case 1:
				contMe = " na Seguna-feira";
				break;
			case 2:
				contMe = " na Terça-feira";
				break;
			case 3:
				contMe = " na Quarta-feira";
				break;
			case 4:
				contMe = " na Quinta-feira";
				break;
			case 5:
				contMe = " na Sexta-feira";
				break;
			case 6:
				contMe = " no Sabado";
				break;
			default:
				System.out.println("Dia invalido");
			}
		}

		// laço com switch para verificar os dias maiores
		for (int i = 0; i < temperatura.length; i++) {

			switch (contMaior) {

			case 0:
				contMa = " no Domingo";
				break;
			case 1:
				contMa = " na Seguna-feira";
				break;
			case 2:
				contMa = " na Terça-feira";
				break;
			case 3:
				contMa = " na Quarta-feira";
				break;
			case 4:
				contMa = " na Quinta-feira";
				break;
			case 5:
				contMa = " na Sexta-feira";
				break;
			case 6:
				contMa = " no Sabado";
				break;
			default:
				System.out.println("Dia invalido");
			}
		}

		// mensagem para exibir na tela
		mensagem += "\nPREVISÃO DO TEMPO\n";
		mensagem += "A menor temperatura da semana è: " + menor + contMe + "\n";
		mensagem += "A maior temperatura da semana è: " + maior + contMa + "\n";
		mensagem += "Temperatura média semanal è: " + formata.format(media) + "\n";
		mensagem += "Dias na semana em que a temperatura foi inferior à média semanal è: " + dias + " dias.";

		// exibindo a mensagem na tela
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
