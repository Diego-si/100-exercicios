package exemplo01;

/**
 * Programa para demostrar utilização de variáveis
 * 
 * @author Diego Silva
 * @since 04/02/2021
 */
public class Variaveis {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando uma variavel do tipo inteiro
		int idade;

		// declarando uma variável do tipo String
		String nome;

		// declarando uma variável do tipo double
		double valor;

		// atribuindo valores para as variáveis
		idade = 37;
		nome = "Diego Silva";
		valor = 155.98;
		
		//exibindo o conteúdo das variáveis no console
		System.out.println("Variável IDADE: " + idade + ".");
		System.out.println("Variável NOME: " + nome + ".");
		System.out.println("Variável VALOR: " + valor + ".");

	}

}
