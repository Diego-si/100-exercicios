package exemplo04;

/**
 * Programa para demonstrar o comando de repetição For
 * 
 * @author Diego Silva
 * @since 10/02/2021
 */
public class RepeticaoFor {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) { // inicio do laço for
			System.out.println(i + " ao cubo é: " + ((i * i) * i));
		} // fim do laço for
	}

}
