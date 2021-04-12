package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para simular funcionamento de um caixa eletrônico
 * 
 * @author Diego Silva
 * @since 08/02/2021
 */
public class CaixaEletronico {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando variaveis
		String cinquenta = " ", vinte = " ", dez = " ", cinco = " ", dois = " "; // iniciando variaveis com vazio
		int nota2, nota5, nota10, nota20, nota50; // variaveis para atribuir valores das notas
		int resultado2, resultado5, resultado20, resultado10, resultado50; // variavel para pegar os valor dividido
		int resto; // variavel para pegar o resto dos resultados
		double valorUsuario; // variavel para pegar o valor do usuario

		// recebendo dados do usuario
		valorUsuario = Double.parseDouble(
				JOptionPane.showInputDialog("============================" + "\n" + "======= Caixa Eletrônico ======="
						+ "\n\n" + "Notas disponíveis para saque:" + "\n" + "R$ 2 - 5 - 10 - 20 - 50 reais" + "\n"));
		// passando o valor que o usuario passaou para inteiro
		// valor = (int) valorUsuario;

		// atribuindo valores as variaveis
		resultado2 = 0;
		resultado5 = 0;
		resultado20 = 0;
		resultado10 = 0;
		resultado50 = 0;
		resto = 0;
		nota2 = 2;
		nota5 = 5;
		nota10 = 10;
		nota20 = 20;
		nota50 = 50;

		// verificando se o valor e menor que zero
		if ((valorUsuario <= 1) || (valorUsuario == 3)){ // verificando se valor e menor ou igual a zero
			JOptionPane.showMessageDialog(null, "Informe um valor válido!");
		} else if (Math.floor(valorUsuario) != valorUsuario){ // verificando se o valor tem centavos
			JOptionPane.showMessageDialog(null, "Informe um valor válido!");
		} else {
			if ((valorUsuario >= 50) && (valorUsuario != 51) && (valorUsuario != 53)) { // recebendo notas acima de 50 e
																						// tratando as notas especiais
				resultado50 = (int) valorUsuario / 50; // o resultado50 recebe o valor que o usuario passou dividido por
														// 50 , isso vai mostrar a quantidade de notas de 50
				resto = (int) valorUsuario - resultado50 * nota50; // caso a divisao sobra algum numero vai ser
																	// armazenado na variavel resto
			} else if ((valorUsuario == 51) || (resto == 51)) { // tratando os valores especiais
				resultado20 = 2;
				resultado5 = 1;
				resultado2 = 3;
			} else if ((valorUsuario == 53) || (resto == 53)) { // tratando os valores especiais
				resultado20 = 2;
				resultado5 = 1;
				resultado2 = 4;
			}
			if ((resto >= 20) && (resto != 21) && (resto != 23) && (resto != 41) && (resto != 43)) { // recebendo notas
																										// acima de 20 e
																										// tratando as
																										// notas
																										// especiais
				resultado20 = (int) resto / nota20; // pegando o resto caso tiver dividir por 20 e atribuir em
													// resultado20
				resto = resto - resultado20 * nota20; // caso tiver algum resto vai somar e atribuir em um novo resto
			} else if ((valorUsuario <= 49) && (resto != 21) && (resto != 23) && (resto != 41) && (resto != 43)) { // recebendo
																													// notas
																													// abaixo
																													// de
																													// 50
																													// e
																													// tratando
																													// as
																													// notas
																													// especiais
				resultado20 = (int) valorUsuario / nota20; // aqui esta recebendo o valor que o usuario passou
				resto = (int) valorUsuario - resultado20 * nota20; // verifica se tem algum resto
			} else if (resto == 21) { // tratando os valores especiais
				resultado10 = 1;
				resultado5 = 1;
				resultado2 = 3;
			} else if (resto == 23) { // tratando os valores especiais
				resultado10 = 1;
				resultado5 = 1;
				resultado2 = 4;
			} else if (resto == 41) { // tratando os valores especiais
				resultado20 = 1;
				resultado10 = 1;
				resultado5 = 1;
				resultado2 = 3;
			} else if (resto == 43) { // tratando os valores especiais
				resultado20 = 1;
				resultado10 = 1;
				resultado5 = 1;
				resultado2 = 4;
			}
			if ((resto >= 10) && (resto != 11) && (resto != 13) && (resto != 21) && (resto != 23) && (resto != 41)
					&& (resto != 43)) { // recebendo notas acima de 10 e tratando as notas especiais
				resultado10 = (int) resto / nota10; // se tiver algum valor do resto das outras operações
				resto = resto - resultado10 * nota10; // se tiver algum resto atribui no resto novo
			} else if ((valorUsuario <= 19) && (resto != 11) && (resto != 13)) { // recebendo do usuario valores abaixo
																					// de 19
				resultado10 = (int) valorUsuario / nota10; // fazendo o calculo do valor do usuario
				resto = (int) valorUsuario - resultado10 * nota10;
			} else if ((resto == 11) && (resto != 13)) { // tratando os valores especiais
				resultado5 = 1;
				resultado2 = 3;
			} else if (resto == 13) { // tratando os valores especiais
				resultado5 = 1;
				resultado2 = 4;
			}
			if ((resto >= 5) && (resto != 6) && (resto != 8) && (resto != 11) && (resto != 13) && (resto != 21)
					&& (resto != 23) && (resto != 41) && (resto != 43)) {// tratando o resto que vier das outras
																			// condições
				resultado5 = (int) resto / nota5;
				resto = resto - resultado5 * nota5;
			} else if ((valorUsuario <= 9) && (resto != 6) && (resto != 8) && (resto != 11)) { // tratando se o valor do
																								// usuario for abaixo de
																								// 9 e alguns valores
																								// especiais
				resultado5 = (int) valorUsuario / nota5;
				resto = (int) valorUsuario - resultado5 * nota5;
			} else if (resto == 6) { // valores especiais
				resultado2 = (int) valorUsuario / 3;
			} else if (resto == 8) { // valores especiais
				resultado2 = (int) valorUsuario / nota2;
			}
			if ((resto >= 2) && (resto != 11) && (resto != 13) && (resto != 21) && (resto != 23) && (resto != 41)
					&& (resto != 43)) { // tratando o resto que vier das outras condições
				resultado2 = (int) resto / nota2;
			} else if (valorUsuario <= 4) { // tratando valor se usuario informa abaixo de 4
				resultado2 = (int) valorUsuario / nota2;
			}
			
			// verificando se os valores sao diferente de zero
			if (resultado50 != 0) { 
				cinquenta = "Notas de R$ 50,00: " + resultado50; // atribuindo valor como String na variavel
			}
			if (resultado20 != 0) {
				vinte = "Notas de R$ 20,00: " + resultado20;
			}
			if (resultado10 != 0) {
				dez = "Notas de R$ 10,00: " + resultado10;
			}
			if ((resultado5 != 0) && (resultado5 != 6)) {
				cinco = "Notas de R$ 5,00: " + resultado5;
			}
			if ((resultado2 != 0) && (valorUsuario != 3)) {
				dois = "Notas de R$ 2,00: " + resultado2;
			}

			//exibindo todos os valores que sao validos
			JOptionPane.showMessageDialog(null, "Valor solicitado: R$ " + valorUsuario + "\n" + cinquenta + "\n" + vinte
					+ "\n" + dez + "\n" + cinco + "\n" + dois); 

		}
	}
}
