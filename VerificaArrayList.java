package exercicios;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

/**
 * Classe para armazenar os atributos e métodos do objeto VerificaArrayList
 *
 * @author Diego Almeida da Silva
 * @since 26 de fev. de 2021
 */
public class VerificaArrayList {

	private ArrayList<String> nomes;

	// variavel para controlar a quantidade de cadastros
	private int cont = 0;

	// constructor
	public VerificaArrayList() {
		nomes = new ArrayList<String>();

		menuPrincipal();
	}

	// menu principal para exibir as opções ao usuario
	public void menuPrincipal() {

		String menu = "\nINFORME A OPÇÃO DESEJADA\n" + "\n1 - CADASTRAR NOME" + "\n2 - EXCLUIR NOME"
				+ "\n3 - LISTAR NOMES CADASTRADOS" + "\n4 - LISTAR NOMES EM ORDEM ALFABÉTICA"
				+ "\n5 - LISTAR NOMES IGUAIS" + "\n6 - LISTAR NOMES POR LETRA INICIAL" + "\n7 - PESQUISAR NOME"
				+ "\n8 - SAIR DO SISTEMA\n\n";

		// verificando a opcao do usuario
		while (true) {
			try {
				int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
				processa(opcao);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.opcao, Rotulo.sistemaNome, 0);
			}
		}

	}

	// método para controlar o processamento
	public void processa(int opcao) {
		switch (opcao) {
		case 1: {
			cadastraNome();
			break;
		}
		case 2: {
			excluirNome();
			break;
		}
		case 3: {
			listarNomesCadastrados();
			break;
		}
		case 4: {
			listarNomesEmOrdemAlfabetica();
			break;
		}
		case 5: {
			listarNomesIguais();
			break;
		}

		case 6: {
			listarNomesPorLetraInicial();
			break;
		}

		case 7: {
			pesquisarNome();
			break;
		}

		case 8: {
			sairDoSistema();
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, Mensagem.opcaoInvalida, Rotulo.sistemaNome, 0);
		}
	}

	// método para cadrastrar o nome
	public void cadastraNome() {
		// verificando se tem espaços vazio para realizar cadastro
		if (cont < 10) {
			// para receber o método de nome
			getNome();
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.limite, Rotulo.sistemaNome, 2);
		}
	}

	// método para receber o nome
	private void getNome() {

		// boolean para validar a informação do usuario
		boolean execute = true;
		String nome = "";
		while (execute) {
			try {
				// recebendo o nome
				nome = JOptionPane.showInputDialog(Mensagem.informeNome);

				// verificando se o nome esta vazio, com espaços, números, apenas uma letra.
				if (Valida.isEmptyOrNull(nome) || Valida.isStringValida(nome)) {
					JOptionPane.showMessageDialog(null, Mensagem.nomeVazio, Rotulo.cadastroNome, 0);
					execute = true;
				} else {
					// se o nome for válido sera adicionado
					execute = false;
					nomes.add(nome);
					JOptionPane.showMessageDialog(null, Mensagem.cadastroSucesso, Rotulo.cadastroNome, 1);
					// contador para controlar a quantidade de nomes inseridos
					cont++;
				}
			} catch (Exception e) { // caso de algum erro exibi que o nome esta inválido
				JOptionPane.showMessageDialog(null, Mensagem.nomeErro, Rotulo.cadastroNome, 0);
				execute = true;
			}
		}

	} // fim do metodo nome

	// método para exluir o nome
	public void excluirNome() {

		String lista = "EXCLUSÃO DE NOMES\n\n";
		String nomeBusca = "";
		boolean exite = false;
		// laço para percorrer todos os nomes cadastrado e exibir o nome e um codigo
		// para o usuario escolha na hora de excluir algum
		for (String nome : nomes) {
			lista += "Nome: " + nome + "\n";
			exite = true;
		}

		if (exite) {
			// validando o nome buscado
			boolean auxiliar = true;
			// recebendo o nome buscado
			nomeBusca = JOptionPane.showInputDialog(lista + "Informe o nome que deseja apagar\n\n");

			// laço para verificar o nome buscado
			for (int i = 0; i < nomes.size(); i++) {
				if (nomes.get(i).equals(nomeBusca)) {
					// validando nome buscado
					int opcaoApagar = JOptionPane.showConfirmDialog(null, "Deseja apagar este nome?", "Atenção",
							JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);
					// validando a opcao
					if (opcaoApagar == JOptionPane.YES_OPTION) {
						// removendo o nome escolhido
						nomes.remove(nomeBusca);
						// deixano um espaço vazio de onde excluio o nome , atribuindo menos 1 ao
						// contador
						cont--;
						auxiliar = false;
					}

				}

			}
			// caso nome excluido exista caira na primeira condição
			if (auxiliar == false) {
				JOptionPane.showMessageDialog(null, Mensagem.excluidoSucesso, Rotulo.excluirNome, 1);
			} else { // caso opcao nao esteja valida caira nesta condição
				JOptionPane.showMessageDialog(null, Mensagem.opcaoInvalida, Rotulo.excluirNome, 2);
			}
		} else { // se nao existir nenhum nome cadastrado mostra que não existe nomes cadastrados
			JOptionPane.showMessageDialog(null, Mensagem.listaVazia, Rotulo.excluirNome, 2);
		}

	}

	// método para listar os nomes cadastrados
	public void listarNomesCadastrados() {
		String lista = "Nomes na lista:\n\n";
		boolean exite = false;

		// laço para pegar os nomes da lista
		for (String nome : nomes) {
			lista += "Nome: " + nome + "\n";
			exite = true;
		}
		// caso exista algum nome cadastrado exibe a lista de nomes
		if (exite) {
			JOptionPane.showMessageDialog(null, lista, Rotulo.listaNome, 1);
		} else { // caso não tenha nenhum nome avisa que lista esta vazia
			JOptionPane.showMessageDialog(null, Mensagem.listaVazia, Rotulo.listaNome, 2);
		}
	} // fim do método listar nomes

	// mensagem para listar os nomes em ordem alfabética
	public void listarNomesEmOrdemAlfabetica() {

		String lista = "Nomes em ordem Alfabética:\n\n";
		// boolean para validar a existencia de nomes cadastrados
		boolean existe = false;

		// usei o @SuppressWarnings para o compilador não emitir warnings, em nome , so
		// estou utilizando para verificar se existem nomes na lista
		for (@SuppressWarnings("unused")
		String nome : nomes) {
			existe = true;
		}

		// atribuindo a lista de nomes em um novo array
		ArrayList<String> nomesAuxiliar = new ArrayList<String>(nomes);
		// ordenando os nomesAuxiliar tanto letras maiusculas quanto minusculas
		nomesAuxiliar.sort(String::compareToIgnoreCase);

		// laço para pega todo os nomes e lista para exibição
		for (String ordemAlfabetica : nomesAuxiliar) {
			lista += "Nome: " + ordemAlfabetica + "\n";
		}

		// caso exista algum nome na lista
		if (existe) {
			JOptionPane.showMessageDialog(null, lista, Rotulo.listaNomeAlfabetica, 1);
			// depois que exibir os nomes da lista, remove todos do arrayAuxiliar, para que
			// em cada pesquisa seja realizada nova ordenação dos nomes
			nomesAuxiliar.removeAll(nomes);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.listaVazia, Rotulo.listaNomeAlfabetica, 2);
		}
	} // fim do método listar nomes por ordem alfabética

	// método para listar nomes iguais
	public void listarNomesIguais() {
		// nomes iguais somente mais de uma vez
		String exibe = "";

		// boolean para validar os nomes
		boolean contador = false;
		// laça para verificar se existem nomes cadastrados
		// usei o @SuppressWarnings para o compilador não emitir warnings, em nome , so
		// estou utilizando para verificar se existem nomes na lista
		for (@SuppressWarnings("unused")
		String nomes : nomes) {
			contador = true;
		}
		if (contador) {
			boolean auxiliar = false;
			// laço para percorer a lista de nomes
			for (int i = 0; i < nomes.size() - 1; i++) {
				// cada vez que tiver um nome igual no array será dado atribuido a quantidade de
				// vezes em resultado
				int resultado = Collections.frequency(nomes, nomes.get(i));
				if (resultado > 1) {
					// nesta momento exibe armazena o nome e a quantidade de vezes que o nome
					// aparece
					exibe += "O nome " + nomes.get(i) + " se repete " + resultado + " vezes \n";
					i += (resultado - 1);
					auxiliar = true;
				}
			}
			// se o contador for verdaddeiro exibe o resultado
			if (auxiliar) {
				JOptionPane.showMessageDialog(null, exibe, Rotulo.listaNomeIguais, 1);
			} else { // caso contrario informa que a lista não nomes iguai ou esta vazia
				JOptionPane.showMessageDialog(null, Mensagem.listaIguaisVazia, Rotulo.listaNomeIguais, 2);
			}
		} else { // caso não tenha nomes no cadastro informa esta mensagem
			JOptionPane.showMessageDialog(null, Mensagem.listaVazia, Rotulo.listaNomeIguais, 2);
		}
	}// fim do método para listar nomes iguais

	// método para listar nomes pela primeira letra digitada
	public void listarNomesPorLetraInicial() {

		// boolean para validar as informações
		boolean aux = false;
		// char para receber a letra
		char nome = 0;
		String lista = "";
		String resposta = "";
		// laço para verificar se existe nomes na lista
		for (String nomes : nomes) {
			lista += "Nome: " + nomes + "\n";
			aux = true;
		}

		// caso exista nomes na lista
		if (aux) {
			// boolean para validar as informações da letra buscada
			boolean auxilia = true;

			// recebendo a letra buscada
			resposta = JOptionPane.showInputDialog(lista + "Informe a inicial do nome que quer buscar:");

			// condição que valida a letra digitada
			if (Valida.isEmptyOrNull(resposta) || Valida.isLetraValida(resposta)) {
				JOptionPane.showMessageDialog(null, Mensagem.letraInvalido, Rotulo.listaNomeLetraInicial, 2);
				// enquanto a letra não estiver valida ficaram nesta condição
				auxilia = true;
			} else {
				// char nome recebendo a primeira letra
				nome = resposta.charAt(0);
				String exibe = "Listando nomes pela letra ínicial: \n\n";
				// laço que percorre a lista dos nomes
				for (int i = 0; i < nomes.size(); i++) {
					// o char de letra recebendo o nome que esta na posição i do laco
					char[] letra = nomes.get(i).toCharArray();
					// comparando a posição 0 de letra com a letra que o usuario passou
					if (letra[0] == nome) {
						// caso for verdade sera pego o nome buscado
						exibe += "Nome: " + nomes.get(i) + "\n";
						// validando a letra buscada
						auxilia = false;
					}
				}
				// letra buscada for verdadeira entra na primeira condição e exibe o nome
				if (auxilia == false) {
					JOptionPane.showMessageDialog(null, exibe, Rotulo.listaNomeLetraInicial, 1);
				} else {
					JOptionPane.showMessageDialog(null, Mensagem.letraExiste, Rotulo.listaNomeLetraInicial, 2);
				}
			}
		} else { // caso não tenha nomes na lista cadastrada
			JOptionPane.showMessageDialog(null, Mensagem.listaVazia, Rotulo.listaNomeLetraInicial, 2);
		}
	} // fim do método de busca por letra

	// método que busca por nome
	public void pesquisarNome() {

		String lista = "";
		String nomeBusca = "";
		// validando a existencia de nomes cadastrado
		boolean aux = false;
		for (String nome : nomes) {
			lista += "Nome: " + nome + "\n";
			aux = true;
		}
		// caso exista nomes na lista
		if (aux) {
			// validando o nome buscado
			boolean auxiliar = true;
			// recebendo o nome buscado
			nomeBusca = JOptionPane.showInputDialog(lista + "Informe o nome que deseja pesquisar\n\n");

			// laço para verificar o nome buscado
			for (int i = 0; i < nomes.size(); i++) {
				if (nomes.get(i).equalsIgnoreCase(nomeBusca)) {
					// validando nome buscado
					auxiliar = false;
				}

			}
			// caso nome buscado exista caira na primeira condição
			if (auxiliar == false) {
				JOptionPane.showMessageDialog(null, Mensagem.nomeExiste, Rotulo.pesquisarNome, 1);
			} else {
				JOptionPane.showMessageDialog(null, Mensagem.nomeNaoExiste, Rotulo.pesquisarNome, 2);
			}
		} else { // se não tiver nomes cadastrados exibe mensagem
			JOptionPane.showMessageDialog(null, Mensagem.listaVazia, Rotulo.pesquisarNome, 2);
		}
	}

	// método para sair do sistema
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

		new VerificaArrayList();
	}

}
