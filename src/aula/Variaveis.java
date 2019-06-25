package aula;

import javax.swing.JOptionPane;

public class Variaveis {

	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
			
			// TODO Auto-generated method stub
			System.out.println("i = " + i);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
