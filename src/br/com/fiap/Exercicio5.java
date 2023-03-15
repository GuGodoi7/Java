package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		double salarioBrut = 0, salarioLiq = 0, salarioNovo = 0, salario = 0, inss = 0, irpf = 0, plano = 0;
		String aux;
		
		try {
			aux = JOptionPane.showInputDialog("Informe o salario: ");
			salario = Double.parseDouble(aux);
			salarioNovo = salario + salario * 0.15;
			JOptionPane.showMessageDialog(null, "O valor do salarioNovo é: " + salarioNovo);
			inss = salarioNovo * 0.11;
			irpf = salarioNovo * 0.07;
			plano = 149;
			salarioLiq = salarioNovo - inss - irpf - plano;
			JOptionPane.showMessageDialog(null, "Folha de Pagamento" + "\nsalario Bruto " + salarioNovo + "\nDesconto inss " + inss + "\nDesconto irpf " + irpf + "\nDesconto Plano de saude" + plano + "\nSalarioLiquido" + salarioLiq);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
