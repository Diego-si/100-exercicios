package exemplo07;

/**
 * Classe para armazenar os atributos e m�todos do objeto Data
 *
 * @author Diego Almeida da Silva
 * @since 17 de fev. de 2021
 */
public class Data {

	//declarando os atributos
	private int dia;
	private int mes;
	private int ano;
	
	// m�todos getter e setter para acesso aos atributos
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
	
	// calcular a faixa etaria 
	public String faixaEtaria() {
		if ((2021 - ano) >= 18) {
			return "Maior de idade";
		} else {
			return "Menos de idade";
		}
	}
}
