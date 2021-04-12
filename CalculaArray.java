package exercicios;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

/**
 * Classe para cadastrar uma ArrayList de números inteiros, o usuário deverá
 * informar 10 números maiores que zero
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

		String menu = "\n\nINFORME A OPÇÃO DESEJADA" + "\n1 - MAIOR ELEMENTO" + "\n2 - MENOR ELEMENTO"
				+ "\n3 - ORDENAR LISTA CRESCENTE" + "\n4 - ORDENAR LISTA DECRESCENTE" + "\n5 - MÉDIA DOS ELEMENTOS"
				+ "\n6 - SOMA DO MAIOR E MENOR ELEMENTO" + "\n7 - SOMA DOS ELEMENTOS IGUAIS"
				+ "\n8 - MÉDIA DOS ELEMENTOS IGUAIS" + "\n9 - SAIR DO SISTEMA\n\n";

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

	// método para controlar o processamento
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

	// método para receber o numero do endereço
	private void getNumero() {

		//laço para recebendo os número do usuario
		for (int i = 1; i <= 10; i++) {
			boolean execute = true;
			// String num = "";
			int numero = 0;
			while (execute) {
				try {
					// recebendo os número do usuario

					numero = Integer.parseInt(JOptionPane.showInputDialog(Mensagem.informeNumero));
					if (Valida.isIntZero(numero)) {
						// verficando se o número esta vazio ou não
						JOptionPane.showMessageDialog(null, Mensagem.numeroVazio, Rotulo.cadastroNumero, 0);
						execute = true;
					} else {
						execute = false;
						// comparar = numero;
						numeros.add(numero);
					}
				} catch (Exception e) { // caso de algum erro exibi que o número esta inválido
					JOptionPane.showMessageDialog(null, Mensagem.numeroErro, Rotulo.cadastroNumero, 0);
					execute = true;
				}
			}
		}

		// return numero;
	} // fim do metodo número

	// ordena a lista de forma decrescente mostrando o maior elemento
	public void maiorElemento() {
		String mensagem = "O maior número\n";
		Collections.reverse(numeros);
		mensagem += " --------------- " + numeros.get(0) + " --------------- ";
		JOptionPane.showMessageDialog(null, mensagem, Rotulo.maiorNumero, 1);
		Collections.sort(numeros);
	}

	// ordena a lista de forma crescente mostrando o menor numero
	public void menorElemento() {
		String mensagem = "O menor número\n";
		Collections.sort(numeros);
		mensagem += " --------------- " + numeros.get(0) + " --------------- ";
		JOptionPane.showMessageDialog(null, mensagem, Rotulo.menorNumero, 1);
	}

	// ordena a lista de forma crescente
	public void ordenarListaCrescente() {
		String mensagem = "Números em ordem crescente\n";
		Collections.sort(numeros);
		for (Integer numeros : numeros) {
			mensagem += " - " + numeros;
		}
		JOptionPane.showMessageDialog(null, mensagem, Rotulo.numeroCrescente, 1);
	}

	// ordena a lista de forma decrescente
	public void ordenarListaDecrescente() {
		String mensagem = "Números em ordem decrescente\n";
		Collections.reverse(numeros);
		for (Integer numeros : numeros) {
			mensagem += " - " + numeros;
		}
		JOptionPane.showMessageDialog(null, mensagem, Rotulo.numeroDecrescente, 1);
		Collections.sort(numeros);
	}

	//método para realizar A média dos números
	public void mediaDosElementos() {
		String mensagem = "A média dos números é:\n";
		int somaElementos = 0;
		double media = 0;
		for (Integer numeros : numeros) {
			somaElementos += numeros;
		}
		media = somaElementos / 10;
		mensagem += " --------------- " + media + " ---------------- ";
		JOptionPane.showMessageDialog(null, mensagem, Rotulo.mediaElementos, 1);
	}

	//método para A soma do maior e do menor número
	public void somaDoMaiorMenorElemento() {
		String mensagem = "A soma do maior e do menor número é:\n";
		Collections.sort(numeros);
		mensagem += " --------------- " + (numeros.get(numeros.size() - 1) + numeros.get(0)) + " --------------- ";
		JOptionPane.showMessageDialog(null, mensagem, Rotulo.somaMaiorMenor, 1);

	}

	// método para realizar a soma dos números iguais
	public void somaDosElementosIguais() {
		
		String exibe = "";
		//boolean para autenticar a validação
		boolean cont = false;

		// Collections.frequency - Ele substitui o método equals () para realizar a
		// comparação para verificar se o Object numeros e o Object na lista são
		// iguais ou não.
		for (int i = 0; i < numeros.size(); i++) {
			int resultado = Collections.frequency(numeros, numeros.get(i));
			if (resultado > 1) {

				exibe += "O número " + numeros.get(i) + " se repete " + resultado + " vezes \n";
				exibe += "A soma dos iguais é : " + (numeros.get(i) * resultado) + " \n\n";
				i += (resultado - 1);
				cont = true;
			}
		}

		//se cont for true entra na primeira condição
		if (cont) {
			JOptionPane.showMessageDialog(null, exibe, Rotulo.somaNumerosIguais, 1);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.iguaisVazio, Rotulo.somaNumerosIguais, 2);
		}

	}

	// método para realizar a soma dos números iguais e dividir pelo total de repetidos
	public void mediaDosElementosIguais() {

		String msnMedia = "";
		int cont = 0;
		int soma = 0;
		int total = 0;
		double media = 0;
		//variavel para validar se existe números iguais
		boolean existe = false;

		//laço para percorrer todos os numeros e soma os iguais
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

		//se a media for maior que zero entra na primeira condição
		if (existe) {
			//recebendo a media dos números
			media = total / cont;
			msnMedia = "A média dos números iguais é: " + media;
			JOptionPane.showMessageDialog(null, msnMedia, Rotulo.mediaNumerosIguais, 1);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.iguaisMediaVazio, Rotulo.mediaNumerosIguais, 2);
		}

	}

	//método para sair do sistema
	public void sairDoSistema() {
		// recebendo a opcao do usuario e perguntando se ele realmente quer sair do
		// sistema
		int opcao = JOptionPane.showConfirmDialog(null, "Encerrar o sistema?", "Atenção", JOptionPane.YES_OPTION,
				JOptionPane.CANCEL_OPTION);

		if (opcao == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		new CalculaArray();
	}

}
