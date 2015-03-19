package financeiro;

import financeiro.Conexao;

import javax.swing.*;

public class Financeiro {

	public static void main(String[] args) {
		
		Conexao.Conectar();
		
		JOptionPane.showMessageDialog (null, Conexao.Status);
		

		frmLogin frmLogin = new frmLogin();
		frmLogin.setVisible(true); 
		
		JOptionPane.showMessageDialog (null, "Fim da aplicação");

	}

}
