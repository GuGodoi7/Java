package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		
		float a = 0f, b = 0f, c = 0f, delta = 0f;
		double x1 = 0f, x2 = 0f;
		String aux;
		
		try {
			aux = JOptionPane.showInputDialog("Informe o valor A: ");
			a = Float.parseFloat(aux);
			aux = JOptionPane.showInputDialog("Informe o valor de B: ");
			b = Float.parseFloat(aux);
			aux = JOptionPane.showInputDialog("informe o valor de C: ");
			c = Float.parseFloat(aux);
			
			delta = b * b - 4 * a * c;
			
			x1 = (-b + (Math.sqrt(delta))) / (2 * a);
			
			x2 = (-b - (Math.sqrt(delta))) / (2 * a);
			
			JOptionPane.showMessageDialog(null, "O valor de x1  é " + x1 + " o valor de x2 é: " + x2);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "erro");
		}
	}

}
