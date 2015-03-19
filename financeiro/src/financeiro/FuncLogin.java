package financeiro;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import financeiro.Conexao;

public class FuncLogin {
	
	public static boolean Login(String Usuario, String Senha){
		
		try {
			Statement st = Conexao.conexao.createStatement();
			
			String sql = "select id_usuario, "
			           + "       nm_usuario, "
					   + "       nm_senha    "
			           + "  from tbl_usuario "
			           + " where nm_usuario = \"" + Usuario + "\"";
			
			ResultSet rs = st.executeQuery(sql);
			
			// verifica se localizou o usuário
			if (rs.next()){
				
				// verifica se a senha está correta
				if (Senha.equals(rs.getString("nm_senha"))) {
					return true;
				} else {
					JOptionPane.showMessageDialog(null, "Senha inválida.", "Login", JOptionPane.WARNING_MESSAGE);
					
					return false;
				}
				
			}
			else{
				// usuário não localizado
				JOptionPane.showMessageDialog(null, "Usuário não localizado.", "Login", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

}