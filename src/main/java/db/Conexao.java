package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author wellersonelucas
 */
public class Conexao {
<<<<<<< HEAD
    public static Connection fazConexao() throws SQLException{
        System.out.println("");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/db_leafless", "root","lusim123");
        }catch(ClassNotFoundException e){
            throw new SQLException(e.getException());
        }
    }
}
=======
	public static Connection fazConexao() throws SQLException {
		System.out.println("");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/db_leafless", "root", "root");
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getException());
		}
	}
}
>>>>>>> 9a53e50fc9f5b4b61f866e7f3fab598d68c626f0
