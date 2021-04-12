package exemplo09;

/**
 * Classe para armazenar os atributos e metodos do objeto secretaria e herdar de funcionario
 *
 * @author Diego Almeida da Silva
 * @since 23 de fev. de 2021
 */
public class Secretaria extends Funcionario {

	//atributos de funcionaria
	private int ramal;

	//metodos para acesar o atributo
	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
	//método para exibir os dados
	public void exibiSecretaria() {
		super.mostrarDados();
		System.out.println("Ramal: " + ramal);
	}
}
