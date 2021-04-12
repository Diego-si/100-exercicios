package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dados de habitantes e calcular suas medias salario, filhos,
 * maior salario
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class Exercicio84 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		int habitantes, filhos, somaFilhos, cont;
		double mediaSalario, mediaFilhos, maior, percentual, somaSalario;
		double salario;

		// inicializando as variaveis
		somaFilhos = 0;
		somaSalario = 0;
		mediaSalario = 0;
		mediaFilhos = 0;
		maior = 0;
		cont = 0;
		percentual = 0;

		// recebendo os dados do usuario
		habitantes = Integer
				.parseInt(JOptionPane.showInputDialog("Para uma pesquisa sobre os habitantes da cidade, informe: "
						+ "\n" + "Digite a quantidade de Habitantes na cidade: "));

		// iniciando o la�o
		for (int i = 0; i < habitantes; i++) {
			// recebendo dados do usuario
			filhos = Integer.parseInt(
					JOptionPane.showInputDialog("Digite a quantidade de filhos da " + (i + 1) + "�" + " pessoa: "));
			do {
				salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio que esta pessos recebe: "));
			} while (salario < 0);
			
			// verificando a media do numero de filhos
			somaFilhos += filhos;
			mediaFilhos = somaFilhos / habitantes;

			// verificando a media dos salario
			somaSalario += salario;
			mediaSalario = somaSalario / habitantes;

			// verificando o maior salario
			if (salario > maior) {
				maior = salario;
			}

			// porcentagem de pessoas com salario menor que 150,00 reais
			if (salario < 150) {
				cont++;
			}
			percentual = (cont * 100) / habitantes;
		} // fim do la�o
			// exibindo os dados na tela
		JOptionPane.showMessageDialog(null,
				"A m�dia de sal�rio da popula��o �: " + mediaSalario + "\n" + "A m�dia do n�mero de filhos �: "
						+ mediaFilhos + "\n" + "O maior sal�rio �: " + maior + "\n"
						+ "O percentual de pessoas com sal�rio menor que R$ 150,00 �: " + percentual);
	}

}
