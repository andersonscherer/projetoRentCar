package ConexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoUtil {

	private static Connection connection;
	
	static {
		String endereco = "jdbc:mysql://localhost:3306/projetofinal";
		String usuario = "root";
		String senha = "cocacola1995";
		try {
			connection = DriverManager.getConnection(endereco, usuario, senha);
			System.out.println("Conectado com sucesso");
			
		} catch (SQLException e) {
			System.out.println("Erro ao conectar no banco");
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public static Connection conectar() {
		return connection;
	}
}