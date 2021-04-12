package exercicios;

/**
 * Programa para imprimir a tabuada de 1 a 10 para os numeros de 1 a 10
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class Exercicio85 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		String resultado;

		// atribuindo cabe�alho
		resultado = "Tabuada do 1 ao 10 \n";

		// iniciando o la�o
		for (int i = 0; i < 11; i++) {
			// segundo la�o para repetir
			for (int j = 0; j < 11; j++) {
				// pegando o resultado
				resultado += j + " x " + i + " = " + (j * i) + "\n\n";
			} // fim segundo la�o
		} // fim primeiro la�o
			// exibindo a mensagem na tela
		System.out.println(resultado);
	}

}
