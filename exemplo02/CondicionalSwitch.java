package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar o programa switch
 * 
 * @author Diego Silva
 * @since 08/02/2021
 */
public class CondicionalSwitch {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		//declarando as variaveis 
		int mes;
		
		//capturando os dados do usuario
		mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mes: "));
		
		//exibindo o mes escolhido pelo usuario
		switch (mes) {
		case 1: {
			JOptionPane.showMessageDialog(null, "Mes escolhido - Janeiro");
			break;
		}
		case 2: {
			JOptionPane.showMessageDialog(null, "Mes escolhido - Fevereiro");
			break;
		}
		case 3: {
			JOptionPane.showMessageDialog(null, "Mes escolhido - Março");
			break;
		}
		case 4: {
			JOptionPane.showMessageDialog(null, "Mes escolhido - Abril");
			break;
		}
		case 5: {
			JOptionPane.showMessageDialog(null, "Mes escolhido - Maio");
			break;
		}
		case 6: {
			JOptionPane.showMessageDialog(null, "Mes escolhido - Junho");
			break;
		}
		case 7: {
			JOptionPane.showMessageDialog(null, "Mes escolhido - Julho");
			break;
		}
		case 8: {
			JOptionPane.showMessageDialog(null, "Mes escolhido - Agosto");
			break;
		}
		case 9: {
			JOptionPane.showMessageDialog(null, "Mes escolhido - Setembro");
			break;
		}
		case 10: {
			JOptionPane.showMessageDialog(null, "Mes escolhido - Outubro");
			break;
		}
		case 11: {
			JOptionPane.showMessageDialog(null, "Mes escolhido - Novembro");
			break;
		}
		case 12: {
			JOptionPane.showMessageDialog(null, "Mes escolhido - Dezembro");
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, "Não consta no calendário!");
		}
	}
}
