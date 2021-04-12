package exemplo09;

/**
 * Classe para instanciar o objeto secrataria e exibir os seus dados
 *
 * @author Diego Almeida da Silva
 * @since 23 de fev. de 2021
 */
public class Testasecretaria {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		//instanciando o objeto do tipo secrataria
		Secretaria maria = new Secretaria();
		maria.setNome("Maria silva");
		maria.setCpf("121324");
		maria.setSalario(9898.23);
		maria.setRamal(12);
		
		maria.mostrarDados();
		System.out.println("\n");
		maria.exibiSecretaria();
	}

}
