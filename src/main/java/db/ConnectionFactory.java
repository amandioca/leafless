
 import java.sql.Connection;
 import java.sql.DriverManager;

    public class ConnectionFactory {

        private static String host = "localhost";
        private static String porta = "3306";
        private static String db = "seubd";
        private static String usuario = "seusuario";
        private static String senha = "suasenha";

        public static Connection obterConexao() throws Exception {
            String url = String.format(
                    "jdbc:mysql://%s:%s/%s",
                    host,
                    porta,
                    db
            );
            return DriverManager.getConnection(url, usuario, senha);
        }
    }