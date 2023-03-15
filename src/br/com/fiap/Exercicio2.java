package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
	  float base = 0f, altura = 0f, area = 0f;
	  String aux;
	  
	  try {
		aux = JOptionPane.showInputDialog("Informe o valor da base: ");
		base = Float.parseFloat(aux);
		aux = JOptionPane.showInputDialog("Informe a altura: ");
		altura = Float.parseFloat(aux);
		area = (base * altura) / 2;
		JOptionPane.showMessageDialog(null, "a area é " + area);
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "algo deu errado");
	}

	}

}
