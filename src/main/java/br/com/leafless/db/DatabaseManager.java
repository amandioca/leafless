package br.com.leafless.db;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseManager {

    private static final String DB_URL = "jdbc:mysql://localhost/db_leafless";
    private static final String DB_USNAME = "root";
    private static final String DB_PWORD = "root";
    private static final String PATH_SCRIPT = "/scripts/create-db_leafless.sql";
    private static final String CREATE_DB_SCRIPT = readScriptFromFile();

    static {
        setupDatabase();
    }

    /**
     * Conecta banco de dados.
     */
    public static Connection connectToDatabase() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(DB_URL, DB_USNAME, DB_PWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("Driver do banco de dados não encontrado: " + e.getMessage());
            throw new SQLException(e.getException());
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            throw new SQLException();
        }
    }

    /**
     * Verifica existência do banco de dados, caso não exista, faz a criação.
     */
    public static void setupDatabase() {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USNAME, DB_PWORD); Statement statement = connection.createStatement()) {

            ResultSet resultSet = connection.getMetaData().getCatalogs();
            boolean databaseExists = false;
            while (resultSet.next()) {
                String databaseName = resultSet.getString(1);
                if ("db_leafless".equalsIgnoreCase(databaseName)) {
                    databaseExists = true;
                    break;
                }
            }

            if (!databaseExists) {
                statement.executeUpdate(CREATE_DB_SCRIPT);
                System.out.println("Banco de dados criado com sucesso!");
            } else {
                System.out.println("Banco de dados já existe.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao verificar ou criar o banco de dados: " + e.getMessage());
        }
    }

    /**
     * Recupera e faz a leitura do conteúdo do script para a criação do banco de
     * dados
     *
     * @return String
     */
    private static String readScriptFromFile() {
        StringBuilder sb = new StringBuilder();

        try (InputStream is = DatabaseManager.class.getResourceAsStream(PATH_SCRIPT); Scanner scanner = new Scanner(is)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}
