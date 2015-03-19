package financeiro;

import java.sql.*;

public class Conexao {
	
	public static String Status = "";
	public static Connection conexao = null;
	
	public static Connection Conectar() {
		
		// objeto da conexão
		Connection con = null;
		
		try {
			
			// driver de conexão com o mysql
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			String url = "jdbc:mysql://localhost/financeiro?user=root&password=admin";
			
			con = DriverManager.getConnection(url);
			
			Status = "Conexão efetuada com sucesso.";
					
		} catch (SQLException e) {
			Status = e.getMessage();
		} catch (ClassNotFoundException e) {
			Status = e.getMessage();
		} catch (Exception e){
			Status = e.getMessage();
		}
		
		// retorno do método
		conexao = con;
		return con;
		
	};
	
}
