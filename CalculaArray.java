package exercicios;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

/**
 * Classe para cadastrar uma ArrayList de n�meros inteiros, o usu�rio dever�
 * informar 10 n�meros maiores que zero
 *
 * @author Diego Almeida da Silva
 * @since 25 de fev. de 2021
 */
public class CalculaArray {

	private ArrayList<Integer> numeros;

	public String msn = "";

	// constructor
	public CalculaArray() {
		numeros = new ArrayList<Integer>();

		getNumero();
		menuPrincipal();
	}

	public void menuPrincipal() {

		String menu = "\n\nINFORME A OP��O DESEJADA" + "\n1 - MAIOR ELEMENTO" + "\n2 - MENOR ELEMENTO"
				+ "\n3 - ORDENAR LISTA CRESCENTE" + "\n4 - ORDENAR LISTA DECRESCENTE" + "\n5 - M�DIA DOS ELEMENTOS"
				+ "\n6 - SOMA DO MAIOR E MENOR ELEMENTO" + "\n7 - SOMA DOS ELEMENTOS IGUAIS"
				+ "\n8 - M�DIA DOS ELEMENTOS IGUAIS" + "\n9 - SAIR DO SISTEMA\n\n";

		// verificando a opcao do usuario
		while (true) {
			try {
				int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
				processa(opcao);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.opcaoInvalidaCalcula, Rotulo.sistemaNumero, 0);
			}
		}

	}

	// m�todo para controlar o processamento
	public void processa(int opcao) {
		switch (opcao) {
		case 1: {
			maiorElemento();
			break;
		}
		case 2: {
			menorElemento();
			break;
		}
		case 3: {
			ordenarListaCrescente();
			break;
		}
		case 4: {
			ordenarListaDecrescente();
			break;
		}
		case 5: {
			mediaDosElementos();
			break;
		}

		case 6: {
			somaDoMaiorMenorElemento();
			break;
		}

		case 7: {
			somaDosElementosIguais();
			break;
		}

		case 8: {
			mediaDosElementosIguais();
			break;

		}
		case 9: {
			sairDoSistema();
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, Mensagem.opcaoInvalidaCalcula, Rotulo.sistemaNumero, 0);
		}
	}

	// m�todo para receber o numero do endere�o
	private void getNumero() {

		//la�o para recebendo os n�mero do usuario
		for (int i = 1; i <= 10; i++) {
			boolean execute = true;
			// String num = "";
			int numero = 0;
			while (execute) {
				try {
					// recebendo os n�mero do usuario

					numero = Integer.parseInt(JOptionPane.showInputDialog(Mensagem.informeNumero));
					if (Valida.isIntZero(numero)) {
						// verficando se o n�mero esta vazio ou n�o
						JOptionPane.showMessageDialog(null, Mensagem.numeroVazio, Rotulo.cadastroNumero, 0);
						execute = true;
					} else {
						execute = false;
						// comparar = numero;
						numeros.add(numero);
					}
				} catch (Exception e) { // caso de algum erro exibi que o n�mero esta inv�lido
					JOptionPane.showMessageDialog(null, Mensagem.numeroErro, Rotulo.cadastroNumero, 0);
					execute = true;
				}
			}
		}

		// return numero;
	} // fim do metodo n�mero

	// ordena a lista de forma decrescente mostrando o maior elemento
	public void maiorElemento() {
		String mensagem = "O maior n�mero\n";
		Collections.reverse(numeros);
		mensagem += " --------------- " + numeros.get(0) + " --------------- ";
		JOptionPane.showMessageDialog(null, mensagem, Rotulo.maiorNumero, 1);
		Collections.sort(numeros);
	}

	// ordena a lista de forma crescente mostrando o menor numero
	public void menorElemento() {
		String mensagem = "O menor n�mero\n";
		Collections.sort(numeros);
		mensagem += " --------------- " + numeros.get(0) + " --------------- ";
		JOptionPane.showMessageDialog(null, mensagem, Rotulo.menorNumero, 1);
	}

	// ordena a lista de forma crescente
	public void ordenarListaCrescente() {
		String mensagem = "N�meros em ordem crescente\n";
		Collections.sort(numeros);
		for (Integer numeros : numeros) {
			mensagem += " - " + numeros;
		}
		JOptionPane.showMessageDialog(null, mensagem, Rotulo.numeroCrescente, 1);
	}

	// ordena a lista de forma decrescente
	public void ordenarListaDecrescente() {
		String mensagem = "N�meros em ordem decrescente\n";
		Collections.reverse(numeros);
		for (Integer numeros : numeros) {
			mensagem += " - " + numeros;
		}
		JOptionPane.showMessageDialog(null, mensagem, Rotulo.numeroDecrescente, 1);
		Collections.sort(numeros);
	}

	//m�todo para realizar A m�dia dos n�meros
	public void mediaDosElementos() {
		String mensagem = "A m�dia dos n�meros �:\n";
		int somaElementos = 0;
		double media = 0;
		for (Integer numeros : numeros) {
			somaElementos += numeros;
		}
		media = somaElementos / 10;
		mensagem += " --------------- " + media + " ---------------- ";
		JOptionPane.showMessageDialog(null, mensagem, Rotulo.mediaElementos, 1);
	}

	//m�todo para A soma do maior e do menor n�mero
	public void somaDoMaiorMenorElemento() {
		String mensagem = "A soma do maior e do menor n�mero �:\n";
		Collections.sort(numeros);
		mensagem += " --------------- " + (numeros.get(numeros.size() - 1) + numeros.get(0)) + " --------------- ";
		JOptionPane.showMessageDialog(null, mensagem, Rotulo.somaMaiorMenor, 1);

	}

	// m�todo para realizar a soma dos n�meros iguais
	public void somaDosElementosIguais() {
		
		String exibe = "";
		//boolean para autenticar a valida��o
		boolean cont = false;

		// Collections.frequency - Ele substitui o m�todo equals () para realizar a
		// compara��o para verificar se o Object numeros e o Object na lista s�o
		// iguais ou n�o.
		for (int i = 0; i < numeros.size(); i++) {
			int resultado = Collections.frequency(numeros, numeros.get(i));
			if (resultado > 1) {

				exibe += "O n�mero " + numeros.get(i) + " se repete " + resultado + " vezes \n";
				exibe += "A soma dos iguais � : " + (numeros.get(i) * resultado) + " \n\n";
				i += (resultado - 1);
				cont = true;
			}
		}

		//se cont for true entra na primeira condi��o
		if (cont) {
			JOptionPane.showMessageDialog(null, exibe, Rotulo.somaNumerosIguais, 1);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.iguaisVazio, Rotulo.somaNumerosIguais, 2);
		}

	}

	// m�todo para realizar a soma dos n�meros iguais e dividir pelo total de repetidos
	public void mediaDosElementosIguais() {

		String msnMedia = "";
		int cont = 0;
		int soma = 0;
		int total = 0;
		double media = 0;
		//variavel para validar se existe n�meros iguais
		boolean existe = false;

		//la�o para percorrer todos os numeros e soma os iguais
		for (int i = 0; i < numeros.size() - 1; i++) {
			for (int j = i + 1; j < numeros.size(); j++) {
				if (numeros.get(j) == numeros.get(i)) {
					soma = numeros.get(j);
					total += soma;
					cont++;
					existe = true;
				}

			}
		}

		//se a media for maior que zero entra na primeira condi��o
		if (existe) {
			//recebendo a media dos n�meros
			media = total / cont;
			msnMedia = "A m�dia dos n�meros iguais �: " + media;
			JOptionPane.showMessageDialog(null, msnMedia, Rotulo.mediaNumerosIguais, 1);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.iguaisMediaVazio, Rotulo.mediaNumerosIguais, 2);
		}

	}

	//m�todo para sair do sistema
	public void sairDoSistema() {
		// recebendo a opcao do usuario e perguntando se ele realmente quer sair do
		// sistema
		int opcao = JOptionPane.showConfirmDialog(null, "Encerrar o sistema?", "Aten��o", JOptionPane.YES_OPTION,
				JOptionPane.CANCEL_OPTION);

		if (opcao == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		new CalculaArray();
	}

}
