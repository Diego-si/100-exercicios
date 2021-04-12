package exemplo04;

/**
 * Programa para demonstrar a utilização do comando de repetição Do While
 * 
 * @author Diego Silva
 * @since 10/02/2021
 */
public class RepeticaoDoWhile {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		//declarando as variáveis
		int i;
		
		//inicializando a variável
		i = 0;
		
		do {
			System.out.println(i + " ao cubo é: " + ((i * i) * i));
			i++;
		} while(i < 10);
	}

}
