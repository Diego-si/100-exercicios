package exemplo06;

/**
 * Classe para demonstrar a utilização do objeto Pesso
 *
 * @author Diego Almeida da Silva
 * @since 17 de fev. de 2021
 */
public class TestaPessoa {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando o objeto pessoa
		Pessoa joao;

		// inicializando o objeto joao (instancia de objeto)
		joao = new Pessoa(); // new Pessoa() construtor

		// atribuindo os valores ao objeto joao
		joao.nome = "João Almeida de Silva";
		joao.dataNascimento = "06/11/1993";
		joao.altura = 1.68;
		joao.peso = 55;
		joao.sexo = "Masculino";

		// declarando o objeto pessoa maria
		Pessoa maria;

		// inicializando o objeto maria (instancia do objeto)
		maria = new Pessoa();

		// atribuindo os valores ao objeto maria
		maria.nome = "Maria da silva";
		maria.dataNascimento = "11/11/1989";
		maria.altura = 1.65;
		maria.peso = 60;
		maria.sexo = "Feminino";

		// exibindo os dados do objeto joao
		System.out.println("Nome: " + joao.nome);
		System.out.println("Data de Nascimento: " + joao.dataNascimento);
		System.out.println("Altura: " + joao.altura);
		System.out.println("Peso: " + joao.peso);
		System.out.println("Sexo: " + joao.sexo);

		// pulando uma linha
		System.out.println("");

		// exibindo os dados do objeto maria
		System.out.println("Nome: " + maria.nome);
		System.out.println("Data de Nascimento: " + maria.dataNascimento);
		System.out.println("Altura: " + maria.altura);
		System.out.println("Peso: " + maria.peso);
		System.out.println("Sexo: " + maria.sexo);

		// pulando uma linha
		System.out.println("");

		// exibindo os dados do objeto joao
		joao.exibirDados();

		// pulando uma linha
		System.out.println("");

		// exibindo os dados do objeto maria
		maria.exibirDados();
	}

}
