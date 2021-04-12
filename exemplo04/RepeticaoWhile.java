package exemplo04;

/**
 * Programa para demonstrar laço de repetição while
 * 
 * @author Diego Silva
 * @since 10/02/2021
 */
public class RepeticaoWhile {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando variáveis
		int indice;

		// inicializando a variável
		indice = 0;

		// efetuando o laço de repetição para exibir o cubo de um numero
		while (indice < 10) { // inicio do laço de repetição
			System.out.println(indice + " ao cubo é: " + ((indice * indice) * indice));
			indice++; // contador incremento
		} // fim do laço de repetição
	}

}
