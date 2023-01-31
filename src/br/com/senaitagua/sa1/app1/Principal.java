package br.com.senaitagua.sa1.app1; //pacote
import javax.swing.JOptionPane; //importação api que abre as janelas

import br.com.senaitagua.sa1.bo.CalculoBO;

public class Principal { //classe
	
	
	//metodo main - é um metodo principal para executar o progama
	public static void main(String[] args) { //inicio
		
		// TODO Auto-generated method stub
		double valor1, valor2;
		
		JOptionPane.showMessageDialog(null, "Empresa Voe - Grupo Empresarial");
		
		//entrada de dados
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor o valor do primeiro avião: ")
				);
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor o valor do segundo avião: ")
				);
		
		//passar uma mensagem (metodo) para o objeto
		CalculoBO cbo = new CalculoBO();
		
		//utilizar o objeto
		
		
		JOptionPane.showMessageDialog(null, cbo.somar(valor1, valor2));
		
		

	}//fim

}
