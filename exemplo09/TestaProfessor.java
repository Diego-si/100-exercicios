package exemplo09;

/**
 * Classe responsável por instaciar um objeto professor e exibir os seus dados
 *
 * @author Diego Almeida da Silva
 * @since 23 de fev. de 2021
 */
public class TestaProfessor {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		//criando um objeto do tipo professor e instanciando 
		Professor jose = new Professor();
		jose.setNome("José aparecido");
		jose.setCpf("12344");
		jose.setSalario(1444.00);
		jose.setMateria("Matemática");
		
		jose.mostrarDados();
		System.out.println("\n");
		jose.exibe();
	}

}
