package br.com.fiap;

import javax.swing.JOptionPane;

public class exercicio1 {

	public static void main(String[] args) {
		
		float base = 0f, altura = 0f, area =0f;
		String aux;
		try {		
		aux = JOptionPane.showInputDialog("digite a altura: ");
		altura = Float.parseFloat(aux);
		aux = JOptionPane.showInputDialog("digite o valor da bese: ");
		base = Float.parseFloat(aux);
		area = base * altura;
		JOptionPane.showMessageDialog(null, "o valor da area é " + area);
		
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, " algo deu errado * _ *");
		}
	}
}