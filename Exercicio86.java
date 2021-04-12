package exercicios;

/**
 * Programa para imprimir numero de 1 a 10 nesta seguencia (1, 1 2 3 4 5 6 7 8 9
 * 10) (2, 1 2 3 4 5 6 7 8 9 10) (3, 1 2 3 4 5 6 7 8 9 10) (4, 1 2 3 4 5 6 7 8 9
 * 10)
 *
 * @author Diego Almeida da Silva
 * @since 11 de fev. de 2021
 */
public class Exercicio86 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declando variaveis
		String resultado;

		// atribuindo valor na variavel
		resultado = "Seguencia de n�meros \n";

		// iniciando o la�o
		for (int i = 1; i <= 10; i++) {
			// atribuindo valores no resultado
			resultado += "\n( " + i + " , ";
			// segundo la�o
			for (int j = 1; j <= 10; j++) {
				// atribuindo valores no resultado
				resultado += j + " ";
			} // fim segundo la�o
			resultado += ")";
		} // fim primeiro la�o
			// exibindo resultado
		System.out.println(resultado);
	}

}
