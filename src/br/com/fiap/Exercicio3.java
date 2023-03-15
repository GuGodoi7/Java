package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
	 
		float baseMaior = 0f, baseMenor = 0f, altura = 0f, area = 0f;
		String aux;
		
		try {
			aux = JOptionPane.showInputDialog("informe o valor da baseMaior");
			baseMaior = Float.parseFloat(aux);
			aux = JOptionPane.showInputDialog("infor a baseMenor: ");
			baseMenor = Float.parseFloat(aux);
			area = (baseMaior + baseMenor) * altura /2;
			JOptionPane.showMessageDialog(null, " o valor da area é " + area);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Algo deu errado ");
		}
}
}
