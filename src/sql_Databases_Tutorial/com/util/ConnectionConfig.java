package sql_Databases_Tutorial.com.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionConfig {

    private static String username = "";
    private static String password = "";
    private static String url = "jdbc:mysql://localhost/test";
    private static Connection connection;


    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("connected");
        } catch (SQLException ex) {
            // log an exception. for example:
            ex.printStackTrace();
        }

        return connection;
    }
}