package threeway.projeto.service.conexao;
import java.sql.*;

public class FabricaConexao {
	
	static String url = "jdbc:postgresql://localhost:5432/threeway";
	static String usuario = "postgres";
	static String senha = "pgsq1@Rez";
	
	public static Connection getConexao() throws SQLException{
		try{
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection(url,usuario,senha);
		}catch(ClassNotFoundException e){
			throw new SQLException(e.getMessage());
		}
	}
	
}
