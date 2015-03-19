package control;

import financeiro.Conexao;
import model.Usuario;

import java.sql.*;

import javax.swing.JOptionPane;

public class UsuarioController {
	
	private String SQL_INSERT = "INSERT INTO TBL_USUARIO("
			                   // + "  ID_USUARIO,"
			                   + "  NM_USUARIO,"
			                   + "  NM_SENHA)"
			                   + "VALUES("
			                   // + "  ?,"
			                   + "  ?,"
			                   + "  ?);";
	
	private String SQL_UPDATE = "UPDATE TBL_USUARIO     "
		                       + "   SET NM_USUARIO = ?, "
		                       + "       NM_SENHA   = ?  "
		                       + " WHERE ID_USUARIO = ?; ";
	
	private String SQL_DELETE = "DELETE FROM TBL_USUARIO WHERE ID_USUARIO = ?; ";
	
	
	public void Incluir(Usuario usuario){
		
		try {
			PreparedStatement ps = Conexao.conexao.prepareStatement(SQL_INSERT.toString());
			
			ps.setString(1, usuario.nm_usuario);
			ps.setString(2, usuario.nm_senha);
			
			ps.executeQuery();
		}
		catch(SQLException e){
			JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	
	public void Atualizar(Usuario usuario){
		try{
			PreparedStatement ps = Conexao.conexao.prepareStatement(SQL_UPDATE);
			
			ps.setString(1, usuario.nm_usuario);
			ps.setString(2, usuario.nm_senha);
			ps.setInt(3, usuario.id_usuario);
			
			ps.executeQuery();
		}
		catch(SQLException e){
			JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	public void Deletar(Usuario usuario){
		
		try{
			
			PreparedStatement ps = Conexao.conexao.prepareStatement(SQL_DELETE);
			
			ps.setInt(1, usuario.id_usuario);
			
			ps.executeQuery();
		}
		catch(SQLException e){
			JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}

}